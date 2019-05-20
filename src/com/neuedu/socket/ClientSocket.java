package com.neuedu.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入要发送的信息");
            String s = scanner.nextLine();
            Socket socket = new Socket("127.0.0.1",8888);
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            System.out.println("您发送的信息为："+s);
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
