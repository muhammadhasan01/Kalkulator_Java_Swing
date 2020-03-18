package kalkulator;

/**
 *
 * @author USER
 */
public class kaliEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public kaliEkspresi() {
        
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public kaliEkspresi(ekspresi _x, ekspresi _y) {
        
    }
    
    /**
     *
     * @return hasil nilai dari pengalian x dan y
     */
    @Override
    public double getHasil() {
       return 0;
    }
}
