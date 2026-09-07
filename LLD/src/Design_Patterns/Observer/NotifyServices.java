package Design_Patterns.Observer;

public interface NotifyServices {
    void triggerEvent(String message);
    NotificationServiceType getNotificationType();
}