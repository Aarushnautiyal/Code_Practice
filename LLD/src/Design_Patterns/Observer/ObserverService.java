package Design_Patterns.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ObserverService {
    private final HashMap<NotificationServiceType, List<NotifyServices>> services;

    ObserverService() {
        services = new HashMap<>();
    }

    public void subscribe(NotifyServices notifyService) {
        services.computeIfAbsent(notifyService.getNotificationType(),
                        service -> new ArrayList<>())
                .add(notifyService);
    }

    public void unSubscribe(NotifyServices notifyService) {
        NotificationServiceType type = notifyService.getNotificationType();
        if (services.containsKey(type)) {
            services.get(type).remove(notifyService);
        }
    }

    public void notifyAllServices() {
        services
                .values()
                .stream()
                .flatMap(List::stream)
                .forEach(
                        services ->
                                services.triggerEvent("Something is fishy here")
                );
    }
}
