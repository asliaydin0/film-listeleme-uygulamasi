
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // FilmListesi sınıfını oluştur
        filmListesi listeleme = new filmListesi();
        Scanner scanner = new Scanner(System.in);

        // Filmleri ekle
        listeleme.filmEkle(new Film("Müslüm", "Dram", "Hakan Kırvavaç", 2018));
        listeleme.filmEkle(new Film("Ayla", "Dram", "Can Ulkay", 2017));
        listeleme.filmEkle(new Film("Fetih 1453", "Aksiyon", "Faruk Aksoy", 2012));
        listeleme.filmEkle(new Film("Interstellar", "Bilim Kurgu", "Christopher Nolan", 2014));
        listeleme.filmEkle(new Film("Düğün Dernek", "Komedi", "Selçuk Aydemir", 2013));

        // Filmleri listele
        System.out.println("Tüm Filmler:");
        listeleme.filmListele();

        // İsimle arama
        System.out.println("\nArama Sonucu:");
        Film bulunanFilm = listeleme.filmAra("Ayla");
        if (bulunanFilm != null) {
            System.out.println(bulunanFilm);
        } else {
            System.out.println("Film bulunamadı!");
        }
  
        // Film silme
        System.out.println("\nSilinen Film: Düğün Dernek");
        listeleme.filmSil("Düğün Dernek");
        System.out.println("Silme sonrası filmler:");
        listeleme.filmListele();

        // Listeyi türe göre sıralama
        System.out.println("\nTürüne Göre Sıralama:");
        listeleme.filmSiralama();
        listeleme.filmListele();

        // Yıl ortalamasını hesaplama
        System.out.print("\nYıl Ortalaması:");
        System.out.printf("%.2f\n", listeleme.yilOrtalama());
        
        System.out.println("");
        
        
        // Kullanıcıdan yeni film ekleme
        System.out.print("Yeni bir film eklemek için +'ya tıklayınız: ");
        String cevap = scanner.nextLine();

        if (cevap.equalsIgnoreCase("+")) {
            System.out.print("Film adı: ");
            String isim = scanner.nextLine();

            System.out.print("Film türü: ");
            String tur = scanner.nextLine();

            System.out.print("Yönetmen: ");
            String yonetmen = scanner.nextLine();

            System.out.print("Yıl: ");
            int yil = scanner.nextInt();
            scanner.nextLine(); // Boşluğu temizlemek için

            listeleme.filmEkle(new Film(isim, tur, yonetmen, yil));
            System.out.println("Film listenize eklendi!");   
            scanner.close();
        }
        
        // Tüm Filmleri listele
        System.out.println("\nTüm Filmler:");
        listeleme.filmListele();
    }

    
} 
 
