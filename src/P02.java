import java.util.ArrayList;
import java.util.List;

public class P02 {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Litu");
        name.add("SJ");
        name.add("Bana");

        name.add(1,"Mrutyunjaya" );
        System.out.println(name);

        System.out.println(name.get(3));
        name.set(2,"Prabhu");

        System.out.println(name);
    }
}
