import java.util.*;
class Loan {
    int id;
    int account;
    int balance;
    String name;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Loan var1 = new Loan();
        Loan start = new Loan();
        //loan show = new loan();
        start.start();
        System.out.println(":: Enter Id :: ");
        var1.id = sc.nextInt();
        System.out.println(":: Enter Account No :: ");
        var1.account = sc.nextInt();
        System.out.println(":: Enter Account Balance :: ");
        var1.balance = sc.nextInt();
        System.out.println(":: Enter Your Real Name :: ");
        var1.name = sc.next();
        System.out.println("\n >> Basic Information Registered <<\n");
        
        sc.close();
    }
    public void display(){
        System.out.println("\n :: Basic Details Are As Follows :: \n");
        System.out.println("\n ID "+ id);
        System.out.println("\n Account Number : "+ account);
        System.out.println("\n Account Balance : "+ balance);
        System.out.println("\n Account Holder's Name : "+ name);
        System.out.println("\n================================\n");
    }
    public void start(){
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t >> Basic Loan Information Class <<\n ");
        System.out.println("\t $Program:~ Do you want to Proceed ?\n");
        System.out.println("Type \"Yes/yes/y\" to Continue | OR \"No/Cancel/n\" To Exit\n");
        System.out.println("================================\n");
        System.out.print("\t Choice : ");
        choice = sc.next();
        if(choice.equals("Yes") || choice.equals("yes") || choice.equals("y")){
            System.out.println();
        }else if(choice.equals("No") || choice.equals("Cancel") || choice.equals("n")){
            System.out.println("\n\n\n\t\t\t\t Goodbye !");
            System.exit(0);
        }else{
            System.out.println("\n\tSorry, Looks like you've choosen invalid Option ! Please Try Again.\n");
            start();
        }
        sc.close();
    }
    public void show(){
        Scanner sc = new Scanner(System.in);
        String show;
        System.out.println("\n Since you've Submitted Your Details for Desired Loan.\n");
        System.out.println("\nDo you want us to display your details?");
        System.out.print("Type \"Y\" to Display OR \"N\" to Cancel \n=> Your Choice : ");
        show = sc.next();
        if(show == "Y" || show == "y"){
            display();
        }else if(show == "n" || show == "N"){
            System.exit(0);
        }else{
            System.out.println("\n\tSorry, Looks like you've choosen invalid Option ! Please Try Again.\n");
            show();
        }
        sc.close();
    }
}

class hloan extends Loan{
    int amount;
    int interest;
    String house; // villa/ flat/ mansion
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Loan start = new Loan();
        hloan var1 = new hloan();
        start.start();
        System.out.print(":: Enter Loan Amount :: ");
        var1.amount = sc.nextInt();
        System.out.print(":: Enter Interest Rate :: ");
        var1.interest = sc.nextInt();
        System.out.print(":: Enter Your House Type :: ");
        var1.house = sc.next();
        System.out.println("\n >> Home Loan Information Registered <<\n");
        sc.close();
    }
    public void h_display(){
        System.out.println("\n :: Home Loan Details Are As Follows :: \n");
        System.out.println("\n Loan Amount : "+ amount);
        System.out.println("\n Interest Rate : "+ interest);
        System.out.println("\n House Type : "+ house);
        System.err.println("\n================================\n");
    }
}
class vloan extends Loan{
    String company;
    String model;
    int price;
    int rate;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vloan var1 = new vloan();
        System.out.println(":: Enter Your Company Name :: ");
        var1.company = sc.nextLine();
        System.out.println(":: Enter Model :: ");
        var1.model = sc.nextLine();
        System.out.println(":: Enter Price :: ");
        var1.price = sc.nextInt();
        System.out.println(":: Enter Rate :: ");
        var1.rate = sc.nextInt();
        System.out.println("\n >> Vehicle Loan Information Registered <<\n");
        sc.close();
    }
    public void v_display(){
        System.out.println("\n :: Vehicle Loan Details Are As Follows :: \n");
        System.out.println("\n Company Name : "+ company);
        System.out.println("\n Model Number : "+ model);
        System.out.println("\n Vehicle Price : "+ price);
        System.out.println("\n Rate of Loan : "+ rate);
        System.out.println("\n================================\n");
    }
}
class sloan extends Loan{
    String college;
    int sid;
    int fees;
    int scholarship;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sloan var1 = new sloan();
        System.out.println(":: Enter Your College Name :: ");
        var1.college = sc.nextLine();
        System.out.println(":: Enter SId :: ");
        var1.sid = sc.nextInt();
        System.out.println(":: Enter Fees :: ");
        var1.fees = sc.nextInt();
        System.out.println(":: Enter Scholarship Amount :: ");
        var1.scholarship = sc.nextInt();
        System.out.println("\n >> Student Loan Information Registered <<\n");
        sc.close();
    }
    public void s_display(){
        System.out.println("\n :: Student Loan Details Are As Follows :: \n");
        System.out.println("\n College Name : "+ college);
        System.out.println("\n Student Id Number : "+ sid);
        System.out.println("\n Total Fees : "+ fees);
        System.out.println("\n Total Scholarship Amount : "+ scholarship);
        System.out.println("\n================================\n");
    }
}
