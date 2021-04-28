package PracticeOI_Stream;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.inputStudentInfo();
                    studentList.add(student);
                    break;
                case 2:
                    int id = Integer.parseInt(sc.nextLine());
                    for(Student student1 : studentList){
                        if(id == student1.getId()){
                            student1.editStudentInfo();
                        }
                    }
                    break;
                case 3:
                    int deleteId = Integer.parseInt(sc.nextLine());
                    for(Student student2 : studentList){
                        if(deleteId == student2.getId()){
                            studentList.remove(student2);
                        }
                    }
                    break;
                case 4:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getGpa()<o2.getGpa()){
                                return -1;
                            }return 1;
                        }
                    });
                    for(Student student3 : studentList){
                        System.out.println(student3);
                    }
                    break;
                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    for(Student student3 : studentList){
                        System.out.println(student3);
                    }
                    break;
                case 6:
                    for(Student student3 : studentList){
                        System.out.println(student3);
                    }
                    break;
                case 7:
                    FileOutputStream fos=null;
                    ObjectOutputStream oos=null;
                    try{
                        fos = new FileOutputStream("student.dat");
                        oos = new ObjectOutputStream(fos);

                        oos.writeObject(studentList);
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        if(fos!=null){
                            try {
                                fos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if(oos!=null) {
                            try {
                                oos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    break;
                case 8:
                    FileInputStream fis=null;
                    ObjectInputStream ois=null;
                    try{
                        fis = new FileInputStream("student.dat");
                        ois = new ObjectInputStream(fis);
                        studentList = (List<Student>) ois.readObject();
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        if(fis!=null){
                            try {
                                fis.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if(ois!=null) {
                            try {
                                ois.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    break;
                case 9:
                    System.out.println("GOODBYE!!!");
                    break;
                default:
                    System.out.println("Nhap sai !!");
                    break;
            }

        } while (choice != 9);
    }

    static void showMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Edit student by ID");
        System.out.println("3. Delete student by ID ");
        System.out.println("4. Sort student by GPA ");
        System.out.println("5. Sort student by name ");
        System.out.println("6. Show students");
        System.out.println("7. Save");
        System.out.println("8. Read");
        System.out.println("9. Exit");
        System.out.println("Choice : ");
    }
}
