
class Rectangle {
    int length;
    int breath;
    int area;
    int perimeter;

    Rectangle(int length,int breath){
        this.length = length;
        this.breath = breath;
    }

    int set_data(){
        area = length*breath;
        perimeter = 2 * (length + breath);
        return 0;
    }
    void display(){
        System.out.println("Rectangle area :" + area);
        System.out.println("Rectangle area :" + perimeter);
        System.out.println();

        
    }
}


public class Main {
    public static void main(String [] args){
        Rectangle s1 = new Rectangle(10,23);
        s1.set_data();
        s1.display();
       
    }
}
