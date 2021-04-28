package IO_Object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Duc", "Nam"));
        list.add(new Student("Hanh", "Nu"));
        list.add(new Student("Oanh", "Vu"));


        FileOutputStream out = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            out = new FileOutputStream("Student.obj");
            objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Doc du lieu
        FileInputStream in = null;
        ObjectInputStream inputStream = null;
        try {
            in = new FileInputStream("Student.obj");
            inputStream = new ObjectInputStream(in);

            list = (List<Student>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        for(int i =  0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
