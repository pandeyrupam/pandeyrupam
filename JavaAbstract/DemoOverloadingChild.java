package JavaAbstract;

public class DemoOverloadingChild extends DemoOverloadingParent{

    public static void main(String[] args) {

    }

    void show() {
        System.out.println("wrtyuiju");
    }

    void show(int a) {
        System.out.println("wrtyuiju");
    }

    void show(int y,int z) {
        System.out.println("wrtyuiju");
    }

    @Override
    void parentshow() {
        super.parentshow();
    }

    @Override
    void parentdisplay() {
        super.parentdisplay();
    }
}



class Vehicle { //defining a method
    void run(){
        System.out.println("Vehicle is running");
    }
}
//Creating a child class
class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    //void run(){
        //System.out.println("Bike is running safely");


    @Override
    void run() {
        super.run();
    }


    public static void main(String args[]){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
