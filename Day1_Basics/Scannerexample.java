import java.util.Scanner;

public class Scannerexample{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = sc.nextLine();

        System.out.print("Enter your age :");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your favorite color :");
        String favorite = sc.nextLine();

        System.out.println(
            "My name is" + name +
            ",I am " + age +
            " years old, and I like " + favorite + " color."
        );

        sc.close();


    }
}





