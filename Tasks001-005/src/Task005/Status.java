package Task005;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Ekaterina on 24.12.2015.
 */
public class Status implements Runnable {


    Socket client1;
    Socket client2;
    Thread thread;
    int message;

    public Status(Socket client1, Socket client2) {
        this.client1 = client1;
        this.client2 = client2;
        thread = new Thread(this);
        thread.start();
        System.out.println("status started");

    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }



    @Override
    public void run() {
        synchronized (this) {
            try {

                PrintWriter bw1 = new PrintWriter(client1.getOutputStream(), true);
                PrintWriter bw2 = new PrintWriter(client2.getOutputStream(), true);
                while (true) {
                    this.wait(100);
                    if (this.getMessage() == 1) {
                        bw2.println("You lose!");
                        break;
                    } else if (this.getMessage() == 2) {

                        bw1.println("You lose!");
                        break;
                    }


                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
