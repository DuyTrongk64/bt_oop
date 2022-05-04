class Account {
    private String name;
    private int balance;

    Account() {
        name = "Unsigned";
        balance = 0;
    }

    Account(String pName, int pBalance) {
        name = pName;
        balance = pBalance;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean debit(int amount) {
        if(amount > balance) {
            return false;
        }
        else {
            balance -= amount;
            return true;
        }

    }

    public static void main(String[] args) {
        Account acc = new Account("Nguyen Duy Trong", 4694);
        System.out.println(acc.name);
        System.out.println(acc.balance);
        acc.deposit(1000);
        System.out.println(acc.name);
        System.out.println(acc.balance);
        acc.debit(2000);
        System.out.println(acc.name);
        System.out.println(acc.balance);
    }

}