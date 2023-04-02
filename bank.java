
import java.util.*;
class Bank{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int choice;
int amt=0;
System.out.println("\n :: Enter Your Balance :: ");
int bal = sc.nextInt();
do{
System.out.println("\n :: Manish Cooperative Bank Pvt. Ltd ::\n");
System.out.println("===========================================");
System.out.println("\n\n\n\n\n\t\t\t\t\t\t");
System.out.println("\n :: 1. Deposit Amount ::\n");
System.out.println("\n :: 2. Withdraw Amount ::\n");
System.out.println("\n :: 3. Check Current Balance ::\n");
System.out.println("\n :: 4. Exit ::\n");
System.out.println("\n :: Choose Your Operation :: ");
choice = sc.nextInt();
switch(choice){
case 1:
System.out.println("\n :: Enter Your Amount To Deposit :: ");
amt = sc.nextInt();
bal = bal + amt;
System.out.println("\n :: Your Amount Has Been Deposited Sucessfully ::\n");
System.out.println("===========================================\n");
break;

case 2: 
if(bal>amt){
System.out.println("\n :: Enter Your Amount To Withdraw :: ");
int withdraw = sc.nextInt();
bal = bal - withdraw;
System.out.println("\n:: Please Collect Your Cash ::\n");
}else{
System.out.println("\n:: Sorry, Insufficient Balance In Your Account ::\n");
}
break;
case 3:
System.out.println("\n\n\n\t\t\t\t\t :: Your Current Account Balance is "+bal);
break;

case 4:
System.out.println("\n :: Thanks for Banking with Us ::\n");
System.out.println("===========================================\n");
break;

default:
System.out.println("\n :: Invalid Option !! Try Again ::\n");
System.out.println("===========================================\n");
}
}while(choice != 4);
}
}