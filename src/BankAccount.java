public class BankAccount {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdrawFunds(double amount){
        if(this.accountBalance - amount >= 0) {
            this.accountBalance = this.accountBalance - amount;
        System.out.println("Succesfully withdrawn amount Rs "+ amount +
                " Account balance: Rs"+ this.accountBalance);}
        else
            System.out.println("Insufficient balance to withdraw Rs"+ amount +
                    " Account balance: Rs"+ this.accountBalance);
    }

    public void depositFunds(double amount){
        this.accountBalance = this.accountBalance + amount;
        System.out.println("Succesfully deposited amount Rs "+ amount +
                " Account balance: Rs"+ this.accountBalance);
    }
}
