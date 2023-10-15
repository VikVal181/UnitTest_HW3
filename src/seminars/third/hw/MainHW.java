package seminars.third.hw;

public class MainHW {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) { // 25 и 100 не включаем в интервал
            return true;
        } else {
            return false;
        }
    }
}
