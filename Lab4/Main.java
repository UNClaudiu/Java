package Lab4;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Charlie", "German Shepherd");

        // Modificare proprietăți
        dog1.setName("Max");
        dog2.setBreed("Golden Retriever");

        // Afișare modificări
        System.out.println("Dog 1: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + ", " + dog2.getBreed());
    }
}
public static void main(String[] args) {
    // Instanțierea obiectelor
    Person person = new Person();
    Student student = new Student();
    Profesor profesor = new Profesor();

    // Setarea proprietăților pentru Person
    person.setName("John Doe");
    person.setEmail("john.doe@example.com");

    // Setarea proprietăților pentru Student
    student.setName("Alice");
    student.setEmail("alice@student.com");
    student.setGrades(new int[]{90, 85, 92});

    // Setarea proprietăților pentru Profesor
    profesor.setName("Dr. Smith");
    profesor.setEmail("smith@example.com");
    profesor.setCourses(new String[]{"Mathematics", "Physics"});

    // Afișarea informațiilor
    System.out.println("Person: " + person.getName() + ", " + person.getEmail());
    System.out.println("Student: " + student.getName() + ", " + student.getEmail() + ", Grades: " + Arrays.toString(student.getGrades()));
    System.out.println("Profesor: " + profesor.getName() + ", " + profesor.getEmail() + ", Courses: " + Arrays.toString(profesor.getCourses()));
}
}