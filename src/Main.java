public class Main {
    public static void main(String[] args) {
        BankService serviceBank = new BankService();

        int cashback = 0;
        Buy[] buyArray = new Buy[3];
        buyArray[0] = new Buy(100, 1);
        buyArray[1] = new Buy(100, 2);
        buyArray[2] = new Buy(100, 3);
        for (int i = 0; i < buyArray.length  ; i++){
            cashback = cashback + serviceBank.cashback(buyArray[i].summ, buyArray[i].type);
        }
        System.out.println("Cashback: " + cashback);

        int depositSumm = 1500;
        int depositResult = serviceBank.deposit(depositSumm);
        System.out.println("Deposit: " + depositResult);
    }
}
