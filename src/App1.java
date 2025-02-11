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

class Investment{
    protected String investmentType;
    protected double investmentAmount;
 
    // Constructor
    public Investment(String investmentType, double investmentAmount){
        this.investmentType = investmentType;
        this.investmentAmount = investmentAmount;
    }
 
    // Method to calcualte the return on investment
    public double calculateReturn(){
        return investmentAmount * 0.05;
    }
 
    // Method to display the investment details
    public void displayInvestmentDetails(){
        System.out.println("Investment Type: " + investmentType);
        System.out.println("Investment Amount: " + investmentAmount);
    }
}

class CryptoInvest extends Investment { 
    public String coinName;

    public CryptoInvest(String investmentType, double investmentAmount, String coinName) {
        this.coinName = coinName;
        super(investmentType, investmentAmount);
    }

    @Override
    private double calculateReturn(){
        super.calculateReturn();
    }

    @Override
    public void displayInvestmentDetails(String coinName){
        super.displayInvestmentDetails();
        System.out.println("Coin used:" + coinName);
    }
}

class StockInvestment extends Investment {
    private double dividendRate;
 
    // Constructor
    public StockInvestment(String investmentType, double investmentAmount, double dividendRate) {
        super(investmentType, investmentAmount);
        this.dividendRate = dividendRate;
    }
 
    // Method to calculate the return on investment
    @Override
    public double calculateReturn() {
        double baseReturn = super.calculateReturn();
        return baseReturn + (investmentAmount * dividendRate);
    }
 
    // Method to display the investment details
    @Override
    public void displayInvestmentDetails() {
        super.displayInvestmentDetails();
        System.out.println("Dividend Rate: " + dividendRate);
    }
}