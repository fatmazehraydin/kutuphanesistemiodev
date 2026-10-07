import java.util.Date;

public class OduncKaydi {
    private String islemNo;
    public Date oduncTarihi;
    public Date sonTeslimTarihi;
    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;

    public OduncKaydi(String islemNo, Date oduncTarihi, Date sonTeslimTarihi, Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.islemNo = islemNo;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
    }

    public void kayitDetayiYazdir() {
        System.out.println("=== Odunc Kaydi Bilgisi ===");
        System.out.println("Islem No: " + islemNo);
        System.out.println("Kullanici: " + kullanici.getAd());
        System.out.println("Kitap: " + kitapKopyasi.getAitOlduguKitap().getBaslik());
        System.out.println("Barkod: " + kitapKopyasi.getBarkodno());
        System.out.println("Odunc Tarihi: " + oduncTarihi);
        System.out.println("Son Teslim Tarihi: " + sonTeslimTarihi);
    }
}