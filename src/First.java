import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.remove(Integer.valueOf(20));
        System.out.println(nums);
    }
}
