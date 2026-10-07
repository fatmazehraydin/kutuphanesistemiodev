import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Hocanin ekranindaki gibi birden fazla kitap olusturuyoruz
        kitap kitap1 = new kitap("1234a", "Programlamaya Giris", "fatma", 2024, "Mevcut");
        kitap kitap2 = new kitap("1234aa", "Operating System", "zehra", 2024, "Mevcut");
        kitap kitap3 = new kitap("1234aaa", "Ekonomi", "Ayşe", 2023, "Mevcut");

       
        System.out.println("=== Kutuphane Kitap Listesi ===");
        System.out.println("Kitap 1 Bilgileri -> " + kitap1.getKitapInfo());
        System.out.println("Kitap 2 Bilgileri -> " + kitap2.getKitapInfo());
        System.out.println("Kitap 3 Bilgileri -> " + kitap3.getKitapInfo());
        System.out.println();

       
        KitapKopyasi kopya1 = kitap1.kopyaEkle("BARKOD-101");
        KitapKopyasi kopya2 = kitap2.kopyaEkle("BARKOD-102");

       
        Kullanici ogrenci1 = new Kullanici("U101", "Fatma Zehra", "zehramail", "12345");
        Kullanici ogrenci2 = new Kullanici("U102", "Buse Çınar", "busecinarmail", "54321");

        
        Date bugun = new Date();
        Date teslim1 = new Date(bugun.getTime() + (14L * 24 * 60 * 60 * 1000));
        Date teslim2 = new Date(bugun.getTime() + (7L * 24 * 60 * 60 * 1000));

        OduncKaydi kayit1 = new OduncKaydi("ISLEM-001", bugun, teslim1, ogrenci1, kopya1);
        OduncKaydi kayit2 = new OduncKaydi("ISLEM-002", bugun, teslim2, ogrenci2, kopya2);

      
        kayit1.kayitDetayiYazdir();
        System.out.println();
        kayit2.kayitDetayiYazdir();
    }
}