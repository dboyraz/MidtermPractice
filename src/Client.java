import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 9000);

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println(dataInputStream.readUTF());

            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello, this is Client!!");
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }


}
