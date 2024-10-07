package studentexample9;

/**
 * This class represents a Student
 *
 * @author Paul Bonenfant
 */
public class Student {
    
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // new function to print student info
    public void printStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    
}
