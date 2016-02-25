package Task005;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static Task005.Server.generate;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        ArrayList<Integer> mocklist = mock(ArrayList.class);
        for(int i = 0; i < 4; i++){
            when(mocklist.get(i)).thenReturn(anyInt());
        }

    }



}
