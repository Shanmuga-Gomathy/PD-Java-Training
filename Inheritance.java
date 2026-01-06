class Employees{
    void work(){
        System.out.println("Working");
    }
}
class Trainee extends Employees{
    
    void learn(){
        System.out.println("Learning");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Trainee t1 = new Trainee();
        t1.learn();
        t1.work();
    }
}
