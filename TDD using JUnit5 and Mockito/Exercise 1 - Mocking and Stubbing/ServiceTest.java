import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class ServiceTest{
@Test
void testFetch(){
ExternalApi api=mock(ExternalApi.class);
when(api.getData()).thenReturn("Mock");
assertEquals("Mock",new Service(api).fetch());
}
}
