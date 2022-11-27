import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner record = new Scanner(System.in);
        int tenderedAmount ,cost = 0,change ;
        int numberOfItems;
        System.out.print("============================================\n");
        System.out.println("Welcome to BOB buddy shop - Kisii");
        System.out.print("============================================\n");
        System.out.print("Enter number of Items bought by customer:");
        numberOfItems=record.nextInt();
        int quantity[]= new int[numberOfItems];
        String[] itemName= new String[numberOfItems];
        int [] unitCost= new int[numberOfItems];
        int [] Cost= new int[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("*********************Item"+(i+1)+"********************\n");
            System.out.print("Enter the description of Item  "+(i+1)+":");
            itemName[i] = record.next();

               while (true) {
                System.out.print("Enter the quantity of Item"+" "+(i+1)+":");
                quantity[i] = Integer.parseInt(record.next());
                if (quantity[i] > 0)
                    break;
                System.out.println(" quantity should be greater than 0:");

            }
            while (true) {
                System.out.print("Enter the Unit Cost of Item "+(i+1)+":");
                unitCost[i] = Integer.parseInt(record.next());
                if (unitCost[i] > 0)
                    break;
                System.out.println(" Unit Cost should be greater than 0:");

            }


        }//OUT OF LOOP
        System.out.println("***************************************************\n");

        //costing them
        for (int i = 0; i <numberOfItems ; i++) {
            Cost [i]=quantity[i] * unitCost[i];
        }//OUT OF COSTING
        System.out.println("............................................\n");
        System.out.println("summary of items bought");
        System.out.println("............................................\n");

//SMART PRINTER
        coaster(numberOfItems, quantity, itemName, unitCost, Cost);

        System.out.println("............................................\n");
            for(int i=0; i<numberOfItems; i++){
                cost = cost + Cost[i];
            }
        System.out.print("The Cost of items is "+cost +"\n");
        while (true) {
            System.out.print("Enter the amount tendered by the customer   :");
            tenderedAmount = Integer.parseInt(record.next());
            if (tenderedAmount >= cost)
                break;
            System.out.println(" tenderedAmount should be equal to"+" "+cost+" more :");

        }

        change = tenderedAmount - cost;
        System.out.print("The change due to customer is "+change+"\n");

        System.out.println("Printing customer receipt!!!!! \n");
        System.out.print("============================================\n");
        System.out.println("========== BOB buddy shop - Kisii==========\n");
        System.out.print("============================================\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


//SMART PRINTER
        coaster(numberOfItems, quantity, itemName, unitCost, Cost);

    }

    private static void coaster(int numberOfItems, int[] quantity, String[] itemName, int[] unitCost, int[] cost) {
        System.out.println("QUANTITY  DESCRIPTION  UNIT-COST SUB TOTAL\n");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print(quantity[i]);
            System.out.print(" ");
            System.out.print(itemName[i] );
            System.out.print(" @ ");
            System.out.print(unitCost[i]);
            System.out.print(" = ");
            System.out.print(cost[i]);
            System.out.print("\n");
        }
    }
}


