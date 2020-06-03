
public class MultipleInheritance implements TestInterfaceA,TestInterfaceB {

    public void add(int a, int b, int c) {
        int d = a+b+c;
        System.out.println("Result for the implemented method is " + d);
    }

    public void mul(int a, int b) {

    }

    public void sub(int a, int b) {

    }

    public void findElement(){
        //By.xpath()
    }

    public static void main(String[] args) {

        MultipleInheritance multipleInheritanceObject = new MultipleInheritance();
        multipleInheritanceObject.add(10,20,30);
    }
}
