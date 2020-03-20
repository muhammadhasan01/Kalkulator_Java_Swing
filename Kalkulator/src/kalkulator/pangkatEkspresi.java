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
        this.x = new ekspresi(0);
        this.y = new ekspresi(0);
    }
    
    // memiliki constructor yang menerima dua ekspresi
    public pangkatEkspresi(ekspresi _x, ekspresi _y) {
        this.x = _x;
        this.y = _y;
    }

    /**
     *
     * @return hasil nilai dari ...
     */
    @Override
    public double getHasil() {
       return Math.pow(this.x.getNilai(), this.y.getNilai());
    }
}