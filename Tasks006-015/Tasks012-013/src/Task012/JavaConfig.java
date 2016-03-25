package Task012;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static Task012.FunnyDB.getDBConnection;

/**
 * Created by Ekaterina on 24.03.2016.
 */
@Configuration
public class JavaConfig {
    @Bean
    public Statement statement() throws SQLException {
        Connection connection = getDBConnection();
        return connection.createStatement();
    }


}
