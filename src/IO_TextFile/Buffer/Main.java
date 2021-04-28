package IO_TextFile.Buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        BufferedInputStream bufferedInputStream = null;
        try{
            fileInputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\Java_core\\Contain text.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] data = new byte[1024];
            int length = bufferedInputStream.read(data);
            System.out.println("Length : "+ length);
            String result = new String(data,0,length);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
