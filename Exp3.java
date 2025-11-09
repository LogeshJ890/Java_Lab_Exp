
class Employee {
    int id;
    String name;
    int salary;

    Employee(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    void display(){
        System.out.println("Employee Id  :" + id);
        System.out.println("Employee name:" + name);
        System.out.println("Employee salary:" + salary);
        System.out.println();

        
    }
}


public class Main {
    public static void main(String [] args){
        Employee e1 = new Employee(5012,"Logesh",99999);
        Employee e2 = new Employee(6757,"Dinesh",93456);


        e1.display();
        e2.display();
    }
}
