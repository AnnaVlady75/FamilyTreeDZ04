package familyTree;

import familyTree.familyTree.FamilyItem;
import familyTree.familyTree.FamilyTree;
import familyTree.human.Gender;
import familyTree.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //FileHandler fileHandler = new FileHandler();

        //FamilyTree tree = new FamilyTree();
        //fileHandler.saveInfo(tree,"src/main/java/familyTree/Write/tree.out");
        //fileHandler.readInfo("src/main/java/familyTree/Write/tree.out");
        FamilyTree familyTree = new FamilyTree<>();
        Human alex = new Human(01,"Алексей", Gender.Male, LocalDate.of(1965, 12, 4));
        Human sveta =  new Human(02, "Светлана", Gender.Female, LocalDate.of(1967, 5, 29));
        familyTree.addHuman(alex);
        familyTree.addHuman(sveta);
        Human olga = new Human(03,"Ольга", Gender.Female, LocalDate.of(1990, 10, 25),
                alex, sveta);
        Human ivan = new Human(04, "Иван", Gender.Female, LocalDate.of(1991, 9, 15),
                alex, sveta);
        familyTree.addHuman(olga);
        familyTree.addHuman(ivan);
        Human irina = new Human(05, "Ирина", Gender.Female, LocalDate.of(1944, 7, 20));
        familyTree.addHuman( irina);
        irina.addChild(sveta);

        System.out.println(familyTree);

        familyTree.sortByName();
        System.out.println("Отсортированный список по имени: ");
        System.out.println(familyTree);
        familyTree.sortByBirthDate();
        System.out.println("Отсортированный список по возрасту: ");
        System.out.println(familyTree);
    }
}
