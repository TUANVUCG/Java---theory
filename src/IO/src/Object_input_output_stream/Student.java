package IO.src.Object_input_output_stream;

import java.io.Serializable;

public class Student implements Serializable  {
    private static final long serialVersionUID = -266706354210367639L;
    private String id;
    private String name;
    private String address;
    private float mark;

    public Student() {
    }

    public Student(String id, String name, String address, float mark) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mark=" + mark +
                '}';
    }
}
