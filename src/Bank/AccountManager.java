package Bank;

import Abstract_and_Interface.Abstract.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
    Scanner sc = new Scanner(System.in);
    List<Account> accountList = new ArrayList<>();

    // Them thong tin mot tai khoan
    public void addAccount(){
        Account account = new Account();
        account.inputAccountInfo();
        accountList.add(account);
    }

    // Nap tien vao tai khoan
    public void recharge(String accountName, double money){
        for(Account account : accountList){
            if(account.getAccountName().equals(accountName)){
                System.out.println(account.getMoney()+money);
            }
        }
    }
}
