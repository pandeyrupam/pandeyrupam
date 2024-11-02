import java.util.Scanner;



public class Triangle extends Shape {

    public  static void main(String [] args){
        Triangle obj = new Triangle();
        obj.dim2 = 10;
        obj.dim1 = 30;
        obj.findArea();
    }


    @Override
    float findArea() {
        System.out.println(dim1 * dim2);
        return dim1 * dim2;
    }
}

abstract  class Shape{
    float dim1;
    float dim2;

//    void readDim(){
//        Scanner myObj = new Scanner(System.in);
//        dim1 = myObj.nextFloat();
//        dim2 = myObj.nextFloat();
//    }

    abstract  float findArea();
}