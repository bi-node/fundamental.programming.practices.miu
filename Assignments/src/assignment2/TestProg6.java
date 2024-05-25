package assignment2;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class TestProg6 {
    String[] testData=new String[]{"Boy", "Girl", "Boy"};
    @Test
    public void testremovedups()
    {
        String[] result=Prog6RemoveDuplicates.removedups(testData);
        String[] expected={"Boy", "Girl"};
        assertEquals(expected,result);


    }


}
