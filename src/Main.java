import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(5);
        list.add(11);
        list.add(6);
        list.add(55);
        list.add(12);
        list.add(14);
        list.add(64);
        list.add(1);

        System.out.print(Maker.sort(list));
    }
}