package org.example;

import java.util.ArrayList;
import java.util.List;

    public class ArabaEnvanteri {
        // Arabaları hafızada tutacak listemiz
        private List<Araba> arabalar;

        public ArabaEnvanteri() {
            // Listeyi boş olarak başlatıyoruz
            this.arabalar = new ArrayList<>();
        }

        // Galeriye yeni araba ekleme metodu
        public void arabaEkle(Araba araba) {
            arabalar.add(araba);
            System.out.println(araba.getMarka() + " " + araba.getModel() + " envantere eklendi.");
        }

        // Tüm araçları ekrana yazdırma metodu
        public void araclariListele() {
            System.out.println("\n--- GALERİDEKİ TÜM ARAÇLAR ---");

            // Döngü ile listedeki her arabayı tek tek geziyoruz
            for (Araba araba : arabalar) {
                System.out.println("ID: " + araba.getId() +
                        " | Marka: " + araba.getMarka() +
                        " | Model: " + araba.getModel() +
                        " | Günlük: " + araba.getGunlukKiralamaUcreti() + " TL");
                        }
        }
    }


