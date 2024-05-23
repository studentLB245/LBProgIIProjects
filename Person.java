public class Person {
    //Data fields
    private String name;
    private int age;
    private String ssn;
    private boolean alive;

    //Fully loaded Constructor
    public Person(String n, int a, String SSN, boolean alive) {
        this.name = n;
        this.age = a;
        this.ssn = SSN;
        this.alive = alive;
    }

    //Copy Constructor
    public Person(Person p) {
        //Error Checking
        if (p == null || p.name.equals("") || p.age < 0 || p.ssn.equals("")) {
            System.out.println("Invalid Person!");
            System.exit(1);
        }

        this.name = p.name;
        this.age = p.age;
        this.ssn = p.ssn;
        this.alive = p.alive;
    }

    //Setters and getters
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String SSN) {
        this.ssn = SSN;
    }

    public boolean getAliveStatus() {
        return alive;
    }

    public void setAliveStatus(boolean alive) {
        this.alive = alive;
    }

    //toString
    public String toString() {
        String output = "";

        output += "Person Info:\n";
        output += "Name: " + this.name + "\n";
        output += "Age: " + this.age + "\n";
        output += "SSN: " + this.ssn + "\n";
        /*output += "Is Alive: " + this.alive + "\n";
        We're Assuming They're Alive */

        return output;
    }
}
