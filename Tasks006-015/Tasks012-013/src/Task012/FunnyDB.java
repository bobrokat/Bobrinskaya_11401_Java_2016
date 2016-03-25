package Task012;

import java.sql.Connection;
import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ekaterina on 17.02.2016.
 */
public class FunnyDB {

    public static Connection getDBConnection() throws SQLException {
        Connection conn = mock(Connection.class);
        java.sql.Statement st = mock(java.sql.Statement.class);
        when(conn.createStatement()).thenReturn( st);
        return conn;

    }
}
