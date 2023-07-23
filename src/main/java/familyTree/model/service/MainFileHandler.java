package familyTree.model.service;

import familyTree.model.write.FileHandler;

public abstract class MainFileHandler extends FileHandler {
    FileHandler fileHandler;
    String file;
    public MainFileHandler() {

        fileHandler = new FileHandler();
        file = "src/main/java/familyTree/model/write/tree.out";
    }

}
