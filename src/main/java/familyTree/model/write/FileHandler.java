package familyTree.model.write;

import familyTree.model.write.Writable;

import java.io.*;

public class FileHandler implements Writable {
    String file = "src/main/java/familyTree/model/write/tree.out";
    public String getFile() {
        return file;
    }
    @Override
    public boolean saveInfo(Serializable serializable, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(serializable);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object readInfo(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            return objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
