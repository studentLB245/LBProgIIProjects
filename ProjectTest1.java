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

class ColStudent extends Student {
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
