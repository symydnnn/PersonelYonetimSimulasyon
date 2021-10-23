package management;

public class Personel {

    private int id;
    private String ad;
    private String soyad;
    private String departman;
    private int maas;
    private int calismaYili;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getCalismaYili() {
        return calismaYili;
    }

    public void setCalismaYili(int calismaYili) {
        this.calismaYili = calismaYili;
    }

    public Personel(int id, String ad, String soyad, String departman, int maas, int calismaYili) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.departman = departman;
        this.maas = maas;
        this.calismaYili = calismaYili;
    }
    
    public void bilgilerigoster(){
        
        System.out.println("İsim :" + ad);
        System.out.println("Maaş :" + maas);
        System.out.println("Departman :" + departman);
        System.out.println("Çalışmaya Başladığı Yıl: "+ calismaYili);
    }
    

}
