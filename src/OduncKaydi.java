import java.util.Date;

public class OduncKaydi {
    private int islemNo;
    private Date oduncTarihi;
    private Date sonTeslimTarihi;
    private Date gercekTeslimTarihi;
    private KitapKopyasi kopya;
    private uye uye;

    public OduncKaydi(int islemNo, Date oduncTarihi, Date sonTeslimTarihi, KitapKopyasi kopya, uye uye) {
        this.islemNo = islemNo;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.kopya = kopya;
        this.uye = uye;
    }

    public boolean teslimEt() {
        if (this.kopya != null) {
            this.gercekTeslimTarihi = new Date();
            this.kopya.iadeAl();
            return true;
        }
        return false;
    }

    public int getIslemNo() {
        return islemNo;
    }

    public Date getOduncTarihi() {
        return oduncTarihi;
    }

    public Date getSonTeslimTarihi() {
        return sonTeslimTarihi;
    }

    public Date getGercekTeslimTarihi() {
        return gercekTeslimTarihi;
    }

    public KitapKopyasi getKopya() {
        return kopya;
    }

    public uye getUye() {
        return uye;
    }
}