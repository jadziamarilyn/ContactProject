package MyProject;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
            ContactDetails contacts = new ContactDetails();
            int personid=1;
        while (true) {
            System.out.println("1.Create Contact");
            System.out.println("2.Update Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.List Contact");
            System.out.println("5.View Contact");
            System.out.println("6.Exit");
            System.out.println("Enter your input");
            Scanner obj = new Scanner(System.in);
            String input = (obj.nextLine());
            switch (input) {
                case "1":
                    contacts.createcontact(personid);
                    personid=personid+1;
                    break;
                case "2":
                    contacts.updatecontact();
                    break;
                case "3":
                    contacts.deletecontact();
                    break;
                case "4":
                    contacts.listcontact();
                    break;
                case "5":
                    contacts.viewcontact();
                    break;
                case "6":
                    System.exit(0);
                default:
                    throw new Exception("Wrong input");
            }

        }
    }
}
