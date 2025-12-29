package Day3_OOP_Basics;

public class StudentConstructor {
    String name;
    int age;

    StudentConstructor(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------");

    }
    public static void main(String[] args) {
        
        StudentConstructor s1 = new StudentConstructor("rajat",22);
        StudentConstructor s2 = new StudentConstructor("amit", 20);
        s1.display();
        s2.display();
    }
    
}
