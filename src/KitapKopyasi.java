public class KitapKopyasi {
    private String barkodno;
    private String durum; 

    public KitapKopyasi(String barkodno, String durum) {
        this.barkodno = barkodno;
        this.durum = durum;
    }

    public boolean oduncIste() {
        return this.durum.equalsIgnoreCase("Mevcut");
    }

    public boolean oduncVer() {
        if (oduncIste()) {
            this.durum = "Odunc Verildi";
            return true;
        }
        return false;
    }

    public boolean iadeAl() {
        this.durum = "Mevcut";
        return true;
    }

    public String getBarkodno() {
        return barkodno;
    }

    public void setBarkodno(String barkodno) {
        this.barkodno = barkodno;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}