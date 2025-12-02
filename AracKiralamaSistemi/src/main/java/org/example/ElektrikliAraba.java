package org.example;

    public class ElektrikliAraba extends Araba {

        public ElektrikliAraba(String marka, String model, double gunlukKiralamaUcreti) {
            super(marka, model, gunlukKiralamaUcreti);
        }

        @Override
        public double calculateRentalFee(int days) {
            double normalFiyat = getGunlukKiralamaUcreti() * days;
            return normalFiyat * 0.8;}
    }

