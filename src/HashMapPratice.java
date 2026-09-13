import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(101,"Litu");
        map.put(102,"Mrutyunjaya");
        map.put(103,"SJ");
        map.put(104,"Pabitra");
        map.put(105,"satya");

        for(Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.println("Key : "+entry.getKey());
            System.out.println("Value : "+entry.getValue());
        }

        if(! map.containsKey(106))
        {
            map.put(106,"Rosan");
        }

        map.computeIfAbsent(107,k->"Hiralal");
        System.out.println(map);
    }
}
