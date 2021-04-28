package Bank;

import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String accountName;
    private double money;
    private final double interestRate = 0.035;

    public Account() {
    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = 50;
    }

    public Account(long accountNumber, String accountName, double money) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = money;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // Nhap thong tin tai khoan
    public void inputAccountInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tài khoản : ");
        accountNumber = sc.nextLong();
        System.out.print("Nhập tên tài khoản : ");
        accountName = sc.nextLine();
        System.out.print("Nhập số tiền trong tài khoản : ");
        money = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", money=" + money +
                '}';
    }
}
