public class NotificationService{
private final Notifier notifier;
public NotificationService(Notifier notifier){this.notifier=notifier;}
public void notifyUser(){notifier.send("Hello");}
}
