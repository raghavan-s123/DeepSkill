import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AssertionsTest{
@Test
void testAssertions(){
assertTrue(10>5);
assertEquals("Hello","Hello");
assertNotNull(new Object());
}
}
