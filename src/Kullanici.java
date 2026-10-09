public class Kullanici {
    private int ID;
    private String ad;
    private String eposta;
    private String sifre;

    public Kullanici(int ID, String ad, String eposta, String sifre) {
        this.ID = ID;
        this.ad = ad;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}