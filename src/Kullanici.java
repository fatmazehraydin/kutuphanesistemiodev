public class Kullanici {
    private String id;
    public String ad;
    private String eposta;
    public String sifre;

    public Kullanici(String id, String ad, String eposta, String sifre) {
        this.id = id;
        this.ad = ad;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public String getId() {
        return id;
    }
}