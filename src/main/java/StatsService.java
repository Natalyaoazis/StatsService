public class StatsService {
    public int culculateSumToMe(int[] prodacts) {
        int sumToMe = 0;
        for (int product : prodacts) {
            sumToMe = sumToMe + product;
        }
        return sumToMe;
    }

    public int culcSeverageAmount(int[] products) {
        int sumToMe = culculateSumToMe(products);
        return sumToMe / products.length;
    }

    public int findMonthWithMaxProducts(int[] products) {
        int month = 0;
        int minMonth = 0;
        for (int product : products) {
            if (product >= products[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }


    public int findMonthWithMinProducts(int [] products) {
        int month = 0;
        int minMonth = 0;
        for (int product : products) {
            if (product <= products[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int culcCountOfMonthWithMinProducts(int [] products) {
        int month = 0;
        int sever = culcSeverageAmount(products);
        for (int product : products) {
            if (product <= sever) {
                month = month + 1;
            }
        }
        return month;
    }

    public int culcCountOfMonthWithMaxProducts(int [] products) {
        int month = 0;
        int sever = culcSeverageAmount(products);
        for (int product : products) {
            if (product >= sever) {
                month = month + 1;
            }
        }
        return month;
    }
}
