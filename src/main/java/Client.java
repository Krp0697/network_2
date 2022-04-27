import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 7777;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("User");
            final String s = in.readLine();
            System.out.println(s);
            out.println("no");
            final String s2 = in.readLine();
            System.out.println(s2);
            out.println("Bye!");
            final String s3 = in.readLine();
            System.out.println(s3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

