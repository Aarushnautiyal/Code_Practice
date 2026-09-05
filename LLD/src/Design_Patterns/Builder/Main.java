package Design_Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .name("John Doe")
                .age(20)
                .build();

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println(student);
    }
}
