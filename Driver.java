import java.util.Date;

abstract class Employee {
    private String ssn;
    private String name;
    private Date hireDate;

    public Employee(String ssn, String name, Date hireDate) {
        this.ssn = ssn;
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract double getPay();
    public abstract int getDaysOff();

    public boolean samePay(Employee other) {
        return this.getPay() == other.getPay();
    }

    public boolean sameDaysOff(Employee other) {
        return this.getDaysOff() == other.getDaysOff();
    }
}

class Professor extends Employee {
    private double salary;
    private int daysOff;

    public Professor(String ssn, String name, Date hireDate, double salary, int daysOff) {
        super(ssn, name, hireDate);
        this.salary = salary;
        this.daysOff = daysOff;
    }

    @Override
    public double getPay() {
        return salary;
    }

    @Override
    public int getDaysOff() {
        return daysOff;
    }
}

class TA extends Employee {
    private double hourlyRate;
    private int daysOff;

    public TA(String ssn, String name, Date hireDate, double hourlyRate, int daysOff) {
        super(ssn, name, hireDate);
        this.hourlyRate = hourlyRate;
        this.daysOff = daysOff;
    }

    @Override
    public double getPay() {
        return hourlyRate;
    }

    @Override
    public int getDaysOff() {
        return daysOff;
    }
}

public class Driver {
    public static void main(String[] args) {
        Professor professor1 = new Professor("123-45-6789", "Dr. Smith", new Date(), 75000.0, 20);
        Professor professor2 = new Professor("987-65-4321", "Dr. Johnson", new Date(), 75000.0, 15);
        TA ta1 = new TA("111-22-3333", "John Doe", new Date(), 15.0, 10);
        TA ta2 = new TA("444-55-6666", "Jane Smith", new Date(), 15.0, 10);

        if (professor1.samePay(professor2)) {
            System.out.println("Professors have the same pay.");
        } else {
            System.out.println("Professors have different pay.");
        }

        if (ta1.sameDaysOff(ta2)) {
            System.out.println("TAs have the same number of days off.");
        } else {
            System.out.println("TAs have a different number of days off.");
        }
    }
}
