package Design_Patterns.Singleton;

import java.util.Objects;

public class DbInstance {
    private volatile DbInstance dbInstance;
    public DbInstance getDbInstance(){
        if(Objects.nonNull(dbInstance)){
            synchronized (DbInstance.class){
                dbInstance = new DbInstance();
            }
        }
        return dbInstance;
    }
}
