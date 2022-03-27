import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }

        int n = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (var num : list) {
            int dis = Math.abs(num - n);
            if (!map.containsKey(dis)) {
                map.put(Math.abs(num - n), new ArrayList<>(List.of(num)));
            } else {
                map.get(dis).add(num);
            }
        }

        int distance = Collections.min(map.keySet());
        Collections.sort(map.get(distance));

        for (var num : map.get(distance)) {
            System.out.print(num + " ");
        }


    }
}