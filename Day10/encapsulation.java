

class Bank {
    private double balance;

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void withdraw(int amount)
    {
        if( amount > 0 && amount <= balance){
                 balance -= amount;
                 System.out.println("Amount debited :" + amount);
        }
        else{
            System.out.println("INVALID amoount");
        }

    }
    public void deposit (int amount)
    {
        if( amount > 0){
                 balance += amount;
                 System.out.println("Amount credited :" + amount);
        }
        else{
            System.out.println("INVALID amoount");
        }

    }

    public double getBalance(){
        return balance;
    }
}

public class encapsulation {
    public static void main(String[] args){
        Bank b = new Bank();

        b.setBalance(90000);  
        System.out.println(b.getBalance()); 
        b.withdraw(500);
        System.out.print(b.getBalance());
    }
}
