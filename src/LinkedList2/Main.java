package LinkedList2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(12);
        list.add(9);
        list.add(0);
        list.add(3,111);
        System.out.println("Before");
        for(Integer integer : list){
            System.out.print(integer+"\t");
        }
        System.out.println("----------------");
        System.out.println("After");
        list.set(2,999999999);
        for(Integer integer : list){
            System.out.print(integer+"\t");
        }
    }
}
