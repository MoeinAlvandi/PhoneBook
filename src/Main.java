import jdk.dynalink.Operation;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("-----Welcome to Phone Book Application-----");
        System.out.println("-------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        CrudOpration opration = new CrudOpration();
        System.out.println();

        System.out.println("Please choose one of the following options :");
        int ChoosesNumber=0;
while (ChoosesNumber>=0 && ChoosesNumber<7) {

    System.out.println();

    System.out.println("Please choose one of the following options :");
    System.out.println();
    System.out.println("1. Show All Contact.");
    System.out.println("2. Search By Name.");
    System.out.println("3. Search By Phone.");
    System.out.println("4. Add New Contact.");
    System.out.println("5. Edit Contact.");
    System.out.println("6. Delete Contact.");
    System.out.println("7. Exit.");
    System.out.println();
    System.out.print("which option: ");
    ChoosesNumber = scanner.nextInt();

    if (ChoosesNumber > 0 && ChoosesNumber < 8) {
        switch (ChoosesNumber) {
            case 1: {
                //show all
                opration.GetAll();

                break;
            }
            case 2: {
                //search by name
                System.out.println("Search By Name");
                break;
            }
            case 3: {
                //search by phone
                System.out.print("Please Enter Phone Number (0 to cancel) : ");
                String SearchValue= scanner.next();
                if(SearchValue!="0")
                {
                   Phone phone= opration.GetByPhone(SearchValue);
                   if(phone!=null)
                       System.out.println(phone);
                   else
                       System.out.println("Not Result Found.");
                }
                break;
            }
            case 4: {
                //add
                System.out.println("Add New Contact");
                break;
            }
            case 5: {
                //edit
                System.out.println("Edit Contact");
                break;
            }
            case 6: {
                //delete
                System.out.println("Delete Contact");
                break;
            }
            case 7: {
                //exit
                System.out.println("Thank You, GoodBy");
                break;
            }

        }

    } else {
        System.out.println("Error, Please Enter Number between 1 to 7");
    }
}//end while




    }
}