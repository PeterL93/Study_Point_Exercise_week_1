
import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class Structure {
    public static void main(String[] args) {
        HashMap properties = new HashMap();
        
        properties.put("javax.persistence.sql-load-script-source", "Scripts/data.sql");
        Persistence.generateSchema("jpadb", properties);
        
        properties.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("jpadb", properties);
    }
}
