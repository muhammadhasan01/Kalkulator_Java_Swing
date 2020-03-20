package kalkulator;

/**
 *
 * @author Radhinansyah H.G - 13518087
 */
public class kaliEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public kaliEkspresi() {
        this.x.setNilai(0);
        this.y.setNilai(0);
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public kaliEkspresi(ekspresi _x, ekspresi _y) {
        this.x.setNilai(_x.getNilai());
        this.y.setNilai(_y.getNilai());
    }
    
    /**
     *
     * @return hasil nilai dari pengalian x dan y
     */
    @Override
    public double getHasil() {
       return this.x.getNilai()*this.y.getNilai();
    }
}
