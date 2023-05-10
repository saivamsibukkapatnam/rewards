import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue reward = new RewardValue(100.0);
        assertEquals(28571, reward.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue reward= new RewardValue(50000);
        assertEquals(175.0,reward.getCashValue(),0.01);
    }
}
