import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
/**
 * Created by Богдан on 10.12.2016.
 */
public class MainTest {

    @Test
    public void searchTest0() throws Exception{
        Main m1 = new Main();
        assertEquals(m1.search(null), 0);
    }

    @Test
    public void searchTest1() throws Exception{
        Main m1 = new Main();
        assertEquals(m1.search("Сидоров С.С."), 3);
    }

    @Test
    public void searchTest2() throws Exception{
        Main m1 = new Main();
        assertEquals(m1.search("123"), 0);
    }
}
