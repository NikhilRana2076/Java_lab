class Student {
    // Private instance variables
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Validate age (positive value)
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20);

        // Access and modify the fields using getter and setter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Nikhil");
        student.setAge(22);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());

        // Attempt to set a negative age (validation in setter method)
        student.setAge(-5);
    }
}
