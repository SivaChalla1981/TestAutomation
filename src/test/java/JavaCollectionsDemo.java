import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaCollectionsDemo {

    public void arrayListDemo(){

        /*
           ArrayList is a class in Collection framework
           List is the interface for ArrayList
         */

        List<String> arrayListDemo = new ArrayList<String>();

        arrayListDemo.add("1");
        arrayListDemo.add("Test");
        arrayListDemo.add("2");
        arrayListDemo.add("3");
        arrayListDemo.add("4");
        arrayListDemo.add("5");
        arrayListDemo.add("6");
        arrayListDemo.add("7");
        arrayListDemo.set(0,"shiva");
        arrayListDemo.remove(1);

        System.out.println("*** The list contents are ");

        for(String count : arrayListDemo){
            System.out.println(count);
        }

        Iterator itr = arrayListDemo.iterator();
        System.out.println("********************");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("The First Element in the arraylist is " + arrayListDemo.get(0));
        System.out.println("The First Element in the arraylist is " + arrayListDemo.get(1));
    }

    public void sorting(){
        List<String> studentsList = new ArrayList<String>();

        studentsList.add("RamRaj");
        studentsList.add("Emanuel");
        studentsList.add("Kavitha");
        studentsList.add("Shivaji");
        Collections.sort(studentsList);

       /* Iterator stuListIterator = studentsList.iterator();
        while((stuListIterator.hasNext())){
              System.out.println(stuListIterator.next());
        }*/

        System.out.println(studentsList.indexOf("Kavitha"));
        System.out.println(studentsList.indexOf("RamRaj"));
        System.out.println(studentsList.indexOf("Shivaji"));
        System.out.println(studentsList.indexOf("Emanuel"));

    }


    /**
     * Define an interface with a method Sort
     * Implement sorting in a class with the overrided method
     * demonstrate all the Array list features in the implemented class
     */



    public static void main(String[] args) {
        JavaCollectionsDemo jd = new JavaCollectionsDemo();
        //jd.arrayListDemo();
        jd.sorting();
    }
}
