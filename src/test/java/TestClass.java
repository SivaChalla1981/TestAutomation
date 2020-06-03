public class TestClass implements TestInterfaceA,TestInterfaceB{

    public void add(){
        int a= 10;
        int b= 20;
        int c= 30;
        System.out.println("Adding three numbers " + (a+b+c));
    }

    public void add(int a, int b){
        int k = a;
        int j = b;
        System.out.println("Adding 2 numbers " + (k+j));
    }

    public void add(int a, int b, int c){
        System.out.println("Three parameters method in Test Class");
        int d = a+b+c;
        System.out.println("Result is "+d);
    }

    public void mul(int a, int b) {

    }

    public void sub(int a, int b) {

    }

    public static void main(String[] args) {


    }
}
