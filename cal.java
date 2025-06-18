import java.util.Scanner;
public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char b=sc.next().charAt(0);
        System.out.print("Enter second number: ");
        int c=sc.nextInt();

        switch (b) {
            case '+':
                System.out.println("Result: "+(a+c));
                break;
            case '-':
                System.out.println("Result: " +Math.abs(a-c));
                break;
            case '*':
                System.out.println("Result: "+(a*c));
                break;
            case '/':
                if (c!=0)
                    System.out.printf("Result: %.3f\n",(float)a/c); 
                else
                    System.out.println("Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid operator.");
        }
        sc.close();
    }
}
