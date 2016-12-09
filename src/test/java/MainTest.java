import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
/**
 * Created by Богдан on 10.12.2016.
 */
public class MainTest {

    @Test
    public void searchTest0() throws Exception{
        assertEquals(Main.search(null), 0);
    }

    @Test
    public void searchTest1() throws Exception{
        assertEquals(Main.search("Сидоров С.С."), 3);
    }

    @Test
    public void searchTest2() throws Exception{
        assertEquals(Main.search("123"), 0);
    }
}
