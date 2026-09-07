package Design_Patterns.Serializable;

import java.io.Serial;
import java.io.Serializable;

public class Serialize  implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
//    this won't be serialised.

    private transient String sensitiveToken;
}
