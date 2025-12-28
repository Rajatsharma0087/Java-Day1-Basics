import java.util.Scanner;
public class ConditionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :");
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is Even number");
        }else if(number > 0){
            System.out.println(number + " is Positive Odd");
        }else {
            System.out.println(number + " is Negative Odd");
        }
        sc.close();
    }
    
}
