package familyTree.human;

import familyTree.human.Human;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<E> implements Iterator<E> {
    private int ind;
    private List<E> humanList;

    public HumanIterator(List<E> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return ind < humanList.size();
    }
    @Override
    public E next() {
        return humanList.get(ind++);
    }
}
