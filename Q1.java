import java.util.*;

class cube {
    double length;
    double breath;
    double height;


    cube() {
        length = breath = height = 10;
    }

    cube(double oneside) {
        length = breath = height = oneside;
    }

  
    cube(double length, double breath, double height) {
        this.length = length;
        this.breath = breath;
        this.height = height;
    }

    
    double volumeOfCube() {
        return length * breath * height;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        cube c1 = new cube();
        cube c2 = new cube(2);
        cube c3 = new cube(2, 2, 2);

        System.out.println(c1.volumeOfCube());
        System.out.println(c2.volumeOfCube());
        System.out.println(c3.volumeOfCube());
    }
}
