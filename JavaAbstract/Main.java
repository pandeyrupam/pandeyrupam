// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main extends Aman {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
        obj.sum(2,10);
        obj.sub(12,10);
        obj.mult(2,10);
        obj.div(10,2);
        obj.newDisplay();
    }

    void display(){
        System.out.println("aman");
    }

    int sum(int a , int b){
        System.out.println(a + b);
        return a + b;
    }
    int sub(int a , int b){
        System.out.println(a - b);
        return a - b;
    }
    int mult(int a , int b){
        System.out.println(a * b);
        return a * b;
    }
    int div(int a , int b){
        System.out.println(a / b);
        return a / b;
    }
}

abstract class Aman {
    abstract void display();
    abstract int sum(int a , int b);
    abstract int sub(int a , int b);
    abstract int mult(int a , int b);
    abstract int div(int a , int b);
    void newDisplay() {
        System.out.println("aman / b");
    }
}



