package familyTree;

import familyTree.model.service.ServiceHuman;
import familyTree.view.ConsoleUI;
import familyTree.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();

        //FileHandler fileHandler = new FileHandler();
        //fileHandler.saveInfo(tree,"src/main/java/familyTree/model/Write/tree.out");
        //fileHandler.readInfo("src/main/java/familyTree/model/Write/tree.out");

//        ServiceHuman service = new ServiceHuman();
//
//        System.out.println(service);
//        service.sortByName();
//        System.out.println("Отсортированный список по имени: ");
//        System.out.println(service);
//        service.sortByBirthDate();
//        System.out.println("Отсортированный список по возрасту: ");
//        System.out.println(service);
    }
}
