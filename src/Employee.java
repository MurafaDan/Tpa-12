
public class Employee implements Training {
    private int age;
    private String name;
    private String functie;

    public Employee(String name , int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    @Override
    public void attendTraining() {
        System.out.println("Atendare training la Angajat");
    }


}
