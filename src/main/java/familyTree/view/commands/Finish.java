package familyTree.view.commands;
import familyTree.view.ConsoleUI;

public class Finish extends Command{

    public Finish(ConsoleUI consoleUI) {
        super(consoleUI, " Завершить работу:");
    }
    @Override
    public void execute() {
        consoleUI.finish();
    }
}
