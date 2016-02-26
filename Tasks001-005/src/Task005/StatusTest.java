package Task005;

import org.junit.BeforeClass;
import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Ekaterina on 26.02.2016.
 */
public class StatusTest {
    public static Status status;
    public static Socket socket1;
    public static Socket socket2;

    @BeforeClass
    public static void beforeclass() {
        socket1 = mock(Socket.class);
        socket2 = mock(Socket.class);
        status = new Status(socket1, socket2);
        status.message = 1;
    }

    @Test
    public void getMessageShouldWorkCorrect() {
        assertEquals(status.getMessage(), 1);

    }

    @Test
    public void setMessageShouldWorkCorrect(){
        status.setMessage(0);
        assertEquals(status.getMessage(), 0);
    }
}
