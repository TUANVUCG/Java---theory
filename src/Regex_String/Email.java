package Regex_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap du lieu : ");
            String str = sc.nextLine();

            String regex = "^\\w+[a-z0-9]*@[a-z]+(\\.\\w+)$";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(str);


            if (matcher.find()) {
                System.out.println("Ok");
            } else {
                System.out.println("Email không có kí tự đặc biệt, không viết hoa");
                // Khong viet duoc ki kieu @ :(((
            }
        }
    }
}

