package MyProject;
import java.util.HashMap;
import java.util.Scanner;
public class ContactDetails{
    HashMap<Integer,Contact> details = new HashMap<>();
    public Contact createobject(){
        System.out.println("1.Create Contact");
        System.out.println("Name : ");
        Scanner name = new Scanner(System.in);
        String personname = name.nextLine();
        System.out.println("Age : ");
        Scanner age = new Scanner(System.in);
        String personage=age.nextLine();
        System.out.println("Contact no : ");
        Scanner mobileno = new Scanner(System.in);
        String personmobileno=mobileno.nextLine();
        System.out.println("Email Id : ");
        Scanner mail = new Scanner(System.in);
        String personmail=mail.nextLine();
        Contact c = new Contact(personname,personage,personmobileno,personmail);
        return c;
    }
    public void updatecontact(){
        System.out.println("2.Update Contact");
        System.out.println("Enter ContactId:");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        updatedetails(num);
    }
    public void listcontact(){
        System.out.println("4.List Contact");
        for(Integer key : details.keySet()){
            System.out.println("ID : "+ key);
            System.out.println("Name : "+details.get(key).getName());
            System.out.println("Age : "+details.get(key).getAge());
            System.out.println("Contact no : "+details.get(key).getMobileno());
            System.out.println("Email Id : "+details.get(key).getMail());
        }
    }
    public void viewcontact(){
        System.out.println("5.View Contact");
        System.out.println("Enter the Id : ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println("Name : "+details.get(num).getName());
        System.out.println("Age :"+details.get(num).getAge());
        System.out.println("Mobile No: "+details.get(num).getMobileno());
        System.out.println("Email Id:"+details.get(num).getMail());}

    public void createcontact(int personid){
        Contact c = this.createobject();
        details.put(personid,c);
    }
    public void updatedetails(int num) {
                System.out.println("Name : " + "(" + details.get(num).getName() + ")");
                Scanner name = new Scanner(System.in);
                String personname = name.nextLine();
                if  (!personname.equals("")){
                    details.get(num).setName(personname);
                }

                System.out.println("Age : " + "(" + details.get(num).getAge() + ")");
                Scanner age = new Scanner(System.in);
                String personage = age.nextLine();
                if  (!personage.equals("")) {
                    details.get(num).setAge(personage);
                }
                System.out.println("Contact no : " + "(" + details.get(num).getMobileno() + ")");
                Scanner mobilenum = new Scanner(System.in);
                String personnum = mobilenum.nextLine();
                if  (!personnum.equals("")) {
                    details.get(num).setMobileno(personnum);
                }
                System.out.println("Email Id : " + "(" + details.get(num).getMail() + ")");
                Scanner mail = new Scanner(System.in);
                String personmail = mail.nextLine();
                if  (!personmail.equals("")) {
                    details.get(num).setMail(personmail);
                }
            }
    public void deletecontact() {
        System.out.println("3.Delete Contact");
        System.out.println("Enter the Id:");
        Scanner num = new Scanner(System.in);
        int key = num.nextInt();
        details.remove(key);
    }

    }




