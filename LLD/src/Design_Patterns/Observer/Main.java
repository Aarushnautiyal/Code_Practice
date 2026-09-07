package Design_Patterns.Observer;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        MessagingService messagingService = new MessagingService();
        ObserverService observerService = new ObserverService();
        observerService.subscribe(messagingService);
        observerService.subscribe(notificationService);
        observerService.notifyAllServices();
    }
}
