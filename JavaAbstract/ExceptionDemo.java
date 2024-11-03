package JavaAbstract;
import java.text.ParseException;

class ExceptionDemo {

    public static void main(String args[]) throws ParseException {
        //Initialising the array
        int arr[] = new int[4];
        //Initialising the value
        arr[0] = 1;
        //Printing the
        System.out.println(arr[0]);
        arr[-1] = 3;
        System.out.println(arr[99]);
    }
}