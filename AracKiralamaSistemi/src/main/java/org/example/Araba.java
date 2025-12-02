package org.example;

public class Araba {package org.example;

    public abstract class Araba implements Rentable {
        private int id;
        private String marka;
        private String model;
        private double gunlukKiralamaUcreti;
        private static int sayac = 1;

        public Araba(String marka, String model, double gunlukKiralamaUcreti) {
            this.id = sayac++;
            this.marka = marka;
            this.model = model;
            this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
        }

        public int getId() { return id; }
        public String getMarka() { return marka; }
        public String getModel() { return model; }
        public double getGunlukKiralamaUcreti() { return gunlukKiralamaUcreti; }
    }

}
