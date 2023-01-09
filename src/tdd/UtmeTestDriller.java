package tdd;

public class UtmeTestDriller {

    public int purchase(int copies) {
        int amountPerCopy = 1;
        if (copies >= 1 && copies <= 4) {
            amountPerCopy = 2000;
        }
        if (copies >= 5 && copies <= 9) {
            amountPerCopy = 1800;
        }
        if (copies >= 10 && copies <= 29) {
            amountPerCopy = 1600;
        }
        if (copies >= 30 && copies <= 49) {
            amountPerCopy = 1500;
        }
        if (copies >= 50 && copies <= 99) {
            amountPerCopy = 1300;
        }
        if (copies >= 100 && copies <= 199) {
            amountPerCopy = 1200;
        }
        if (copies >= 200 && copies <= 499) {
            amountPerCopy = 1100;
        }
        if (copies >= 500) {
            amountPerCopy = 1000;
        }
        return amountPerCopy * copies;
    }







}
