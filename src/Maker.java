import java.util.ArrayList;

public class Maker {
    static ArrayList<Integer> sort(ArrayList<Integer> list){
        for (int j = 0; j < list.size() - 1; j++) {
            if (list.size() > 1) {
                Integer a;
                Integer b;

                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        a = list.get(i);
                        b = list.get(i + 1);
                        list.set(i, b);
                        list.set(i + 1, a);
                    }
                }
            }
        }

        return list;
    }
}
