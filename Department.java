public class Department {
    private String deptName;
    private int numMajors;
    private Teacher[] listTeachers;
    private Student[] listStudents;

    public Department() {
        this.deptName = "";
        this.numMajors = 0;
        this.listTeachers = new Teacher[3];
        this.listStudents = new Student[5];
    }

    public Department(String deptName, int numMajors, Teacher[] teachers, Student[] students) {
        this.deptName = deptName;
        this.numMajors = numMajors;
        this.listTeachers = teachers;
        this.listStudents = students;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getNumMajors() {
        return numMajors;
    }

    public void setNumMajors(int numMajors) {
        this.numMajors = numMajors;
    }

    public Teacher[] getListTeachers() {
        return listTeachers;
    }

    public void setListTeachers(Teacher[] listTeachers) {
        this.listTeachers = listTeachers;
    }

    public Student[] getListStudents() {
        return listStudents;
    }

    public void setListStudents(Student[] listStudents) {
        this.listStudents = listStudents;
    }

    @Override
    public String toString() {
        return "Department Name: " + deptName +
                "\nNumber of Majors: " + numMajors +
                "\nTeachers: " + listTeachers.length +
                "\nStudents: " + listStudents.length;
    }

    public static void main(String[] args) {
        Teacher[] teachers1 = new Teacher[3];
        for (int i = 0; i < 3; i++) {
            teachers1[i] = new Teacher("Teacher" + (i + 1));
        }

        Student[] students1 = new Student[5];
        for (int i = 0; i < 5; i++) {
            students1[i] = new Student("Student" + (i + 1));
        }

        Department department1 = new Department("Computer Science", 200, teachers1, students1);

        Teacher[] teachers2 = new Teacher[3];
        for (int i = 0; i < 3; i++) {
            teachers2[i] = new Teacher("Teacher" + (i + 4));
        }

        Student[] students2 = new Student[5];
        for (int i = 0; i < 5; i++) {
            students2[i] = new Student("Student" + (i + 6));
        }

        Department department2 = new Department("Mathematics", 150, teachers2, students2);

        System.out.println("Department 1 Details:");
        System.out.println(department1);

        System.out.println("\nDepartment 2 Details:");
        System.out.println(department2);
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher Name: " + name;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student Name: " + name;
    }
}
