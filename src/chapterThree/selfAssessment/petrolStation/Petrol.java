/*(Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String), the quantity (type int) of
the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount that calculates
the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. Write an application class named Petrol
that demonstrates the capabilities of class PetrolPurchase */

package chapterThree.selfAssessment.petrolStation;

import java.util.Scanner;

public class Petrol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PetrolPurchase petrolPurchase1 = new PetrolPurchase("Total", "liquid",0,
                197,0.02);

        System.out.println("Enter quantity of petrol to the purchased in liters: ");
        int quantity = input.nextInt();
        petrolPurchase1.setQuantity(quantity);
        int petrolQuantityPurchased = petrolPurchase1.getQuantity();

        String stationLocation = petrolPurchase1.getStationLocation();
        String typeOfPetrol = petrolPurchase1.getTypeOfPetrol();
        double pricePerLiter = petrolPurchase1.getPricePerLiter();
        double purchaseAmount = petrolPurchase1.getPurchaseAmount();

        System.out.printf("Station Location: %s%nType of Petrol: %s%nQuantity Purchased: %d%nPrice per Liter: %.3f%n%nThe amount of %dltrs of petrol " +
                "you purchased is %.3f%n",
                stationLocation,typeOfPetrol,petrolQuantityPurchased,pricePerLiter,petrolQuantityPurchased,purchaseAmount);










    }




}
