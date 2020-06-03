public class AbstractDemo extends AbstractClass {

    public void getAllSalaryToYourAccount(int salaryTaken) {
       System.out.println("All my salary is taken from my account " + salaryTaken);
    }

    public void add(int a, int b) {
        System.out.println("Adding two number " + (a+b));
    }

    public static void main(String[] args) {


        AbstractDemo demoObj = new AbstractDemo();
        demoObj.askName("Suri");
        demoObj.askSalary(20000);
        demoObj.getAllSalaryToYourAccount(20000);
        demoObj.getInToBank();
        demoObj.add(100,20);
        demoObj.add(200,10);

    }


}
