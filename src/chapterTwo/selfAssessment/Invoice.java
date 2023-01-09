package chapterTwo.selfAssessment;

import java.util.Scanner;

public class Invoice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" _______________________________________");
        System.out.println("|---------------------------------------|");
        System.out.println("|\t\t REGNOS LTD \t\t|");
        System.out.println("|\t\t  Invoice \t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("|Date: \t\t\t\t\t|");
        System.out.println("|Name of Cashier:\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("|Goods bought:\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\tGoods\t Qty\tPrice:\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|---------------------------------------|");
        System.out.println("|*Note: This invoice can only accomodate|");
        System.out.println("|3 items.\t\t\t\t|");
        System.out.println("|_______________________________________|\n");

        int smallBreadPrice = 200;
        int mediumBreadPrice = 500;
        int bigBreadPrice = 1000;

        int good1Qty = 0;
        int good2Qty = 0;
        int good3Qty = 0;

        int good1Price = 0;
        int good2Price = 0;
        int good3Price = 0;

        String date = null;
        String cashier = null;

        String good1 = null;
        String good2 = null;
        String good3 = null;

        String newInvoice;
        String newInvoice2 = null;
        String newInvoice3 = null;

        int smallNoodlesPrice = 100;
        int superPackNoodlesPrice = 250;
        int hungrymanNoodlesPrice = 500;

        int FufuPrice = 50;

        System.out.print("New invoice? (i.e yes or no): ");
        newInvoice = input.nextLine();


        if (newInvoice.equalsIgnoreCase("yes")) {

            System.out.print("Enter date (dd.mm.yyyy): ");
            date = input.nextLine();

            System.out.print("Name of cashier: ");
            cashier = input.nextLine();

       	System.out.println(" _______________________________________");
      	System.out.println("|---------------------------------------|");
       	System.out.println("|\t\tREGNOS LTD \t\t|");
       	System.out.println("|\t      Available items\t\t|");
       	System.out.println("|---------------------------------------|");
		System.out.println("|\t\t\t\t\t|");
        	System.out.println("|  Goods\t\tUnit Price\t|");
        	System.out.println("|\t\t\t\t\t|");
        	System.out.printf("|Bread (small)\t\t  %d\t\t|%n", smallBreadPrice);
       	System.out.printf("|Bread (medium)\t\t  %d\t\t|%n", mediumBreadPrice);
       	System.out.printf("|Bread (big)\t\t  %d\t\t|%n", bigBreadPrice);
       	System.out.printf("|Noodles (small)\t  %d\t\t|%n", smallNoodlesPrice);
       	System.out.printf("|Noodles (super pack)\t  %d\t\t|%n", superPackNoodlesPrice);
      	System.out.printf("|Noodles (hungry man)\t  %d\t\t|%n", hungrymanNoodlesPrice);
       	System.out.printf("|Fufu\t\t\t  %d\t\t|%n", FufuPrice);
      	System.out.println("|\t\t\t\t\t|");
        	System.out.println("|\t\t\t\t\t|");
        	System.out.println("|\t\t\t\t\t|");
        	System.out.println("|\t\t\t\t\t|");
        	System.out.println("|---------------------------------------|");
        	System.out.println("|Kindly select the items sold.\t\t|");
        	System.out.println("|_______________________________________|\n");

            System.out.printf("Welcome,%s%nName of goods (i.e bread, noodles, fufu): ", cashier);
            good1 = input.nextLine();

            if (!good1.equalsIgnoreCase("bread") && !good1.equalsIgnoreCase("noodles") && !good1.equalsIgnoreCase("fufu")) {
            System.out.println("Error! Try again");
		}

            	if (good1.equalsIgnoreCase("Bread")) {
               		System.out.print("Please enter Bread size (i.e small, medium, big): ");
                		good1 = input.nextLine();
	
                		if (!good1.equalsIgnoreCase("small") && !good1.equalsIgnoreCase("medium") && !good1.equalsIgnoreCase("big")) {
                   		System.out.println("Error! Try again");
                		}

                		if (good1.equalsIgnoreCase("small")) {
                    		good1 = "Small bread";

                    		System.out.print("How many?: ");
                    		good1Qty = input.nextInt();
                    		good1Price = good1Qty * smallBreadPrice;
                		}

               		if (good1.equalsIgnoreCase("medium")) {
                    		good1 = "Medium bread";

                    		System.out.print("How many?: ");
                    		good1Qty = input.nextInt();
		                  good1Price = good1Qty * mediumBreadPrice;
               		 }

                		if (good1.equalsIgnoreCase("big")) {
                    		good1 = "Big bread";

                    		System.out.print("How many?: ");
                    		good1Qty = input.nextInt();
                    		good1Price = good1Qty * bigBreadPrice;
                		}

            	}

           		if (good1.equalsIgnoreCase("Noodles")) {
                		System.out.print("Please enter Noodles type (i.e small, superpack, hungryman): ");
                		good1 = input.nextLine();

                		if (good1.equalsIgnoreCase("small")) {
                    		good1 = "Small Noodles";

                    		System.out.print("How many?: ");
                    		good1Qty = input.nextInt();
		                  good1Price = good1Qty * smallNoodlesPrice;
                		}

                		if (good1.equalsIgnoreCase("superpack")) {
                    		good1 = "S.pack noodles";

                    		System.out.print("How many?: ");
                    		good1Qty = input.nextInt();
                   		good1Price = good1Qty * superPackNoodlesPrice;
                		}

                		if (good1.equalsIgnoreCase("hungryman")) {
                    		good1 = "H.man noodles";

                    		System.out.print("How many?: ");
                    		good1Qty = input.nextInt();
                    		good1Price = good1Qty * hungrymanNoodlesPrice;
                		}
            	}

//2 SLOTS REMAINING****

            	System.out.print("Any other items? (i.e yes or no): ");
            	newInvoice2 = input.next();

		 	if (!newInvoice2.equalsIgnoreCase("yes") && !newInvoice2.equalsIgnoreCase("no")) {
            		System.out.println("Error! Try again");
			}

            	if (newInvoice2.equalsIgnoreCase("yes")) {
                		System.out.print("Great!\nName of goods (i.e bread, noodles, fufu): ");
                		good2 = input.next();

		 		if (!good2.equalsIgnoreCase("bread") && !good2.equalsIgnoreCase("noodles") && !good2.equalsIgnoreCase("fufu")) {
            			System.out.println("Error! Try again");
				}

                		if (good2.equalsIgnoreCase("Bread")) {
                    		System.out.print("Please enter Bread size (i.e small, medium, big): ");
                    		good2 = input.next();

                    	if (!good2.equalsIgnoreCase("small") && !good2.equalsIgnoreCase("medium") && !good2.equalsIgnoreCase("big")) {
                       		System.out.println("Error! Try again");
                    	}

                    	if (good2.equalsIgnoreCase("small")) {
                        	good2 = "Small bread";

                        	System.out.print("How many?: ");
                        	good2Qty = input.nextInt();
                        	good2Price = smallBreadPrice;
                        	good2Price = good2Qty * good2Price;
                    	}

                    	if (good2.equalsIgnoreCase("medium")) {
                        	good2 = "Medium bread";

                        	System.out.print("How many?: ");
                        	good2Qty = input.nextInt();
                       		good2Price = mediumBreadPrice;
                        	good2Price = good2Qty * good2Price;
                    	}

                    	if (good2.equalsIgnoreCase("big")) {
                        	good2 = "Big bread";

                        	System.out.print("How many?: ");
                        	good2Qty = input.nextInt();
                        	good2Price = bigBreadPrice;
                        	good2Price = good2Qty * good2Price;
                    	}
                	}

                	if (good2.equalsIgnoreCase("Noodles")) {
                  	System.out.print("Please enter Noodles type (i.e small, superpack, hungryman): ");
                    	good2 = input.next();

                    	if (!good2.equalsIgnoreCase("small") && !good2.equalsIgnoreCase("superpack") && !good2.equalsIgnoreCase("hungryman")) {
                        	System.out.println("Error! Try again");
                  	}

                    	if (good2.equalsIgnoreCase("small")) {
                        	good2 = "Small Noodles";

                        	System.out.print("How many?: ");
                        	good2Qty = input.nextInt();
                        	good2Price = smallNoodlesPrice;
                        	good2Price = good2Qty * good2Price;
                    	}

                    	if (good2.equalsIgnoreCase("superpack")) {
                        	good2 = "S.pack noodles";

                        	System.out.print("How many?: ");
                        	good2Qty = input.nextInt();
                        	good2Price = superPackNoodlesPrice;
                        	good2Price = good2Qty * good2Price;
                    	}

                    	if (good2.equalsIgnoreCase("hungryman")) {
                        	good2 = "H.man noodles";

                        	System.out.print("How many?: ");
                        	good2Qty = input.nextInt();
                        	good2Price = hungrymanNoodlesPrice;
                        	good2Price = good2Qty * good2Price;
                    	}
                	}

//1 SLOT REMAINING****

                		System.out.print("Any other goods? (i.e yes or no): ");
                		newInvoice3 = input.next();

                	if (newInvoice3.equalsIgnoreCase("yes")) {
                  	System.out.print("Great!\nName of goods (i.e bread, noodles, fufu): ");
                  	good3 = input.next();

				if (!good3.equalsIgnoreCase("bread") && !good3.equalsIgnoreCase("noodles") && !good3.equalsIgnoreCase("fufu")) {
            			System.out.println("Error! Try again");
				}
                   	if (good3.equalsIgnoreCase("Bread")) {
                        System.out.print("Please enter Bread size (i.e small, medium, big): ");
                        good3 = input.next();

                        if (!good3.equalsIgnoreCase("small") && !good3.equalsIgnoreCase("medium") && !good3.equalsIgnoreCase("big")) {
                            System.out.print("Error! Try again");
                        }

                        if (good3.equalsIgnoreCase("small")) {
                            good3 = "Small bread";

                            System.out.print("How many?: ");
                            good3Qty = input.nextInt();
                            good3Price = smallBreadPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3.equalsIgnoreCase("medium")) {
                            good3 = "Medium bread";

                            System.out.print("How many?: ");
                            good3Qty = input.nextInt();
                            good3Price = mediumBreadPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3.equalsIgnoreCase("big")) {
                            good3 = "Big bread";

                            System.out.print("How many?: ");
                            good3Qty = input.nextInt();
                            good3Price = bigBreadPrice;
                            good3Price = good3Qty * good3Price;
                        }
                    }

                    	if (good3.equalsIgnoreCase("Noodles")) {
                        System.out.print("Please enter Noodles type (i.e small, superpack, hungryman): ");
                        good3 = input.next();

                        if (!good3.equalsIgnoreCase("small") && !good3.equalsIgnoreCase("superpack") && !good3.equalsIgnoreCase("hungryman")) {
                            System.out.print("Error! Try again");
                        }

                        if (good3.equalsIgnoreCase("small")) {
                            good3 = "Small Noodles";

                            System.out.print("How many?: ");
                            good3Qty = input.nextInt();
                            good3Price = smallNoodlesPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3.equalsIgnoreCase("superpack")) {
                            good3 = "S.pack noodles";

                            System.out.print("How many?: ");
                            good3Qty = input.nextInt();
                            good3Price = superPackNoodlesPrice;
                            good3Price = good3Qty * good3Price;
                        }

                        if (good3.equalsIgnoreCase("hungryman")) {
                            good3 = "H.man noodles";

                            System.out.print("How many?: ");
                            good3Qty = input.nextInt();
                            good3Price = hungrymanNoodlesPrice;
                            good3Price = good3Qty * good3Price;
                        }
                    }

                    System.out.println(" _______________________________________");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|\t\t REGNOS LTD \t\t|");
                    System.out.println("|\t\t  Invoice \t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.printf("|Date: %s \t\t\t|%n", date);
                    System.out.printf("|Name of Cashier: %s \t\t|%n", cashier);
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|Goods bought:\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|  Goods\t\tQty\tPrice:\t|");
                    System.out.printf("|%s\t\t %d\t%d\t|%n", good1, good1Qty, good1Price);
                    System.out.printf("|%s\t\t %d\t%d\t|%n", good2, good2Qty, good2Price);
                    System.out.printf("|%s\t\t %d\t%d\t|%n", good3, good3Qty, good3Price);
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|\t\t\tTotal:\t\t|");
                    System.out.println("|_______________________________________|\n");


			}			

                if (newInvoice3.equalsIgnoreCase("no")) {
                    System.out.println(" _______________________________________");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|\t\t REGNOS LTD \t\t|");
                    System.out.println("|\t\t  Invoice \t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.printf("|Date: %s \t\t\t|%n", date);
                    System.out.printf("|Name of Cashier: %s \t\t|%n", cashier);
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|Goods bought:\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|  Goods\t\tQty\tPrice:\t|");
                    System.out.printf("|%s\t\t %d\t%d\t|%n", good1, good1Qty, good1Price);
                    System.out.printf("|%s\t\t %d\t%d\t|%n", good2, good2Qty, good2Price);
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|\t\t\t\t\t|");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|\t\t\tTotal:\t\t|");
                    System.out.println("|_______________________________________|\n");

                }
		
                if (!newInvoice3.equalsIgnoreCase("no") && !newInvoice3.equalsIgnoreCase("yes")) {
                    System.out.print("Error! Try again");
                }
            }
		
        if (newInvoice2.equalsIgnoreCase("no")) {
            System.out.println(" _______________________________________");
            System.out.println("|---------------------------------------|");
            System.out.println("|\t\t REGNOS LTD \t\t|");
            System.out.println("|\t\t  Invoice \t\t|");
            System.out.println("|---------------------------------------|");
            System.out.printf("|Date: %s \t\t\t|%n", date);
            System.out.printf("|Name of Cashier: %s \t\t|%n", cashier);
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|---------------------------------------|");
            System.out.println("|Goods bought:\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|  Goods\t\tQty\tPrice:\t|");
            System.out.printf("|%s\t\t %d\t%d\t|%n", good1, good1Qty, good1Price);
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|\t\t\t\t\t|");
            System.out.println("|---------------------------------------|");
            System.out.println("|\t\t\tTotal:\t\t|");
            System.out.println("|_______________________________________|\n");

        }
        if (!newInvoice2.equalsIgnoreCase("no") && !newInvoice2.equalsIgnoreCase("yes")) {
            System.out.print("Error! Try again");
        }

}
        


        if (newInvoice.equalsIgnoreCase("no")) {
            System.out.print("Alright, do always check back once there is/are sale(s)");
        }

        if (!newInvoice.equalsIgnoreCase("no") && !newInvoice.equalsIgnoreCase("yes")) {
            System.out.print("Error! Try again");
        }

    }
}
