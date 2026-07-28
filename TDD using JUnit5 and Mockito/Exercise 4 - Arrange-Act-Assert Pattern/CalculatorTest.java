import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest{
Calculator c;
@BeforeEach
void setup(){c=new Calculator();}
@Test
void testMultiply(){
int r=c.multiply(2,3);
assertEquals(6,r);
}
}
