public class Student {
    private String name;
    private String stu_id;
    private double GPA;
    private int age;

    public Student() {
    }

    public Student(String name, String stu_id, double GPA, int age) {
        this.name = name;
        this.stu_id = stu_id;
        this.GPA = GPA;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setStu_id("12345");
        student1.setGPA(3.5);
        student1.setAge(20);

        Student student2 = new Student("Jane Smith", "67890", 3.8, 22);

        Student student3 = new Student();
        student3.setName("Alice Johnson");
        student3.setStu_id("54321");
        student3.setGPA(3.9);
        student3.setAge(21);

        System.out.println("Student 1: " + student1.getName() + " (ID: " + student1.getStu_id() + ") has GPA: " + student1.getGPA() + ", Age: " + student1.getAge());
        System.out.println("Student 2: " + student2.getName() + " (ID: " + student2.getStu_id() + ") has GPA: " + student2.getGPA() + ", Age: " + student2.getAge());
        System.out.println("Student 3: " + student3.getName() + " (ID: " + student3.getStu_id() + ") has GPA: " + student3.getGPA() + ", Age: " + student3.getAge());
    }
}
