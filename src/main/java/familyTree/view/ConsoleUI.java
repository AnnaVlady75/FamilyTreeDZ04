package familyTree.view;

import familyTree.model.human.Gender;
import familyTree.presenter.Presenter;
//import familyTree.presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Добро пожаловать!");
        while (work) {
            System.out.println(menu.menu());
            System.out.println("Введите номер запроса: ");
            String choice = scanner.nextLine();
            int numChoice = Integer.parseInt(choice);
            if (numChoice > menu.getSize() || numChoice < 0) {
                System.out.println("Такой команды нет, попробуйте снова");
            } else menu.execute(numChoice);
        }
    }
    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    public void finish() {
        System.out.println("До свидания!");
        work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getFamilyTree() {
        presenter.getFamilyTree();
    }
}
