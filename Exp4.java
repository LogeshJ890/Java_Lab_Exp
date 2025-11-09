class Find {
    int a,b,sum,sub,multi,divi,modu;

    Find(int a,int b){
        this.a = a;
        this.b = b;
    }
    
    void set_data(){
        sum = a + b;
        sub = a - b;
        multi = a * b;
        divi = a / b;
        modu = a % b;
    }

    void display(){
        System.out.println("Addition of a and b  :" + sum);
        System.out.println("Subtraction of a and b:" + sub);
        System.out.println("Multiplication of a and b:" + multi);
        System.out.println("Division of a and b:" + divi);
        System.out.println("Modulus of a and b:" + modu);
        
        System.out.println();

    }
}


public class Main {
    public static void main(String [] args){
        Find e1 = new Find(50,12);

        e1.set_data();
        e1.display();
    }
}
