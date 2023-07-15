package familyTree.model.familyTree;

import familyTree.model.human.comparators.HumanComparatorByBirthDate;
import familyTree.model.human.comparators.HumanComparatorByName;
import familyTree.model.human.HumanIterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends FamilyItem<E>> implements Serializable, Iterable<E>{
    private List<E> humanList;
    public FamilyTree(List<E> humanList){
        this.humanList = humanList;
    }
    public FamilyTree(){
        this(new ArrayList<>());
    }
    public boolean addHuman(E human){
        if (human == null){
            return false;
        }
        if (!humanList.contains(human)){
            humanList.add(human);

            addToParents(human);
            addToChildren(human);
            return true;
        }
        return false;
    }
    private void addToParents(E human){
        for (E parent:human.getParents()){
            parent.addChild(human);
        }
    }
    private void addToChildren(E human){
        for (E child:human.getChildren()){
            child.addParent(human);
        }
    }
    public List<E> getByName(String name){
        List<E> res = new ArrayList<>();
        for (E human:humanList){
            if (human.getName().equalsIgnoreCase(name)){
                res.add(human);
            }
        }
        return res;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("в семейном дереве: ");
        sb.append(humanList.size());
        sb.append(" членов семьи:\n");
        for (E human:humanList){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return getInfo();
    }
    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(humanList);
    }
    public void sortByName(){
        humanList.sort(new HumanComparatorByName<>());
    }
    public void sortByBirthDate(){
        humanList.sort(new HumanComparatorByBirthDate<>());
    }
}
