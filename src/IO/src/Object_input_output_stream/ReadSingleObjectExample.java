package IO.src.Object_input_output_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import IO.src.Object_input_output_stream.Student;

public class ReadSingleObjectExample {
    public static void main(String[] args) {
        // Doc file ObjectInputStream

        try {
            FileInputStream fis = new FileInputStream("STUDENT.DAT");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // Doc doi tuong ra :
            List<Student> result = (List<Student>) ois.readObject();
            for(Student student : result){
                System.out.println(student);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
