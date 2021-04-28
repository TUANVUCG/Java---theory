package Regex_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap du lieu : ");
            String str = sc.nextLine();

            String regex = "\\d{10,11}";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(str);

            boolean match = matcher.matches();

            if(match){
                System.out.println("Ok");
            }
            else{
                System.out.println("Số điện thoại không được chứa kí tự đặc biệt, chỉ có 10-11 chữ số !!! ");

            }}
    }
    }

