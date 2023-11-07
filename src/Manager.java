public class Manager extends Employee implements Interview{


    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void attendTraining() {
        System.out.println("Managerul :"+getName());
    }

public void conductInterview(){
    System.out.println("Conduct interview Managaer");
}
}
