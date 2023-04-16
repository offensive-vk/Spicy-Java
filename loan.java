import java.util.*;
class Loan{
    int id;
    int account;
    int balance;
    String name;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Loan var1 = new Loan();
        var1.welcome();
        System.out.println(":: Enter Id :: ");
        var1.id = sc.nextInt();
        System.out.println(":: Enter Account No :: ");
        var1.account = sc.nextInt();
        System.out.println(":: Enter Account Balance :: ");
        var1.balance = sc.nextInt();
        System.out.println(":: Enter Your Real Name :: ");
        var1.name = sc.next();
        System.out.println("\n >> Basic Information Registered <<\n");
        var1.show();
        sc.close();
    }
    public void display(){
        
        System.out.println("================================\n");
        System.out.println("\n :: Basic Details Are As Follows :: \n");
        System.out.println("\n ID "+ id);
        System.out.println("\n Account Number : "+ account);
        System.out.println("\n Account Balance : "+ balance);
        System.out.println("\n Account Holder's Name : "+ name);
        System.out.println("\n================================\n");
    }
    public void show(){
        Scanner sc = new Scanner(System.in);
        Loan var1 = new Loan();
        System.out.println("\n Since you've Submitted Your Details for Desired Loan.\n");
        System.out.println("\nDo you want us to display your details?");
        System.out.println("Do you wish to see your loan information?\n");
        System.out.print("Type \"Y\" to Display OR \"N\" to Exit\n => Choice : ");
        String choice = sc.next();
        if(choice.equals("Y") || choice.equals("y")){
            var1.display();
        }else if(choice.equals("N") || choice.equals("n")){
            System.exit(0);
        }else{
            System.out.println("\n\tSorry, Looks like you've choosen invalid Option ! Please Try Again.\n");
            return;
        };
        sc.close();
    }
    private void welcome(){
        System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t\t");
        System.out.println("=============== >> Created By Vedansh << =================");
        System.out.println("\n====================================================");
        System.out.println("\n:: Welcome To Chintu Loan Services :: \n");
        System.out.println("In This Section You'll Have to Enter Your Basic Details as per your legal documents.\n");
        System.out.println("\t\t\t Please Proceed : ");
        System.out.println("\n-------------------------\n");
    }
}

class hloan extends Loan{
    int amount;
    int interest;
    String house; // villa/ flat/ mansion
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        hloan var1 = new hloan();

        System.out.print(":: Enter Loan Amount :: ");
        var1.amount = sc.nextInt();
        System.out.print(":: Enter Interest Rate :: ");
        var1.interest = sc.nextInt();
        System.out.print(":: Enter Your House Type :: ");
        var1.house = sc.next();
        System.out.println("\n >> Home Loan Information Registered <<\n");
        System.out.println("Do you wish to see your loan information?\n");
        System.out.print("Type \"Y\" to Display OR \"N\" to Exit\n => Choice : ");
        String choice = sc.next();
        if(choice.equals("Y") || choice.equals("y")){
            var1.h_display();
        }else if(choice.equals("N") || choice.equals("n")){
            System.exit(0);
        }else{
            return;
        };
        sc.close();
    }
    public void h_display(){
        System.out.println("================================\n");
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
        String choice;
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
        System.out.println("Do you wish to see your loan information?\n");
        System.out.print("Type \"Y\" to Display OR \"N\" to Exit\n => Choice : ");
        choice = sc.next();
        if(choice.equals("Y") || choice.equals("y")){
            var1.v_display();
        }else if(choice.equals("N") || choice.equals("n")){
            System.exit(0);
        }else{
            return;
        };
        sc.close();
    }
    public void v_display(){
        System.out.println("================================\n");
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
        String choice;
        System.out.println(":: Enter Your College Name :: ");
        var1.college = sc.nextLine();
        System.out.println(":: Enter SId :: ");
        var1.sid = sc.nextInt();
        System.out.println(":: Enter Fees :: ");
        var1.fees = sc.nextInt();
        System.out.println(":: Enter Scholarship Amount :: ");
        var1.scholarship = sc.nextInt();
        System.out.println("\n >> Student Loan Information Registered <<\n");
        System.out.println("\n================================\n");
        System.out.println("Do you wish to see your loan information?\n");
        System.out.print("Type \"Y\" to Display OR \"N\" to Exit\n => Choice : ");
        choice = sc.next();
        if(choice.equals("Y") || choice.equals("y")){
            var1.s_display();
        }else if(choice.equals("N") || choice.equals("n")){
            System.exit(0);
        }else{
            return;
        };
        sc.close();
    }
    public void s_display(){
        System.out.println("================================\n");
        System.out.println("\n :: Student Loan Details Are As Follows :: \n");
        System.out.println("\n College Name : "+ college);
        System.out.println("\n Student Id Number : "+ sid);
        System.out.println("\n Total Fees : "+ fees);
        System.out.println("\n Total Scholarship Amount : "+ scholarship);
        System.out.println("\n================================\n");
    }
}
