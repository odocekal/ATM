public class ATM {
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM(int inputMoney){
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    // add money deposit function
    public void depositMoney(int amountToDeposit){
        if(amountToDeposit <= this.money){
            totalMoney += amountToDeposit;
            this.money += amountToDeposit;
        }
    }

    public static void averageMoney(){
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args){

        System.out.println("Total number of ATMs: " + ATM.numATMs);
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);
        ATM thirdATM = new ATM(2500);
        System.out.println("Total number of ATMs: " + ATM.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        thirdATM.depositMoney(500);
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);


        // Call averageMoney() here
        ATM.averageMoney();
    }
}
