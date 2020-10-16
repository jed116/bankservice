public class BankService {
    public int cashback(int summ, int type){
        if (type < 1){
            return 0;
        }
        if(type > 3){
            return 0;
        }
        int limit = 3000;
        int percents[] = {1, 5, 30};
        int result = summ  * percents[type - 1] / 100;
        return result > limit ? limit : result;
    }
    public int deposit(int summ){
        int minSumm = 1000;
        if (summ < minSumm){
            return summ;
        }
        int percent = 3;
        return summ + summ*percent/100;
    }
}
