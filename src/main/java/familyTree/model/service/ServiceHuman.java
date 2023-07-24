package familyTree.model.service;

import familyTree.model.familyTree.FamilyTree;
import familyTree.model.human.Gender;
import familyTree.model.human.Human;

import java.time.LocalDate;
public class ServiceHuman extends MainFileHandler {
    private FamilyTree<Human> tree;
    public ServiceHuman() {
        tree = testTree();
    }

    FamilyTree<Human> testTree() {
        tree = new FamilyTree<>();
        Human alex = new Human(01,"Алексей", Gender.Male, LocalDate.of(1965, 12, 4));
        Human sveta =  new Human(02, "Светлана", Gender.Female, LocalDate.of(1967, 5, 29));
        tree.addHuman(alex);
        tree.addHuman(sveta);
        Human olga = new Human(03,"Ольга", Gender.Female, LocalDate.of(1990, 10, 25),
                alex, sveta);
        Human ivan = new Human(04, "Иван", Gender.Female, LocalDate.of(1991, 9, 15),
                alex, sveta);
        tree.addHuman(olga);
        tree.addHuman(ivan);
        Human irina = new Human(05, "Ирина", Gender.Female, LocalDate.of(1944, 7, 20));
        tree.addHuman( irina);
        irina.addChild(sveta);
        return tree;
    }
    public String getHumanInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Семейное дерево: \n");
        for (Object human:tree){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return getHumanInfo();
    }
    public void sortByName(){
        tree.sortByName();
    }
    public void sortByBirthDate(){
        tree.sortByBirthDate();
    }

    public boolean saveInfo() {
        return fileHandler.saveInfo(tree,file);
    }
    public void readInfo() {
        tree = (FamilyTree<Human>) fileHandler.readInfo(file);
    }
}


