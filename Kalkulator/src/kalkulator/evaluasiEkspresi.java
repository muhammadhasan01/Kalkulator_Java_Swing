/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Muhammad Hasan - 13518012
 */
public class evaluasiEkspresi {
    // memiliki satu buah atribut bernama masukan bertipe String
    private String masukan;
    
    // memiliki default constructor, dengan string kosong
    public evaluasiEkspresi() {
        this.masukan = "";
    }
    
    // memiliki constructor menerima satu parameter
    public evaluasiEkspresi(String inp) {
        this.masukan = inp;
    }
    
    // ubah Ans menjadi nilai yang seharusnya
    public String ubahEkspresi() {
        String hasil = "";
        for (int i = 0; i < this.masukan.length(); i++) {
            switch (this.masukan.charAt(i)) {
                case 'A':
                    hasil += Double.toString(Kalkulator.nilaiAns);
                    i += 2;
                    break;
                case '√':
                    hasil += "s";
                    break;
                default:
                    hasil += this.masukan.charAt(i);
                    break;
            }
        }
        return hasil;
    }
    
    // lakukan parse sekaligus evaluasi
    public double hasilEvaluasi() {
        String str = this.ubahEkspresi();
        if (str.equals("")) return 0.0;
     
        return new Object() {
            
            int posisi = - 1, CC;
            
            void charBerikutnya() {
                CC = (++posisi < str.length()) ? str.charAt(posisi) : -1;
            }
            
            boolean AdvChar(int chr) {
                while (CC == ' ') charBerikutnya();
                if (CC == chr) {
                    charBerikutnya();
                    return true;
                }
                return false;
            }
            
            double pecah() {
                charBerikutnya();
                double x = pecahEkspresi();
                if (posisi < str.length())
                    throw new RuntimeException("Terjadi syntax error");
                return x;
            }
            
            double pecahEkspresi() {
                double x = pecahIstilah();
                while (true) {
                    if (AdvChar('+')) {
                        x += pecahIstilah();
                    } else if (AdvChar('-')) {
                        x -= pecahIstilah();
                    } else {
                        return x;
                    }
                }
            }
            
            double pecahIstilah() {
                double x = pecahFaktor();
                while (true) {
                    if (AdvChar('*')) {
                        x *= pecahFaktor();
                    } else if (AdvChar('/')) {
                        x /= pecahFaktor();
                    } else {
                        return x;
                    }
                }
            }
            
            double pecahFaktor() {
                if (AdvChar('+')) return pecahFaktor();
                if (AdvChar('-')) return -pecahFaktor();
                
                double x;
                int startPosisi = this.posisi;
                if (AdvChar('(')) {
                    x = pecahEkspresi();
                    AdvChar(')');
                } else if ((CC >= '0' && CC <= '9') || CC == '.') {
                    while ((CC >= '0' && CC <= '9') || CC == '.') charBerikutnya();
                    x = Double.parseDouble(str.substring(startPosisi, this.posisi));
                } else if (CC >= 'a' && CC <= 'z') {
                    while (CC >= 'a' && CC <= 'z') charBerikutnya();
                    String fungsi = str.substring(startPosisi, this.posisi);
                    x = pecahFaktor();
                    if (fungsi.equals("s")) {
                        x = Math.sqrt(x);
                    } else {
                        throw new RuntimeException("Fungsi tidak diketahui : " + (char) CC);
                    }
                } else {
                    throw new RuntimeException("Terjadi syntax error");
                }
                
                if (AdvChar('^')) x = Math.pow(x, pecahFaktor());
                
                return x;
            }
        }.pecah();
    }
}
