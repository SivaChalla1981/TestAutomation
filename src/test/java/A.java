public class A extends B {
    public void add(){
        System.out.println("Am the function to add and i reside in Class A");
        int a = 10;
        int b = 5;
        int c = a+b;
        System.out.println("Adding two numbers result is " + c);
    }

    public void sub(){
        System.out.println("I'm a function used to subtract numbers");
        int a = 20;
        int b = 30;
        int c = a - b;
        System.out.println("Subtraction of two numbers is " + c);
    }

    public void sub(int a, int b){
        int c = a - b;
        System.out.println("Result is " + c);
    }

    public void add(int a, int b, int c){
        int d = a+b+c;
        System.out.println("Adding three numbers from method parameters " + d);
    }
}
