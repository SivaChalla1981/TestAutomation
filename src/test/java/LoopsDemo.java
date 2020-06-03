public class LoopsDemo {


    public void printNumbers(){

        System.out.println("The first 10 numbers are ");
        for(int i=1; i<=10 ; i++) {
            System.out.print(i);
        }
        System.out.println("/n");

        System.out.println("While Loop");
        int i = 5;
        while (i<10){
            i++;
            System.out.print(i);
        }
        System.out.println("/n");

        System.out.println("Do While");
        int j = 0;
        do{
            System.out.print(j);
            j++;
         } while (j<6);

        String myName = "shiva";// Case sensitive
        if(myName.equalsIgnoreCase("Shiva")){
            System.out.println("Yes My name is Shiva");
        }
        else {

            System.out.println("Step out");
        }


    }

    public static void main(String[] args) {
        LoopsDemo ld = new LoopsDemo();
        ld.printNumbers();
    }
}
