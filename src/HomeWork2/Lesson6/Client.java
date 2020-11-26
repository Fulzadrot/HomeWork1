package HomeWork2.Lesson6;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;

        try{
            socket = new Socket("LocalHost",1640);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream console = new DataInputStream(System.in);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        try {
                         String msg = in.readUTF();
                         System.out.println("Сервер: " + msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }).start();
            while (true){
                System.out.println("Введите сообщение ...");
                String msg = console.readUTF();
                out.writeUTF(msg);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

