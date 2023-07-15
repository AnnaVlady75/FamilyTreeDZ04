package familyTree.model.Write;

import java.io.Serializable;

public interface Writable {
    boolean saveInfo(Serializable serializable,String file);
    Object readInfo(String file);
}
