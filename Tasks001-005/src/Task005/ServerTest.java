package Task005;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static Task005.Clientgui.isUnique;
import static Task005.Server.generate;

/**
 * Created by Ekaterina on 25.02.2016.
 */
public class ServerTest {

    @BeforeClass
    public static void beforeclass(){

    }

    @Test
    public void generateShouldWorkCorrect(){
        ArrayList<Integer> key = generate();
        Assert.assertTrue(key.size() == 4);
        String s = "";
        for( Integer i : key){
            s += i;
        }
        Assert.assertTrue(isUnique(s));

    }



}
