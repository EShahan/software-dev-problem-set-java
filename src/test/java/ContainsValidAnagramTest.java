import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsValidAnagramTest {
    @Test
    public void ShouldDetectAnagram() {
        //Arrange
        String s = "anagram";
        String t = "magaran";
        //Act
        boolean result = ContainsValidAnagram.containsValidAnagram(s, t);
        //Assert
        Assertions.assertTrue(result);
    }
    @Test
    public void ShouldNotDetectAnagram() {
        //Arrange
        String s = "rat";
        String t = "car";
        //Act
        boolean result = ContainsValidAnagram.containsValidAnagram(s, t);
        //Assert
        Assertions.assertFalse(result);
    }
    @Test
    public void ShouldDetectAnagramLetterCount() {
        //Arrange
        String s = "ball";
        String t = "bbal";
        //Act
        boolean result = ContainsValidAnagram.containsValidAnagram(s, t);
        //Assert
        Assertions.assertFalse(result);
    }
}
