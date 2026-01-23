import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTests {
    @Test
    public void ShouldDetectDuplicate() {
        //Arrange
        int[] nums = {1, 2, 3, 1};
        //Act
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        //Assert
        Assertions.assertTrue(result);
    }
    @Test
    public void ShouldNotDetectDuplicate() {
        //Arrange
        int[] nums = {1,2,3,4};
        //Act
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        //Assert
        Assertions.assertFalse(result);
    }
    @Test
    public void ShouldDetectMultipleDuplicate() {
        //Arrange
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        //Act
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        //Assert
        Assertions.assertTrue(result);
    }
}