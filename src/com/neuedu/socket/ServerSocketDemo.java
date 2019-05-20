package com.neuedu.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.print("服务端以开启：");
            //阻塞方法
            Socket accept = serverSocket.accept();
            //字节流
            InputStream inputStream = accept.getInputStream();
            //字符流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String s = bufferedReader.readLine();
            System.out.print("服务端发送消息为："+s);
            bufferedReader.close();
            inputStream.close();



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
