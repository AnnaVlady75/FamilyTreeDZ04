package familyTree.model.write;

import java.io.Serializable;

public interface Writable extends Serializable {

    boolean saveInfo(Serializable serializable,String file);
    Object readInfo(String file);

}
