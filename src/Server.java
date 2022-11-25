import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            Socket socket = serverSocket.accept();

            OutputStream output = socket.getOutputStream();
            DataOutputStream dataOutput = new DataOutputStream(output);
            dataOutput.writeUTF("Hello this is the Server talking.");

            InputStream input = socket.getInputStream();
            DataInputStream dataInput = new DataInputStream(input);
            System.out.println(dataInput.readUTF());
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }


}
