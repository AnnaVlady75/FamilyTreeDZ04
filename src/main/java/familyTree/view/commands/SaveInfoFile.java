package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public class SaveInfoFile extends Command{

    public SaveInfoFile(ConsoleUI consoleUI) {
        super(consoleUI, " Сохранить данные в файл:");
    }
    @Override
    public void execute() {
        consoleUI.saveIntoFile();
    }
}
