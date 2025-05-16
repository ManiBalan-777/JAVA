class Employee{ //base class
    private int salary;
    private String name;
    Employee(String s,int sal){
        name=s;
        salary=sal;
    }
    int getSalary(){
        return salary;
    }
}
class Manager extends Employee //derived class
{
    int Bonous;
    Manager(String s,int sal,int b){
        super(s,sal);
         Bonous=b;

    }
    int getSalary(){ //overRiddinegd
        return super.getSalary()+Bonous;
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Employee e1=new Employee("MANI",89000);
        ;
        System.out.println(e1.getSalary());
        Manager m1=new Manager("MANI",89000,2000);
        // m1.getSalary();

        System.out.println(m1.getSalary());
    }
}
