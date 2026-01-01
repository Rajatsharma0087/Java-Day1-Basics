package Day6_Encapsulation;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Rajat");
        s1.setAge(22);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
