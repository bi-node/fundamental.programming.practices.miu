package assignment2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Prog8test {
    int[] a={3,5,3,3,4,5,7,8,0};
    @Test
    public void testProg8()
    {
        int expected=0;
        int result=Prog8min.min(a);
        assertEquals(expected,result);

    }

}
