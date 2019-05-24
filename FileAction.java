package com.neuedu.util;

import javax.servlet.http.Part;
import java.io.*;
import java.util.UUID;

public class FileAction {
    public  static String uploadFile(Part part) {
        String submittedFileName = part.getSubmittedFileName();
        InputStream inputStream = null;
        UUID uuid = null;
        String name = uuid + submittedFileName;
        //创建UUID
        uuid = UUID.randomUUID();

        OutputStream os = null;
        try {
            inputStream = part.getInputStream();
            os = new FileOutputStream("G:\\img\\" + name);
            int buffer = 0;
            byte[] bs = new byte[1024];
            while (true) {
                try {
                    if (!((buffer = inputStream.read(bs)) != -1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    os.write(bs, 0, buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  name;

    }
}
