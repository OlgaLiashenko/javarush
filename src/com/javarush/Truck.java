package com.javarush;

public class Truck {
    int length;
    int width;
    int height;

    int weight;
    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }

    public static class BridgeOfficer {

        int maxWeight;

        public BridgeOfficer(int normalVolume) {
            this.maxWeight = normalVolume;
        }

        public void checkTruck(Truck truck) {

            if (truck.weight > maxWeight) {
                System.out.println("Разворачивайся, перевес!");
//                return false;
            } else {
                System.out.println("Порядок, проезжай!");
//                return true;
            }
        }
    }

    public static void main(String[] args) {
        Truck first = new Truck();
        first.weight = 10000;
        Truck second = new Truck();
        second.weight = 20000;

        BridgeOfficer officer = new BridgeOfficer(15000);
        System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
          officer.checkTruck(first);
       // System.out.println(canFirstTruckGo);

        System.out.println();

        System.out.println("Грузовик номер 2! А мне можно?");
        officer.checkTruck(second);
        //System.out.println(canSecondTruckGo);
    }
}
