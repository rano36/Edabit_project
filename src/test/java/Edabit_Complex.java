import org.testng.Assert;
import org.testng.annotations.Test;

public class Edabit_Complex {
        public static int[] getCoinBalances(String[] actions1, String[] actions2) {
            int person1Coins = 3;
            int person2Coins = 3;
            for (int i = 0; i < actions1.length; i++) {
                String action1 = actions1[i];
                String action2 = actions2[i];

                if (action1.equals("share") && action2.equals("share")) {
                    person1Coins += 2;  // Both share, each gets 2 coins
                    person2Coins += 2;
                } else if (action1.equals("share") && action2.equals("steal")) {
                    person1Coins -= 1;  // Person 1 shares, person 2 steals
                    person2Coins += 3;
                } else if (action1.equals("steal") && action2.equals("share")) {
                    person1Coins += 3;  // Person 1 steals, person 2 shares
                    person2Coins -= 1;
                } else if (action1.equals("steal") && action2.equals("steal")) {
                    // Both steal, no changes to coins
                }

            }
            return new int[]{person1Coins, person2Coins};
        }

        @Test
        public void testGetCoinBalances() {
            // Test case 1: Both share
            Assert.assertEquals(new int[]{5, 5}, Edabit_Complex.getCoinBalances(new String[]{"share"}, new String[]{"share"}));

            // Test case 2: Person 1 steals, Person 2 shares
            Assert.assertEquals(new int[]{6, 2}, Edabit_Complex.getCoinBalances(new String[]{"steal"}, new String[]{"share"}));

            // Test case 3: Both steal
            Assert.assertEquals(new int[]{3, 3}, Edabit_Complex.getCoinBalances(new String[]{"steal"}, new String[]{"steal"}));

            // Test case 4: Mix of shares and steals
            Assert.assertEquals(new int[]{3, 11}, Edabit_Complex.getCoinBalances(new String[]{"share", "share", "share"}, new String[]{"steal", "share", "steal"}));
        }
    }


