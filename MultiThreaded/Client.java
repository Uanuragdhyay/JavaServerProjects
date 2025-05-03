import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public Runnable getRunnable()throws UnknownHostException, IOException {
        return new Runnable(){
            @Override
            public void run(){
                int port = 8010;
                try {
                    InetAddress address = InetAddress.getByName("localhost");
                    Socket socket = new Socket(address, port);
                    try (
                            PrintWriter toSocket = new PrintWriter(socket.getOutputStream(),true);
                            BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    ) {
                        toSocket.println("heloo from client"+socket.getLocalSocketAddress());
                        String line = fromSocket.readLine();
                        System.out.println("response from the server is : " + line);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(client.getRunnable());
            thread.start();
            try {
                Thread.sleep(50);  // 50ms delay between clients
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
