package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public class ReadInfoFromFile extends Command {

    public ReadInfoFromFile(ConsoleUI consoleUI) {
        super(consoleUI, " Выгрузить данные из файла:");
    }

    @Override
    public void execute() {
        consoleUI.readInfoFromFile();
    }
}
