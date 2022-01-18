package memorygamenikola;

public class DugmePress {

    public Dugme dugmepress1;
    public Dugme dugmepress2;
    public Dugme dugme;
    public int pogodak = 0;

    public Dugme getDugmepress1() {
        return dugmepress1;
    }

    public Dugme getDugmepress2() {
        return dugmepress2;
    }

    public Dugme getDugme() {
        return dugme;
    }

    public int getPogodak() {
        return pogodak;
    }

    public void setDugmepress1(Dugme dugme) {
        this.dugmepress1 = dugme;
    }

    public void setDugmepress2(Dugme dugme) {
        this.dugmepress2 = dugme;
    }

    public void setDugme(Dugme dugme) {
        this.dugme = dugme;
    }

    public void setPogodak(int p) {
        this.pogodak = p;
    }

    public DugmePress() {
    }

}
