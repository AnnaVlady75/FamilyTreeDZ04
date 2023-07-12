package familyTree.human.comparators;
import familyTree.familyTree.FamilyItem;
import familyTree.human.Human;
import java.util.Comparator;

public class HumanComparatorByBirthDate<E extends FamilyItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
