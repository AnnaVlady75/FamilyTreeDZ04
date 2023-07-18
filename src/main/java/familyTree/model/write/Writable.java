package familyTree.model.write;

import java.io.Serializable;

public interface Writable {
    FileHandler fileHandler = new FileHandler();
    boolean saveInfo(Serializable serializable,String file);
    Object readInfo(String file);
}
