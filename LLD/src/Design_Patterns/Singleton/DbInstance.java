package Design_Patterns.Singleton;

import java.util.Objects;

public class DbInstance {
    private static volatile DbInstance dbInstance;

    private DbInstance() {
    }

    public static DbInstance getDbInstance() {
        if (Objects.isNull(dbInstance)) {
            synchronized (DbInstance.class) {

                if (Objects.isNull(dbInstance)) dbInstance = new DbInstance();
            }
        }
        return dbInstance;
    }
}
