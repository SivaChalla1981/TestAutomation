import java.util.HashMap;
import java.util.Map;

public class MusicDemo extends MusicDirector{

    public MusicDemo(String name, String movie, int year) {
        super(name, movie, year);
    }

    public static void main(String[] args) {
        Map <Integer, MusicDirector> musicMap = new HashMap<Integer, MusicDirector>();
           MusicDirector DeviSriPrasad = new MusicDirector("Devi","F2", 2019);
           MusicDirector ARRahman = new MusicDirector("AR", "Narasimha",2008);
           MusicDirector Ricky = new MusicDirector("Ricky Ponting", "RickyBack", 2019);

           musicMap.put(1,DeviSriPrasad);
           musicMap.put(2,ARRahman);
           musicMap.put(3,Ricky);


           System.out.println("Music Director Details");
           for(Map.Entry<Integer,MusicDirector> entry: musicMap.entrySet()){
               MusicDirector musicDirectorDetails = entry.getValue();
               System.out.println(musicDirectorDetails.name+":"+musicDirectorDetails.movie+":"+musicDirectorDetails.year);
           }
    }
}
