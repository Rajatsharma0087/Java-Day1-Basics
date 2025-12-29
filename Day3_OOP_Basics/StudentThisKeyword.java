package Day3_OOP_Basics;

public class StudentThisKeyword {
    String name;
    int age;

    StudentThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentThisKeyword s1 = new StudentThisKeyword("Rajat", 22);
        StudentThisKeyword s2 = new StudentThisKeyword("Nishant", 21);

        s1.display();
        s2.display();
    }
}


