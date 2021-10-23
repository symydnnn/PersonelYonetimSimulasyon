package management;

public class Main {
    public static void main(String[] args) {
        
        Yonetim yonetici = new Yonetim(3, "Busra", "AYDIN", "Insan Kaynaklari Muduru", 0, 2020);
        Personel personel = new Personel(1, "Seyma", "Aydın", "IT", 3500, 2003);
        Personel personel1 = new Personel(2, "Turkan", "Aydın", "Muhasebe", 2800, 2015);
        
        yonetici.zamYap(personel);
        System.out.println();
        yonetici.personelBilgileriGoster(personel);
                
    }
    
 
}
