package familyTree;

import familyTree.model.service.ServiceHuman;

public class Main {
    public static void main(String[] args) {
        //FileHandler fileHandler = new FileHandler();

        //fileHandler.saveInfo(tree,"src/main/java/familyTree/Write/tree.out");
        //fileHandler.readInfo("src/main/java/familyTree/Write/tree.out");
        ServiceHuman service = new ServiceHuman();

        System.out.println(service);

        service.sortByName();
        System.out.println("Отсортированный список по имени: ");
        System.out.println(service);
        service.sortByBirthDate();
        System.out.println("Отсортированный список по возрасту: ");
        System.out.println(service);
    }
}
