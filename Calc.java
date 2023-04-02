import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0; 
        int num2=0;
        int diff=0;
        int sum=0;
        int div=0;
        int mul=0;
        int choice;
        do{
        System.out.println("\n===================================\n");
        System.out.println(":: Simple Calculator Program in Java ::\n");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
        System.out.println("===================================\n");
        System.out.println("\t Choose Your Operation :\n");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("\n You Choose Addition \n");
                System.out.print(":: Enter Your First Integer :: ");
                num1 = sc.nextInt();
                System.out.print(":: Enter Your Second Integer :: ");
                num2 = sc.nextInt();
                sum = num1 + num2;
                System.out.println("Addition: " + sum);
                break;
            case 2:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.print(":: Enter Your First Integer :: ");
                num1 = sc.nextInt();
                System.out.print(":: Enter Your Second Integer ::");
                num2 = sc.nextInt();
                diff = num1 - num2;
                System.out.println("Difference: " + diff);
                break;
            case 3:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.print(":: Enter Your First Integer :: ");
                num1 = sc.nextInt();
                System.out.print(":: Enter Your Second Integer :: ");
                num2 = sc.nextInt();
                mul = num1 * num2;
                System.out.println("Multiplication: " + mul);
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print(":: Enter Your First Integer :: ");
                num1 = sc.nextInt();
                System.out.print(":: Enter Your Second Integer :: ");
                num2 = sc.nextInt();
                div = num1 / num2;
                System.out.println("Division: " + div);
                break;
            case 5:
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Thank you for using the program");
                System.exit(choice);
            default:
                System.out.println("Invalid Choice: ");
                break;
        }
        // System.out.print("\033[H\033[2J");  
        // System.out.flush(); 
        }while(choice != 5);
        // Close the scanner
        sc.close();
    }
}
