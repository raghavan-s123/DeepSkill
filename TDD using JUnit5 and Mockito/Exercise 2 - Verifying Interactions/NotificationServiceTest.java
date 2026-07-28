import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class NotificationServiceTest{
@Test
void testNotify(){
Notifier n=mock(Notifier.class);
new NotificationService(n).notifyUser();
verify(n).send("Hello");
}
}
