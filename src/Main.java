import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KUTUPHANE YONETIM SISTEMI TEST BASLADI ===");

        
        kitap kitap1 = new kitap("Sefiller", "Victor Hugo", "978975", 1862, "Mevcut");
        KitapKopyasi kopya1 = kitap1.kopyaEkle("BARKOD-001");
        KitapKopyasi kopya2 = kitap1.kopyaEkle("BARKOD-002");

        System.out.println("Kitap: " + kitap1.getKitapInfo());
        System.out.println("Kopya 1 Durumu: " + kopya1.getDurum());

      
        uye ogrenci = new uye(101, "Fatma Zehra", "zehra@mail.com", "1234");
        kutuphanegorevlisi gorevli = new kutuphanegorevlisi(201, "Buse Cinar", "buse@mail.com", "admin123");

        System.out.println("\nUye: " + ogrenci.getAd() + " (ID: " + ogrenci.getID() + ")");
        System.out.println("Gorevli: " + gorevli.getAd() + " (ID: " + gorevli.getID() + ")");


        if (kopya1.oduncVer()) {
            Date bugun = new Date();
            Date sonTarih = new Date(bugun.getTime() + (14L * 24 * 60 * 60 * 1000)); // 14 gun sonra
            OduncKaydi kayit = new OduncKaydi(1, bugun, sonTarih, kopya1, ogrenci);

            System.out.println("\n[Islem] Odunc kaydi olusturuldu!");
            System.out.println("Kitap Kopyasi Yeni Durum: " + kopya1.getDurum());
            System.out.println("Odunc Alan: " + kayit.getUye().getAd());

            
            
            kayit.teslimEt();
            System.out.println("[Islem] Kitap teslim edildi.");
            System.out.println("Kitap Kopyasi Son Durum: " + kopya1.getDurum());
        }

        System.out.println("\n=== TEST BASARIYLA TAMAMLANDI ===");
    }
}