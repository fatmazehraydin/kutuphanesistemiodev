import java.util.ArrayList;
import java.util.List;

public class kitap {
    private String ISBN;
    private String baslik;
    private String yazar;
    public int yayinyili;
    private String durum;
    private List<KitapKopyasi> kopyalar;

    public kitap(String baslik, String yazar, String ISBN, int yayinyili, String durum) {
        this.baslik = baslik;
        this.yazar = yazar;
        this.ISBN = ISBN;
        this.yayinyili = yayinyili;
        this.durum = durum;
        this.kopyalar = new ArrayList<>();
    }

    public String getKitapInfo() {
        return "Baslik: " + this.baslik + " | Yazar: " + this.yazar + " | Yayin Yili: " + this.yayinyili + " | ISBN: " + this.ISBN;
    }

    public KitapKopyasi kopyaEkle(String barkodno) {
        KitapKopyasi yeniKopya = new KitapKopyasi(barkodno, "Mevcut");
        kopyalar.add(yeniKopya);
        return yeniKopya;
    }

    public boolean oduncIste(String t) {
        System.out.println(baslik + " kitabi icin odunc talebi alindi. Talep: " + t);
        return true;
    }

    public void durumGuncelle(String yeniDurum) {
        this.durum = yeniDurum;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getBaslik() {
        return baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public String getDurum() {
        return durum;
    }

    public List<KitapKopyasi> getKopyalar() {
        return kopyalar;
    }
}