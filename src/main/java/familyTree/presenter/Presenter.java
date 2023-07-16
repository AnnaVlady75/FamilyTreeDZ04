package familyTree.presenter;

import familyTree.Main;
import familyTree.model.familyTree.FamilyTree;
import familyTree.model.service.ServiceHuman;
import familyTree.view.View;

public class Presenter {
    private View view;
    private ServiceHuman service;

    public Presenter(View view) {
        this.view = view;
        service = new ServiceHuman();
    }

    public void getFamilyTree() {
//        service.getHumanInfo();
        view.printAnswer(service.getHumanInfo());
    }
    public void sortByName() {
        service.sortByName();
        getFamilyTree();
    }
    public void sortByAge() {
        service.sortByBirthDate();
        getFamilyTree();
    }

    public void saveIntoFile() {
        service.saveInfo();
    }

    public void readInfoFromFile() {
        service.readInfo();
    }
}
