import java.util.Scanner;
public class ConditionExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = sc.nextInt();

        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both");
        } else if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        } else if (number % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println(number);
        } 
        sc.close();
    }
    
}
