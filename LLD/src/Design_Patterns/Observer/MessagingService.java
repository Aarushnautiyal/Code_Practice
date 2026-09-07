package Design_Patterns.Observer;

public class MessagingService implements NotifyServices{
    public void triggerEvent(String message){
        System.out.printf("Hey Message triggered for user as --> %s%n",message);
    }

    @Override
    public NotificationServiceType getNotificationType() {
        return NotificationServiceType.Message;
    }
}
