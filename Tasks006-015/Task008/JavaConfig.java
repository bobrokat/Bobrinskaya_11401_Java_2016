package Task008;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Ekaterina on 21.03.2016.
 */

@Configuration
public class JavaConfig {
    final int PORT = 3456;


    @Bean
    public ServerSocket serverSocket() throws IOException {
        return new ServerSocket(PORT);
    }

    @Autowired
    ServerSocket serverSocket;

    @Bean
    public Socket socket() throws IOException {
        return serverSocket.accept();
    }
    @Autowired
    Socket socket1;
    @Autowired
    Socket socket2;


    @Bean
    public Status status() throws IOException {
        return new Status(socket1, socket2);
    }



    @Bean
    public Start start(){
        return new Start();
    }

}
