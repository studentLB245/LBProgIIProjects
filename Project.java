import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    Boolean alive;
    int age;
    String SSN;
}

class Teacher extends Person {
    String ID;
    int monthly_salary;
    int num_years_prof;

    public Teacher(String name, int age, String SSN, String ID, int monthly_salary, int num_years_prof) {
        this.name = name;
        this.age = age;
        this.SSN = SSN;
        this.ID = ID;
        this.monthly_salary = monthly_salary;
        this.num_years_prof = num_years_prof;
        this.alive = true;
    }
}

class Student extends Person {
    String stu_id;
    double gpa;

    public Student(String name, int age, String SSN, String stu_id, double gpa) {
        this.name = name;
        this.age = age;
        this.SSN = SSN;
        this.stu_id = stu_id;
        this.gpa = gpa;
        this.alive = true;
    }
}

class Professor extends Teacher {
    String specialty;
    String research_area;
    String rank;
    boolean tenured;

    public Professor(String name, int age, String SSN, String ID, int monthly_salary, int num_years_prof,
                     String specialty, String research_area, String rank, boolean tenured) {
        super(name, age, SSN, ID, monthly_salary, num_years_prof);
        this.specialty = specialty;
        this.research_area = research_area;
        this.rank = rank;
        this.tenured = tenured;
    }
}

class   ColStudent extends Student {
    String major;
    String grade;

    public ColStudent(String name, int age, String SSN, String stu_id, double gpa, String major, String grade) {
        super(name, age, SSN, stu_id, gpa);
        this.major = major;
        this.grade = grade;
    }
}

class Department {
    Professor chair;
    List<Professor> faculty;
    List<Course> courses;

    public Department(Professor chair, List<Professor> faculty, List<Course> courses) {
        this.chair = chair;
        this.faculty = faculty;
        this.courses = courses;
    }
}

class Course {
    Professor instructor;
    List<Student> students;
    List<ColStudent> colStudents;
    String course_name;

    public Course(Professor instructor, List<Student> students, List<ColStudent> colStudents, String course_name) {
        this.instructor = instructor;
        this.students = students;
        this.colStudents = colStudents;
        this.course_name = course_name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create professors
        Professor prof1 = new Professor("John Doe", 45, "123-45-6789", "P1", 6000, 10, "Math", "Algebra", "Full", true);
        Professor prof2 = new Professor("Alice Smith", 55, "987-65-4321", "P2", 7000, 15, "Physics", "Quantum Mechanics", "Associate", false);
        Professor prof3 = new Professor("Bob Johnson", 40, "456-78-9012", "P3", 5500, 8, "Computer Science", "Artificial Intelligence", "Full", true);

        // Create students
        Student student1 = new Student("Jane Davis", 20, "654-32-1098", "S1", 3.8);
        Student student2 = new Student("Tom Wilson", 21, "234-56-7890", "S2", 3.5);
        Student student3 = new Student("Emma Brown", 19, "345-67-8901", "S3", 3.9);
        ColStudent colStudent1 = new ColStudent("Lucas Lee", 22, "789-01-2345", "CS1", 3.7, "Computer Science", "A");
        ColStudent colStudent2 = new ColStudent("Olivia Green", 23, "890-12-3456", "CS2", 3.4, "Computer Science", "B");

        // Create courses
        Course course1 = new Course(prof1, List.of(student1, student2), List.of(colStudent1, colStudent2), "Linear Algebra");
        Course course2 = new Course(prof2, List.of(student3), List.of(colStudent1), "Quantum Mechanics");

        // Display information
        System.out.println("Professors:");
        System.out.println(prof1.name + " - " + prof1.specialty);
        System.out.println(prof2.name + " - " + prof2.specialty);
        System.out.println(prof3.name + " - " + prof3.specialty);

        System.out.println("\nStudents:");
        System.out.println(student1.name + " - GPA: " + student1.gpa);
        System.out.println(student2.name + " - GPA: " + student2.gpa);
        System.out.println(student3.name + " - GPA: " + student3.gpa);

        System.out.println("\nCourses:");
        System.out.println(course1.course_name + " - Instructor: " + course1.instructor.name);
        System.out.println(course2.course_name + " - Instructor: " + course2.instructor.name);
    }
}
