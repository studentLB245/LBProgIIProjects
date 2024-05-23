public class Professor{
    private String name;
    private String ssn;
    private int age;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public Person(String n, String s, int a){
        name = n;
        ssn = s;
        age = a;
    }
    public Professor(){
    }
    public static void main(String [] args){
        Person p1 = new Person ("John Smith","123-456-7890",24);
        Person p2 = new Person();
        p2.setname("Smith John");
        p2.setSSN("987-654-3210");
        p2.setAge(21);

        System.out.println("Personal Info: \n");
        System.out.println("Name: "+p1.name+"\n");
        System.out.println("SSN: "+p1.ssn+"\n");
        System.out.println("Age: "+p1.age+"\n");
    }
    // to String
    public StringtoString(){
        String output = " ":
        output += "Personal Info: \n";
        output += "Name: "+getName()+"\n";
        output += "SSN:"+getSSN()+"\n";
        output += "Age: "+getAge()+"\n";
        return output;
    }
    System.out.println(p1.toString());
    System.out.println(p2.toString());

    public Professor
             (Person p){
        if (p==null || p.name.equals("")||p.ssn.equals(""))
            ||p.age<=0){

        }
    }
}