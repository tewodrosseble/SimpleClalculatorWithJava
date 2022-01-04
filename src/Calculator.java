import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        System.out.println("Without math package");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fist no: ");
        double no1 = input.nextDouble();
        System.out.print("choose the type of  operator: ");
        System.out.println("\n\t1 for Addition\n\t2 for Subtraction\n\t3 for multiplication\n\t4 for division\n\t5 for reminder");
        int operation = input.nextInt();
        System.out.print("Enter the second no: ");
        double no2 = input.nextDouble();
        switch (operation){
            case 1:
                double sum = no1+no2;
                System.out.println("Sum is: "+ sum);
                break;
            case 2:
                double diff = no1-no2;
                System.out.println("Difference is : "+diff);
                break;
            case 3:
                double product = no1*no2;
                System.out.println("Product is: "+ product);
                break;
            case 4:
                double quotient = no1/no2;
                System.out.println("quotient is : "+ quotient);
                break;
            case 5:
                double reminder = no1%no2;
                System.out.println("Reminder is "+ reminder);
        }
    }
}
