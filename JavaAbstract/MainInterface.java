package JavaAbstract;

import com.sun.tools.javac.Main;

public class MainInterface implements Shape{

    public static void main(String[] args) {
        MainInterface obj = new MainInterface();
        float value = obj.findArea();
        System.out.println(value);
    }

    @Override
    public float findArea() {
        return 100.0F;
    }


}

interface Shape {
     float findArea();
}