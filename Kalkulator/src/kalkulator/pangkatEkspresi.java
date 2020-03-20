// contoh dalam pengisian [...]Ekspresi.java
package kalkulator;

/**
 *
 * @author USER
 */
public class pangkatEkspresi implements duaEkspresi {
    // memilki dua ekspresi
    private ekspresi x, y;
    
    // memilki default constructor
    // isi x = 0 dan y = 1
    public pangkatEkspresi() {
        
    }
    
    // memiliki constructor yang menerima dua ekspresi
    public pangkatEkspresi(ekspresi _x, ekspresi _y) {
        
    }

    /**
     *
     * @return hasil nilai dari ...
     */
    @Override
    public double getHasil() {
       return -1;
    }
}