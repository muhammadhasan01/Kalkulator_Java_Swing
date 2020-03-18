package kalkulator;

/**
 *
 * @author USER
 */
public class kurangEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public kurangEkspresi() {
        
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public kurangEkspresi(ekspresi _x, ekspresi _y) {
        
    }
    
    /**
     *
     * @return hasil nilai dari pengurangan x dan y
     */
    @Override
    public double getHasil() {
       return 0;
    }
}
