import java.util.ArrayList;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Tester {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> check = new ArrayList<>();

    @Test
    public void check(){
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(7);

        check.add(1);
        check.add(2);
        check.add(4);
        check.add(6);
        check.add(7);

        assertEquals(check, Maker.sort(list));
    }
    @Test
    public void check2(){
        list.add(-4);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(-7);

        check.add(-7);
        check.add(-4);
        check.add(1);
        check.add(2);
        check.add(6);

        assertEquals(check, Maker.sort(list));
    }
    @Test(expected = NullPointerException.class)
    public void check3(){
        list.add(4);
        list.add(6);
        list.add(null);
        list.add(2);
        list.add(7);

        check.add(1);
        check.add(2);
        check.add(4);
        check.add(6);
        check.add(7);

        assertEquals(check, Maker.sort(list));
    }
}
