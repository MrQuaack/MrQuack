
import java.util.Scanner;
public class Group
{
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    static double j = 0.0;


    public static void option() {
        System.out.println("     XYZ BookStore");
        System.out.println("**********Menu**********");
        System.out.println("1. Books  \n2. Stationary \n3. Workstation \n4. Orders \n5. Checkout");
        System.out.print("Choose [1-4]: ");
    }
    
    public static double itemPrice(int item) {
        if (item == 1) {
            System.out.println("Harry Potter");
            itemPrice = 850.00;
        }
        if (item == 2) {
            System.out.println("Game of Thrones");
            itemPrice = 900.00;
        }
        if (item == 3) {
            System.out.println("Lord of The Rings");
            itemPrice = 700.00;
        }
        if (item == 4) {
            System.out.println("The fault in our hands");
            itemPrice = 500.00;
        }
        if (item == 5) {
            System.out.println("To all the boys I loved before");
            itemPrice = 450.00;
        }
        if (item == 6) {
            System.out.println("My life next door ");
            itemPrice = 600.00;
        }
        if (item == 7) {
            System.out.println("Geronimo Stilton ");
            itemPrice = 350.00;
        }
        if (item == 8) {
            System.out.println("Diary of a wimpy kid ");
            itemPrice = 250.00;
        }
        if (item == 9) {
            System.out.println("The cat in a hat ");
            itemPrice = 100.00;
        }
        if (item == 10) {
            System.out.println("Paint");
            itemPrice = 250.00;
        }
        if (item == 11) {
            System.out.println("Ballpen");
            itemPrice = 80.00;
        }
        if (item == 12) {
            System.out.println("Pencil");
            itemPrice = 10.00;
        }
        if (item == 13) {
            System.out.println("Crayons");
            itemPrice = 250.00;
        }
        if (item == 14) {
            System.out.println("Oil Pastel");
            itemPrice = 80.00;
        }
        if (item == 15) {
            System.out.println("Coloring Pens");
            itemPrice = 10.00;
        }
        if (item == 16) {
            System.out.println("Sharpener");
            itemPrice = 250.00;
        }
        if (item == 17) {
            System.out.println("Stapler");
            itemPrice = 80.00;
        }
        if (item == 18) {
            System.out.println("Compass");
            itemPrice = 85.00;
        }
        if (item == 19) {
            System.out.println("Headphones");
            itemPrice = 400.00;
        }
        if (item == 20) {
            System.out.println("Speakers");
            itemPrice = 850.00;
        }
        if (item == 21) {
            System.out.println("Microphone");
            itemPrice = 340.00;
        }
        if (item == 22) {
            System.out.println("Bond Paper");
            itemPrice = 60.00;
        }
        if (item == 23) {
            System.out.println("Notebooks");
            itemPrice = 50.00;
        }
        if (item == 24) {
            System.out.println("White Boards");
            itemPrice = 120.00;
        }
        if (item == 25) {
            System.out.println("Keyboard");
            itemPrice = 3000.00;
        }
        if (item == 26) {
            System.out.println("Mouse");
            itemPrice = 2500.00;
        }
        if (item == 27) {
            System.out.println("Printer");
            itemPrice = 7800.00;
        }
        return j;
    }
    

    public static double quantity() {
        System.out.print("Enter quantity:");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    
    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("\nSubtotal: " + subTotal + "\n");
        j=subTotal;
        return subTotal;
    }
    
    public static void done(double runningTotal) {
        ordering = false;
        System.out.println("\nTotal amount: " + runningTotal);
    }
    
	public static void main(String[] args) {
		int menuOption,a,b;
		int item = 0;
		input = new Scanner(System.in);
		double runningTotal = 0;
		do{
            option();
            menuOption = input.nextInt();
            switch (menuOption){
                case 1:
                System.out.println("\n**********Books**********");
                System.out.println("1. Fantasy  \n2. Romance \n3. Fiction");
                System.out.print("Choose [1-3]: ");
                a = input.nextInt();
                    
                    switch(a)
                    {
                        case 1:
                            System.out.println("\n**********Fantasy**********");
                            System.out.println("1. Harry Potter - P850\n2. Game Of Thrones - P900\n3. Lord of the Rings - P700");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 1;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 2;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 3;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("Invalid option\n");
                            }
                        break;    
                        case 2:
                            System.out.println("\n**********Romance**********");
                            System.out.println("1. The fault in our hands - P500 \n2. To all the boys I loved before - P450 \n3. My life next door - P600");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 4;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 5;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 6;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("Invalid option\n");
                            }
                        break;    
                        case 3:
                            System.out.println("\n**********Fiction**********");
                            System.out.println("1. Geronimo Stilton - P350 \n2. Diary of a Wimpy Kid - P250 \n3. The Cat in a Hat - P100");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 7;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 8;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 9;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("Invalid option\n");
                            }
                        break;
                        default:
                        System.out.println("Invalid option\n");
                    }
                break;    
                case 2:
                System.out.println("\n**********Stationary**********");
                System.out.println("1. Art & Crafts  \n2. Coloring Supplies \n3. School and Office Essentials");
                System.out.print("Choose [1-3]: ");
                a = input.nextInt();
                    
                    switch(a)
                    {
                        case 1:
                            System.out.println("\n**********Art & Crafts**********");
                            System.out.println("1. Paint - P250 \n2. Ballpen - P80 \n3. Pencil - P10");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 10;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 11;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 12;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("Invalid option\n");
                                quantity();
                            }
                        break;    
                        case 2:
                            System.out.println("\n**********Coloring Supplies**********");
                            System.out.println("1. Crayons - P120 \n2. Oil Pastel - P180 \n3. Coloring Pens - P445");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 13;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 14;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 15;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break; 
                                default:
                                System.out.println("Invalid option\n");
                            }
                        break;    
                        case 3:
                            System.out.println("\n**********School and Office Essentials**********");
                            System.out.println("1. Sharpener - P25 \n2. Stapler - P250 \n3. Compass - P85");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 16;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 17;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 18;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("**********Invalid option\n**********");
                            }
                        break;
                        default:
                        System.out.println("**********Invalid option\n**********");
                    }
                break;    
                case 3:
                    System.out.println("\n*********Workstation**********");
                    System.out.println("1. Audio/Video Accessories \n2. Home Essentials \n3. Computer Accessories");
                    System.out.print("Choose [1-3]: ");
                    a = input.nextInt();
                    
                    switch(a)
                    {
                        case 1:
                            System.out.println("\nAudio/Video Accessories");
                            System.out.println("1. Headphones - P400 \n2. Speakers - P850 \n3. Microphone - P340");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 19;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 20;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 21;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("Invalid option\n");
                                quantity();
                            }
                        case 2:
                            System.out.println("\nHome Essentials");
                            System.out.println("1. Bond Paper - P60 \n2. Notebooks - P50 \n3. White Boards - P120");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 22;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 23;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 24;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("Invalid option\n");
                            }
                        case 3:
                            System.out.println("\nComputer Accessories");
                            System.out.println("1. Keyboard - P3000 \n2. Mouse - P2500 \n3. Printer - P7800");
                            System.out.print("Choose [1-3]: ");
                            b = input.nextInt();
                            
                            switch(b)
                            {
                                case 1:
                                   item = 25;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;   
                                case 2:
                                   item = 26;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;    
                                case 3: 
                                   item = 27;
                                   runningTotal += itemPrice(item);
                                   quantity();
                                break;
                                default:
                                System.out.println("Invalid option\n");
                            }
                    }
                break;
                case 4:
                  System.out.println("Orders: ");

                break;    
                case 5:
                    done(runningTotal);
                    System.out.print("\nInput currency: ");
                    int currency = input.nextInt();
                    
                    if (currency >= runningTotal)
                    {
                        double change = currency - runningTotal;
                        System.out.println("Payment Successful");
                        System.out.println("Change :" + change);
                    }
                    else
                    {
                        System.out.println("Sorry, your transaction cannot be processed!.");
                    }
                    
                break;    
                default:
                System.out.println("Invalid option");
            }
        }while(ordering);
        
	}
}