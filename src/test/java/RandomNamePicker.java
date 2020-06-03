import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNamePicker {

    // Drive Function 
    public static void main(String[] args)
    {

        List<String> list = new ArrayList<String>();
        list.add("Emanuel");
        list.add("Kavitha");
        list.add("RamRaj");
        //list.add("Shivaji");

        RandomNamePicker obj = new RandomNamePicker();
        System.out.println("Lucky member for today is: "+obj.getRandomElement(list));
    }

    // Function select an element base on index  
    // and return an element 
    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
} 