public class KitapKopyasi {
    private String barkodno;
    private kitap aitOlduguKitap;

    public KitapKopyasi(String barkodno, kitap aitOlduguKitap) {
        this.barkodno = barkodno;
        this.aitOlduguKitap = aitOlduguKitap;
    }

    public String getBarkodno() {
        return barkodno;
    }

    public kitap getAitOlduguKitap() {
        return aitOlduguKitap;
    }
    
}
