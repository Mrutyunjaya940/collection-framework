import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Integer,String >tree=new java.util.TreeMap<>();

        tree.put(100,"Litu");
        tree.put(12,"Litu");
        tree.put(10,"Litu");
        tree.put(112,"Litu");
        tree.put(20,"Litu");
        tree.put(10,"Litu");

        System.out.println(tree);

        //Output is Sorted and it contains Duplicate but the key is unique
    }
}
