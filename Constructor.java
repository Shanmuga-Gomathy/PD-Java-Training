class Student {

    Student() {
        this(21);
        System.out.println("Default constructor");
    }

    Student(int age) {
        this("Gomathy");
        System.out.println("Age: " + age);
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }
}
public class Constructor {
    public static void main(String[] args){
        Student s1 = new Student();
    }
}
