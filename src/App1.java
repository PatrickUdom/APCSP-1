public class App1 {
    public static void main(String[] args){
        CryptoUser User1 = new CryptoUser("Patrick Udom", 1);
        User1.updateCrypto(5000);
        User1.displaycurrentbalance();
    }
}

class CryptoUser {
    public String name;
    public int userid;
    private float balance;

    public CryptoUser() {
        this.name = "Default";
        this.userid = 0;
        this.balance = 0;
    }

    public CryptoUser(String name, int userid) {
        this.name = name;
        this.userid = userid;
    }

    public void updateCrypto(float newbalance) {
        this.balance = newbalance;
    }

    public void displaycurrentbalance() {
        System.out.println(balance);
    }
}