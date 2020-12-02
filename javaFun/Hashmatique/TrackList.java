import java.util.Set;
import java.util.HashMap;
public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("midnight blues", "Vestibulum quis eros sed elit accumsan maximus. Curabitur ac nisl.");
        trackList.put("greenstreet", "Ut maximus dictum turpis, eu vehicula dolor porta ut. Nunc.");
        trackList.put("wanderlust", "Nullam varius egestas efficitur. Sed eget lectus a dui lacinia.");
        trackList.put("cactus slide", "Curabitur rutrum quis lacus et aliquam. Mauris ultricies tristique pharetra.");
        
        String track1 = trackList.get("wanderlust");
        System.out.println("the lyrics to wanderlust are: " + track1);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}