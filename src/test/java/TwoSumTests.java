import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTests {
    @Test
    public void shouldReturnAdjacentTwoSum() {
        //Arrange
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        //Act
        int[] result = TwoSum.twoSum(nums, target);
        //Assert
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    public void shouldReturnDeeperAdjacentTwoSum() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1,2};

        int[] result = TwoSum.twoSum(nums, target);

        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    public void shouldReturnDeeperNonAdjacentTwoSum() {
        int[] nums = {1, 2, 3, 4, 7};
        int target = 6;
        int[] expected = {1, 3};

        int[] result = TwoSum.twoSum(nums, target);

        Assertions.assertArrayEquals(expected, result);
    }
}
