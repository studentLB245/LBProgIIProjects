public class Polymorphism {
    public static void main(String[] args) {
        Professor professor = new Professor(45, true, "John Johnny", "123-45-6789", "F101", "Computer Science");
        Secretary secretary = new Secretary(30, true, "Smithy Smith", "987-65-4321", "F101", 5);
        Student_Worker studentWorker = new Student_Worker(20, true, "Bob Bobby", "567-89-0123", "TA123", "Sophomore", "Math");

        professor.salary = 8000; // Example salary assignment
        secretary.salary = 4000; // Example salary assignment
        studentWorker.salary = 10; // Example salary assignment

        professor.num_vacation = 3; // Example vacation days assignment
        secretary.num_vacation = 1; // Example vacation days assignment
        studentWorker.num_vacation = 0; // Example vacation days assignment

        // Print employee information
        System.out.println("Professor Salary: $" + professor.getSalary());
        System.out.println("Professor Vacation Days: " + professor.getVacationDays() + " months");

        System.out.println("Secretary Salary: $" + secretary.getSalary());
        System.out.println("Secretary Vacation Days: " + secretary.getVacationDays() + " month");

        System.out.println("Student Worker Salary: $" + studentWorker.getSalary() + " per hour");
        System.out.println("Student Worker Vacation Days: " + studentWorker.getVacationDays() + " (weekends)");
    }
    
    static class Person {
        int age;
        boolean alive;
        String name;
        String ssn;

        public Person(int age, boolean alive, String name, String ssn) {
            this.age = age;
            this.alive = alive;
            this.name = name;
            this.ssn = ssn;
        }

        public int getSalary() {
            return 0; // Base class has no salary, should be overridden in derived classes
        }

        public int getVacationDays() {
            return 0; // Base class has no vacation days, should be overridden in derived classes
        }
    }

    static class Professor extends Person {
        String fac_id;
        String research_area;
        int salary;
        int num_vacation;

        public Professor(int age, boolean alive, String name, String ssn, String fac_id, String research_area) {
            super(age, alive, name, ssn);
            this.fac_id = fac_id;
            this.research_area = research_area;
            this.salary = 0; // Initialize with 0, should be calculated
            this.num_vacation = 0; // Initialize with 0, should be calculated
        }

        @Override
        public int getSalary() {
            return salary; // Professor's salary is monthly
        }

        @Override
        public int getVacationDays() {
            return num_vacation; // Professor gets 3 months of vacation
        }
    }

    static class Secretary extends Person {
        String fac_id;
        int num_service;
        int salary;
        int num_vacation;

        public Secretary(int age, boolean alive, String name, String ssn, String fac_id, int num_service) {
            super(age, alive, name, ssn);
            this.fac_id = fac_id;
            this.num_service = num_service;
            this.salary = 0; // Initialize with 0, should be calculated
            this.num_vacation = 0; // Initialize with 0, should be calculated
        }

        @Override
        public int getSalary() {
            return salary; // Secretary's salary is bi-weekly
        }

        @Override
        public int getVacationDays() {
            return num_vacation; // Secretary gets 1 month of vacation
        }
    }

    static class Student_Worker extends Person {
        String ta_id;
        String year;
        int salary;
        int num_vacation;
        String course_taught;

        public Student_Worker(int age, boolean alive, String name, String ssn, String ta_id, String year, String course_taught) {
            super(age, alive, name, ssn);
            this.ta_id = ta_id;
            this.year = year;
            this.salary = 0; // Initialize with 0, should be calculated
            this.num_vacation = 0; // Initialize with 0, should be calculated
            this.course_taught = course_taught;
        }

        @Override
        public int getSalary() {
            return salary; // Student Worker's salary is hourly
        }

        @Override
        public int getVacationDays() {
            return num_vacation; // Student Worker gets weekends as vacation
        }
    }
}
