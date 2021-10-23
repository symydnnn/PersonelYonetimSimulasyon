package management;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Yonetim extends Personel{
    
    public Yonetim(int id, String ad, String soyad, String departman, int maas, int calismaYili) {
        super(id, ad, soyad, departman, maas, calismaYili);
    }
    
    public void zamYap(Personel personel) {
        int zamMiktari=0;
        Scanner gir = new Scanner(System.in);
        System.out.print("Calisan id girin: ");
        int a= gir.nextInt();
        
        if( personel.getId()==a){
            System.out.print("Çalışana yapılacak zam miktarini girin: ");
            zamMiktari = gir.nextInt();
            personel.setMaas(personel.getMaas()+zamMiktari);
            System.out.println("Calisanin maasi "+personel.getMaas()+ " olarak degistirildi.");
        } 
    }
    
    public void calismaYiliniHesapla(Personel personel){
        Date simdikiZaman = new Date();
        Calendar hesapla = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        hesapla.setTime(simdikiZaman);
        int yil = hesapla.get(Calendar.YEAR);
        System.out.println("Simdiye kadar " +(yil-personel.getCalismaYili())+" yıl calismistir");
    }
    
    public void personelBilgileriGoster(Personel personel) {
        System.out.println("İsim :" + personel.getAd());
        System.out.println("Maaş :" + personel.getMaas());
        System.out.println("Departman :" + personel.getDepartman());
        System.out.println("Çalışmaya Başladığı Yıl: "+ personel.getCalismaYili());
        calismaYiliniHesapla(personel);
    }
    
    
    
 }
   
