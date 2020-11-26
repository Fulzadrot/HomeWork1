package HomeWork2.Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static int PORT = 1640;
    public static void main(String[] args) {
        Server server = new Server();
    }
    public Server(){
        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер запущен");
            socket = server.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream console = new DataInputStream(System.in);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        System.out.println("Сервер печатает...");
                        String msg = null;
                        try {
                            msg = console.readUTF();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Сервер отправил сообщение:");
                        try {
                            out.writeUTF(msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    }
                }).start();
            while (true){
                String msg = in.readUTF();
                if (msg.equals("/quit")){
                    break;
                }
                System.out.println("Клиент: " + msg);
            }
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();
                server.close();
                System.out.println("Сервер закрыт");
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}

