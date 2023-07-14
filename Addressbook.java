package assignment;

import java.util.Scanner;

public class Addressbook {
    public static void main(String[] args) {
        Scanner bc = new Scanner(System.in);
        String[][] addressbooks = new String[200][8];
        addressbooks[0][0] = "Mobile Number";
        addressbooks[0][1] = "First Name";
        addressbooks[0][2] = "Last Name";
        addressbooks[0][3] = "Address";
        addressbooks[0][4] = "City";
        addressbooks[0][5] = "State";
        addressbooks[0][6] = "zip";
        addressbooks[0][7] = "Email";
        addressbooks[1][0] = "123456";
        addressbooks[1][1] = "Seema";
        addressbooks[1][2] = "Verma";
        addressbooks[1][3] = "Panvel";
        addressbooks[1][4] = "Navi mumbai";
        addressbooks[1][5] = "Maharashtra";
        addressbooks[1][6] = "410206";
        addressbooks[1][7] = "sv602178@gmail.com";
        System.out.println("Welcome to my address book!");
        System.out.println("\n");
        System.out.println("n1 - Insert a New Contact \n2 - Search Contact by Last Name \n3 - Delete Contact \n4 - Show All Contacts");
//        System.out.println("\n");
        System.out.println("\n Choose your option:");
        int option = bc.nextInt();
        if (option == 1) {
            System.out.println("\n Please enter your first name:"+addressbooks[1][0]);
        }
        if (option == 2) {
            System.out.println("\n Please enter your last name:"+addressbooks[1][2]);
        }
        if (option == 3) {
            System.out.println("\n Please enter your addess:"+addressbooks[1][3]);
        }
        if (option == 4) {
            System.out.println(addressbooks[1][0]+"   "+addressbooks[1][1]+" "+addressbooks[1][2] +" "+ addressbooks[1][3]+" "+addressbooks[1][4]+" "+ addressbooks[1][5]+" "+addressbooks[1][6]+" "+ addressbooks[1][7]);
        }
        if (option==5)
        {
            
        }
    }
}



