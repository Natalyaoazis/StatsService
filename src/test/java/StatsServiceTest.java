import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService stats = new StatsService();
    private final int[] products = {15, 5, 10, 30, 50, 100, 25};
    @Test
    void shouldCulcSumToMe() {
        assertEquals(235, stats.culculateSumToMe(products));
    }

    @Test
    void shouldCulcSevSumToMe() {
        assertEquals(33, stats.culcSeverageAmount(products));
    }

    @Test
    void shouldFindMonthWithMaxProducts() {
        assertEquals(5, stats.findMonthWithMaxProducts(products));
    }

    @Test
    void shouldFindMonthWithMinProducts() {
        assertEquals(1, stats.findMonthWithMinProducts(products));
    }

    @Test
    void shouldCulcCountOfMonthWithMinProducts() {
        assertEquals(5, stats.culcCountOfMonthWithMinProducts(products));
    }

    @Test
    void shouldCulcCountOfMonthWithMaxProducts() {
        assertEquals(2, stats.culcCountOfMonthWithMaxProducts(products));
    }
}