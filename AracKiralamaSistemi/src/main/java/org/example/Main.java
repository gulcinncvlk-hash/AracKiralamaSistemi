package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- ARAÇ KİRALAMA SİSTEMİ TESTİ ---\n");

        // 1. Benzinli Araba Üretelim (Günlük 1000 TL)
        Araba benzinli = new BenzinliAraba("Fiat", "Egea", 1000);

        System.out.println("Araç: " + benzinli.getMarka() + " " + benzinli.getModel());
        System.out.println("Yakıt Türü: Benzinli");
        // 3 Günlük kiralayalım (1000 * 3 = 3000 TL olmalı)
        System.out.println("3 Günlük Ücret: " + benzinli.calculateRentalFee(3) + " TL");

        System.out.println("\n----------------------------------\n");

        // 2. Elektrikli Araba Üretelim (Günlük 2000 TL)
        Araba elektrikli = new ElektrikliAraba("Tesla", "Model Y", 2000);

        System.out.println("Araç: " + elektrikli.getMarka() + " " + elektrikli.getModel());
        System.out.println("Yakıt Türü: Elektrikli");
        // 3 Günlük kiralayalım. Normalde 6000 TL ama %20 indirimle 4800 TL olmalı!
        System.out.println("3 Günlük Ücret (İndirimli): " + elektrikli.calculateRentalFee(3) +"TL");
    }
}
