package Design_Patterns.Observer;

public enum NotificationServiceType {
    Message("message"),
    Notification("notification");

    public String getValue() {
        return value;
    }

    private final String value;

    NotificationServiceType(String value) {
        this.value = value;
    }

}
