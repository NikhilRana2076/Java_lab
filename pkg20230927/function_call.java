package pkg20230927;

public class function_call {

    static void myMethod(String fname) {
        System.out.println("My name is " + fname);
    }

    public static void main(String[] args) {
        myMethod("Nikhil");
        myMethod("Prakash");
        myMethod("Rochak");
    }
}
