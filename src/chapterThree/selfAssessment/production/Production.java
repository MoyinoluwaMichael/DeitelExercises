package chapterThree.selfAssessment.production;

import java.util.Scanner;
public class Production	{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		Material material1 = new Material("None",0);

		System.out.println("Enter item received i.e flour, sugar or milk: ");
		String materialName = input.nextLine();
		if(materialName.equalsIgnoreCase("flour")){
			material1.setName(materialName);
		}
		if(materialName.equalsIgnoreCase("sugar")){
			material1.setName(materialName);
		}
		if(materialName.equalsIgnoreCase("milk")){
			material1.setName(materialName);
		}

		System.out.println("Enter quantity received in kg");
		int receipt = input.nextInt();
		material1.receive(receipt);

		System.out.printf("\nWarehouse currently has %dkg of %s%n",material1.getStockBalance(),material1.getName());

		System.out.println("\nEnter quantity you want to supply for production:");
		int supply = input.nextInt();
		if (supply > material1.getStockBalance()){
			System.out.println("Error! Supply is higher than stock balance.");
		}
		material1.supply(supply);
		
		System.out.printf("%dkg of %s supplied successfully %n%n",supply,material1.getName());
		System.out.printf("Stock balance for %s is now %dkg%n",material1.getName(),material1.getStockBalance());









	}


}