package tdd;

public class Parcel {
    public int getBonus(double scannedQuantity, int quantityDelivered){
        int bonus = 0;
        int amountPerParcel = 0;
        double collectionRate = (quantityDelivered/scannedQuantity)*100;
        if (collectionRate >= 50 && collectionRate <= 59){
            amountPerParcel = 200;
            bonus = quantityDelivered * amountPerParcel;
        }
        else if (collectionRate >= 60 && collectionRate <= 69) {
            amountPerParcel = 250;
            bonus = quantityDelivered * amountPerParcel;
        } else if (collectionRate >= 70) {
            amountPerParcel = 500;
            bonus = quantityDelivered * amountPerParcel;
        }
        return bonus;
    }


}
