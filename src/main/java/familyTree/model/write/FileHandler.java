package familyTree.model.write;

import java.io.*;

public class FileHandler implements Writable{

    public boolean saveInfo(Serializable serializable, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(serializable);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Object readInfo(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            return objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
