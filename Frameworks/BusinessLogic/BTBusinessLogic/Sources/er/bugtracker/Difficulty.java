// Difficulty.java
// 
package er.bugtracker;
import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;

public class Difficulty extends _Difficulty {
    static final Logger log = Logger.getLogger(Difficulty.class);

    public Difficulty() {
        super();
    }

    @Override
    public void init(EOEditingContext ec) {
        super.init(ec);
    }
    
    
    // Class methods go here
    
    public static class DifficultyClazz extends _DifficultyClazz {
        
    }

    public static DifficultyClazz clazz = new DifficultyClazz();
}
