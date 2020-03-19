package kalkulator;

/**
 *
 * @author USER
 */
public class tambahEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public tambahEkspresi() {
        this.x.setNilai(0);
        this.y.setNilai(0);
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public tambahEkspresi(ekspresi _x, ekspresi _y) {
        this.x.setNilai(_x.getNilai());
        this.y.setNilai(_y.getNilai());
    }
    
    /**
     *
     * @return hasil nilai dari penjumlahan x dan y
     */
    @Override
    public double getHasil() {
       return (this.x.getNilai() + this.y.getNilai());
    }
}
