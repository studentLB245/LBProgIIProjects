public class Zoo{
    private String name;
    private double annual_revenue;
    private Animal[] list_animals;

    public Zoo(String name, double annual_revenue, Animal[] list_animals){
        this.name = name;
        this.annual_revenue = annual_revenue;
        this.list_animals = list_animals;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getAnnualRevenue(){
        return annual_revenue;
    }
    public void setAnnualRevenue(double annual_revenue){
        this.annual_revenue = annual_revenue;
    }
    public Animal[] getListAnimals(){
        return list_animals;
    }
    public void setListAnimals(Animal[] list_animals){
        this.list_animals = list_animals;
    }
    @Overide
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo Name: ").append(name).append("\n");
        sb.append("Annual Revenue: ").append(annual_revenue).append("\n");
        sb.append("List of Animals:\n");
        for (Animal animal : list_animals){
            sb.append(animal.toString()).append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Animal[] animals = {
                new Animal("Lion", "Panthera leo"),
                new Animal("Elephant", "Loxodonta africana"),
                new Animal("Giraffe", "Giraffa camelopardalis")
        };
        Zoo zoo = new Zoo("MyZoo", 100000.0, animals);
        System.out.println(zoo.toString());
    }
}
}
