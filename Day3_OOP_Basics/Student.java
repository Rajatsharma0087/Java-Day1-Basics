package Day3_OOP_Basics;
public class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("---------------");
    }
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "Rajat";
       s1.age = 22;
       s1.display();

       Student s2 = new Student();
       s2.name = "Amit";
       s2.age = 20;
       s2.display();

    }
    
}
