public class BankService {
    public int cashback(int summ, int type){
        if ((type < 1) | (type > 3)){
            return 0;
        }
        int limit = 3000;
        int percents[] = {1, 5, 30};
        int result = summ  * percents[type] / 100;
        return result > limit ? limit : result;
    }
}
