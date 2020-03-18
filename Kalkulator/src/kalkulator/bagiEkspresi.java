package kalkulator;

/**
 *
 * @author USER
 */
public class bagiEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public bagiEkspresi() {
        
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public bagiEkspresi(ekspresi _x, ekspresi _y) {
        
    }
    
    /**
     *
     * @return hasil nilai dari pembagian x dan y
     * (jika tidak valid keluarkan -1 dan throw exception)
     */
    @Override
    public double getHasil() {
       return 0;
    }
}
