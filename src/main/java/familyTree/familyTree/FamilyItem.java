package familyTree.familyTree;

import familyTree.human.Human;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface FamilyItem<T> extends Serializable {
    T getFather();
    T getMother();
    int getId();
    boolean addChild(T Human);
    boolean addParent(T Human);
    String getName();
    LocalDate getBirthDate();
    LocalDate getDeathDate();
    List<T> getParents();
    List<T> getChildren();

}
