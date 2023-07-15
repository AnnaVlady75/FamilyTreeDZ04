package familyTree.model.familyTree;

import familyTree.model.human.Human;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface FamilyItem<T> extends Serializable,Comparable<Human>{
    T getFather();
    T getMother();
    boolean addChild(T Human);
    boolean addParent(T Human);
    String getName();
    LocalDate getBirthDate();
    LocalDate getDeathDate();
    List<T> getParents();
    List<T> getChildren();
}
