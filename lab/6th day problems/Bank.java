class Account {
    private double balance;

    public Account(double balance) {
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("** Initial balance was invalid **");
        }
    }

    void credit(double amount) {
        balance += amount;
    };

    boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    };

    double enquiry() {
        return this.balance;
    };

    void setBalance(double amt) {
        this.balance = amt;
    };
};

class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(double balance, double rate) {
        super(balance);
        this.rate = rate;
    }

    double calculateInterest() {
        return enquiry() * (rate / 100);
    };

    void credit(double amount) {
        double interest = calculateInterest();
        setBalance(enquiry() + amount + interest);
        System.out.println("Account Balance after credit :" + enquiry());
    };

    boolean debit(double amount) {
        if (amount > enquiry()) {
            System.out.println("Debit amount exceeded account balance.");
            return false;
        } else {
            setBalance(enquiry() - amount);
            return true;
        }
    };
}

// Creating a Checking Account class derivied from Account class

class CheckingAccount extends Account {
    private double feePerTx;

    public CheckingAccount(double balance, double feePerTx) {
        super(balance);
        this.feePerTx = feePerTx;
    }

    void credit(double amount) {
        setBalance(amount - feePerTx);
    };

    boolean debit(double amount) {
        double amt = (amount + feePerTx);
        if (!super.debit(amt)) {
            System.out.println("Debit amount exceeded account balance.");
            return false;
        } else {
            super.debit(amt);
            return true;
        }
    };
};

public class Bank {

    public static void main(String[] args) {
        double damt, camt;
        SavingsAccount sa1 = new SavingsAccount(60000, 7.9);
        CheckingAccount ca1 = new CheckingAccount(75000, 5);
        damt = 34000;
        camt = 49000;

        System.out.println("__Savings Account__");
        System.out.println("Account Balance :" + sa1.enquiry());
        sa1.debit(damt);
        System.out.println("Account Balance After Debit " + damt + " is :" + sa1.enquiry());
        sa1.credit(camt);
        System.out.println("Account Balance After Credit " + camt + " is :" + sa1.enquiry());
        System.out.println("__Checking Account__");
        System.out.println("Account Balance :" + ca1.enquiry());
        ca1.debit(damt);
        System.out.println("Account Balance After Debit " + damt + " is :" + ca1.enquiry());
        ca1.credit(camt);
        System.out.println("Account Balance After Credit " + camt + " is :" + ca1.enquiry());
    }
}
