package IO.src.Object_input_output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import IO.src.Object_input_output_stream.Student;

public class SingleObjectInputOutputStreamExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("AN1289NJ", "Naruto", "Namek",7.0f);
        Student student1 = new Student("HL33489NJ", "Sasuke", "Xayda",5.7f);
        Student student2 = new Student("YP119NJ", "Sai", "Earth",7.8f);
        Student student3 = new Student("MK12898R", "Sakuta", "Sun",9.3f);
        Student student4 = new Student("TN17589NC", "Hinata", "Moon",4.9f);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        // Ghi file
        try {
            FileOutputStream fos = new FileOutputStream("STUDENT.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Ghi file :

            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
