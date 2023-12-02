import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = random.nextInt(15) + 1;
            System.out.println("a" + i + "= " + a[i]);
        }
            Map<Integer, Integer> pof = new HashMap<>();
            for (int num : a) {
                pof.put(num, pof.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : pof.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("число '" + entry.getKey() + "' встречается " + entry.getValue() + " раза");
                }
            }
    }
}