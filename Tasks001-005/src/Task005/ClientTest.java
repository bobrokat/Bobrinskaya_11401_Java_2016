package Task005;

import org.junit.Test;

import static Task005.Clientgui.isUnique;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ekaterina on 25.02.2016.
 */
public class ClientTest {


    @Test
    public void isUniqueShouldWorkCorrect(){
       assertTrue(isUnique("abcd"));
    }

}
