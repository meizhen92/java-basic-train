package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account acount = new Account();
        acount.deposit(10000);
        acount.withdraw(9000);
        acount.withdraw(2000);
        int nowBalance = acount.balance;
        System.out.println("잔고 : "+nowBalance);
    }
}
