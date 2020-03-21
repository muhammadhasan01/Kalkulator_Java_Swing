package ekspresi;

/**
 *
 * @author Dimas Wahyu L. - 13518069
 */
public class akarEkspresi extends ekspresi {
    private ekspresi x;
    
    public akarEkspresi() {
        this.x = new ekspresi(0);
    }
    
    public akarEkspresi(ekspresi _x) {
        this.x = _x;
    }
    
    // menghasilkan nilai pengakaran ekspresi
    public double getHasil() {
        double num = this.x.getNilai(); // isi nilai num dengan this.getNilai()
        if (num < 0) {
            // lakukan throw
            throw new ArithmeticException("Tidak bisa mengakarkan bilangan negatif");
        } else {
            return Math.sqrt(num);
        }
    }
}