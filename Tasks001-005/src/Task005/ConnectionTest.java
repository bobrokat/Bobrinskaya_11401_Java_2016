package Task005;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

import static Task005.Connection.getBulls;
import static Task005.Connection.getCows;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 26.02.2016.
 */
public class ConnectionTest {
    public static Connection connection;
    public static ArrayList<Integer> key;
    public static ArrayList<Integer> entered;


    @BeforeClass
    public static void beforeclass() throws IOException {
        Server server = mock(Server.class);
        Socket socket = mock(Socket.class);
        doCallRealMethod().when(socket).getInputStream();
        doCallRealMethod().when(socket).getOutputStream();
        Status status = mock(Status.class);
        key = mock(ArrayList.class);
        for(int i = 0; i < 4; i++){
            when(key.get(i)).thenReturn(i);
        }
         entered = mock(ArrayList.class);

        when(entered.get(0)).thenReturn(0);
        when(entered.get(1)).thenReturn(2);
        when(entered.get(2)).thenReturn(4);
        when(entered.get(3)).thenReturn(3);

        connection = new Connection(server, socket, status, key);


    }

    @Test
    public void getCowsShouldWorkCorrect(){
        assertEquals(0, getCows(entered));
    }

    @Test
    public void getBullsShouldWorkCorrect(){
        assertEquals(1, getBulls(entered));
    }

}
