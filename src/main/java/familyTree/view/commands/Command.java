package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public abstract class Command {
    ConsoleUI consoleUI;
    private String describtion;

    public Command(ConsoleUI consoleUI, String describtion) {
        this.consoleUI = consoleUI;
        this.describtion = describtion;
    }

    public String getDescribtion() {
        return describtion;
    }
    public  abstract void execute();
}
