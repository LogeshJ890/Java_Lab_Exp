class Student {
    int roll;
    String name;
    float marks;

    Student(int roll,String name,float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("Roll No. :" + roll);
        System.out.println("Name :" + name);
        System.out.println("Marks :" + marks);
        System.out.println();

        
    }
}


public class Main {
    public static void main(String [] args){
        Student s1 = new Student(101,"Logesh",3.2f);
        Student s2 = new Student(201,"Mohit",4.5f);

        s1.display();
        s2.display();
       
    }
}
