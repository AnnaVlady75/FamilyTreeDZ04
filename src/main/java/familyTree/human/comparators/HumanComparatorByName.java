package familyTree.human.comparators;

import java.util.Comparator;

import familyTree.familyTree.FamilyItem;
import familyTree.human.Human;

public class HumanComparatorByName<E extends FamilyItem>implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
