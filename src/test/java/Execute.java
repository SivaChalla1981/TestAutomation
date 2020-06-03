public class Execute extends A{

    public void sub(){
        int a = 10;
        int b = 5;
        int c = a - b;

        System.out.println("Result in Main Class function is " + c);
    }


    public void sub(int a, int b){
        int c = a - b;
        System.out.println("Result is Main Class " + c);
    }

    public static void main(String[] args) {
        A objA = new A();
        objA.sub();
        objA.sub(10,20);
        objA.sub();

        Execute exeObj = new Execute();
        exeObj.sub();
        exeObj.sub(10,10);
    }
}
