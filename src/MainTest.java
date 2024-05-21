import com.sun.tools.javac.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MainTest {
    @Test
    public void testAdd() {
        MainClass main = new MainClass();
        assertEquals(5, main.add(2, 3), "2 + 3 devrait être égal à 5");
    }
}
