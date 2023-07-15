package familyTree.view.commands;
import familyTree.view.ConsoleUI;

public class GetHumanInfo extends Command{
    public GetHumanInfo(ConsoleUI consoleUI) {
        super(consoleUI, " Вывести семейное дерево: ");
    }
    @Override
    public void execute() {
        consoleUI.getFamilyTree();
    }
}
