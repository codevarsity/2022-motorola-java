import java.lang.reflect.Array;
import java.util.Arrays;

public class InterfaceExample {

    public static void main(String[] args) {
        Rectangle[] rects = new Rectangle[] {
                new Rectangle(100, 100),
                new Rectangle(20, 50),
                new Rectangle(10, 9),
                new Rectangle(50, 40)
        };

        Arrays.sort(rects);

        for(int i = 0 ; i < rects.length; ++i) {
            System.out.println(rects[i]);
        }
    }
}
