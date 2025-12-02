package org.example;

    public class BenzinliAraba extends Araba {

        public BenzinliAraba(String marka, String model, double gunlukKiralamaUcreti) {
            super(marka, model, gunlukKiralamaUcreti);
        }

        @Override
        public double calculateRentalFee(int days) {
            return getGunlukKiralamaUcreti() * days;}
    }

