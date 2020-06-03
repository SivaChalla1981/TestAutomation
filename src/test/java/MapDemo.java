import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {


    public void addElementsToMap(){
        /**
         * Variables should be in camel case
         * Naming variables should have a meaning to the context
         * Use interfaces as a referencing objects for the corresponding classes
         */

        Map <Integer, String> mapWithInt = new HashMap<Integer, String>();
        mapWithInt.put(5,"Test Five");
        mapWithInt.put(1,"Test One");
        mapWithInt.put(2,"Test Two");
        mapWithInt.put(3,"Test Three");
        mapWithInt.put(4,"Test Four");
        mapWithInt.put(6,"Test Six");

        System.out.println("The 3rd element in Map is " + mapWithInt.get(3));

        Set <Map.Entry<Integer, String>> setObject = mapWithInt.entrySet();

        for(Map.Entry<Integer,String> iterator: setObject){
            System.out.println(iterator.getKey()+","+iterator.getValue());
        }

        Set <Map.Entry<Integer, String>> setObject1 = mapWithInt.entrySet();
        Iterator itr = setObject1.iterator();
        System.out.println("*********************************");
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() +"," +entry.getValue());
        }
    }

    public static void main(String[] args) {
        MapDemo md = new MapDemo();
        md.addElementsToMap();
    }
}
