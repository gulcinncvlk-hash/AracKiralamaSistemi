package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- ARAÇ KİRALAMA SİSTEMİ BAŞLATILIYOR ---\n");

        // 1. Galeri (Envanter) Oluşturalım
        ArabaEnvanteri galeri = new ArabaEnvanteri();

        // 2. Arabaları Üretelim (Polimorfizm: Araba türünde referanslar)
        Araba fiat = new BenzinliAraba("Fiat", "Egea", 1000);
        Araba tesla = new ElektrikliAraba("Tesla", "Model Y", 2000);
        Araba togg = new ElektrikliAraba("TOGG", "T10X", 1800);

        // 3. Arabaları Galeriye Ekleyelim
        galeri.arabaEkle(fiat);
        galeri.arabaEkle(tesla);
        galeri.arabaEkle(togg);

        // 4. Listeyi Görelim (Envanter Testi)
        // Bu metot, envanterdeki tüm araçları ekrana yazar
        galeri.araclariListele();

        System.out.println("\n--- KİRALAMA TESTİ ---");
        // Fiat Egea'yı 3 gün kiralayalım (3 * 1000 = 3000 TL)
        System.out.println("Fiat Egea 3 Günlük Kira: " + fiat.calculateRentalFee(3) + " TL");

        // TOGG'u 3 gün kiralayalım (3 * 1800 * 0.8 = 4320 TL - İndirimli)
        System.out.println("TOGG 3 Günlük Kira (Elektrikli İndirimi): " + togg.calculateRentalFee(3) +"TL");
      }
}
