package oop1.ex;

public class Account {

    int balance; // 잔액

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;
    }

    void printBalance() {
        System.out.println("잔고: " + balance);
    }
}
