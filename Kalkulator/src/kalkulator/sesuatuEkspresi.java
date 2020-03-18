// contoh dalam pengisian [...]Ekspresi.java
package kalkulator;

/**
 *
 * @author Muhammad Hasan - 13518012
 */
public class sesuatuEkspresi implements duaEkspresi {
    // memilki dua ekspresi
    private ekspresi x, y;
    
    // memilki default constructor
    public sesuatuEkspresi() {
        this.x = new ekspresi(0);
        this.y = new ekspresi(0);
    }
    
    // memiliki constructor yang menerima dua ekspresi
    public sesuatuEkspresi(ekspresi _x, ekspresi _y) {
        this.x = _x;
        this.y = _y;
    }

    /**
     *
     * @return hasil nilai dari ...
     */
    @Override
    public double getHasil() {
       double num1, num2;
       num1 = x.getNilai();
       num2 = y.getNilai();
       if (num2 == 0) {
           throw new ArithmeticException("terjadi error ini dan itu!");
       }
       return (num1 + 2 * num2);
    }
}
