package familyTree;

import familyTree.Write.FileHandler;
import familyTree.familyTree.FamilyTree;
import familyTree.human.Gender;
import familyTree.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        FamilyTree tree = new FamilyTree();
        //fileHandler.saveInfo(tree,"src/main/java/familyTree/tree.out");
        fileHandler.readInfo("src/main/java/familyTree/tree.out");

        Human alex = new Human(01, "Алексей", Gender.Male, LocalDate.of(1965, 12, 4));
        Human sveta = new Human(02, "Светлана", Gender.Female, LocalDate.of(1967, 5, 29));
        tree.addHuman(alex);
        tree.addHuman(sveta);
        Human olga = new Human(03, "Ольга", Gender.Female, LocalDate.of(1990, 10, 25),
                alex, sveta);
        Human ivan = new Human(03, "Иван", Gender.Female, LocalDate.of(1991, 9, 15),
                alex, sveta);
        tree.addHuman(olga);
        tree.addHuman(ivan);
        Human irina = new Human(05, "Ирина", Gender.Female, LocalDate.of(1944, 7, 20));
        irina.addChild(sveta);
        tree.addHuman(irina);
        System.out.println(tree);

        tree.sortByName();
        System.out.println("Отсортированный список по имени: ");
        System.out.println(tree);
        tree.sortByBirthDate();
        System.out.println("Отсортированный список по возрасту: ");
        System.out.println(tree);
    }
}
