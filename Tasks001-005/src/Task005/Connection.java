package Task005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Ekaterina on 04.12.2015.
 */
public class Connection implements Runnable {
    Socket socket1;
    Status status;
    int Number;
    Thread thread;
    Server server;
    ArrayList<Integer> key;
    public static int a0;
    public static int a1;
    public static int a2;
    public static int a3;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Connection(Server server, Socket socket1, Status status, ArrayList<Integer> key) {
        this.socket1 = socket1;
        this.server = server;
        this.status = status;
        this.key = key;
        a0 = key.get(0);
        a1 = key.get(1);
        a2 = key.get(2);
        a3 = key.get(3);

        thread = new Thread(this);
        thread.start();
        System.out.println("conn started");
    }

    @Override
    public void run() {

        try {

            
            PrintWriter bw = new PrintWriter(socket1.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
            int bulls;
            int cows;


            while (true) {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                String line = br.readLine();
                int c = Integer.parseInt(line);
                for (int i = 0; i < 4; i++) {
                    arrayList.add(c % 10);
                    c = c / 10;
                }

                bulls = getBulls(arrayList);
                cows = getCows(arrayList);

                if (bulls == 4) {
                    bw.println("You win!");
                    status.setMessage(this.getNumber());
                    break;
                } else {
                    bw.println(bulls + " : bulls   " + cows + " : cows");
                    status.setMessage(0);
                }
                bulls = 0;
                cows = 0;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int getCows(ArrayList<Integer> arrayList) {
        int cows = 0;
        if (arrayList.contains(a3) && arrayList.get(0) != a3) cows++;
        if (arrayList.contains(a2) && arrayList.get(1) != a2) cows++;
        if (arrayList.contains(a1) && arrayList.get(2) != a1) cows++;
        if (arrayList.contains(a0) && arrayList.get(3) != a0) cows++;
        return cows;
    }

    public static int getBulls(ArrayList<Integer> arrayList) {
        int bulls = 0;
        if (arrayList.get(0) == a3) bulls++;
        if (arrayList.get(1) == a2) bulls++;
        if (arrayList.get(2) == a1) bulls++;
        if (arrayList.get(3) == a0) bulls++;
        return bulls;
    }

}
