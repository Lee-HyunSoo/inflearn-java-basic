package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 메서드: deposit (입금)
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드: withdraw (출금)
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // 잔액 확인
    public int getBalance() {
        return balance;
    }

    // 제대로 들어온 금액이 맞는지 검증
    private boolean isAmountValid(int amount) {
        // 금액이 0 보다 커야한다.
        return amount > 0;
    }
}
