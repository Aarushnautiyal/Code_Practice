package Design_Patterns.Observer;

public class NotificationService implements NotifyServices{
    public void triggerEvent(String message){
        System.out.printf("Hey Notification triggered for user as --> %s%n",message);
    }

    @Override
    public NotificationServiceType getNotificationType() {
        return NotificationServiceType.Notification;
    }
}
