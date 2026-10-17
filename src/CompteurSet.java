import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CompteurSet <E > implements Set<E > {
    private final Set <E > interne ; // COMPOSITION
    private int nbAjouts = 0;
    public CompteurSet ( Set <E > interne ) {
        this . interne = interne ;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override public boolean add (E e) {
        nbAjouts ++;
        return interne . add ( e); // DELEGATION
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override public boolean addAll ( Collection <? extends E > c) {
        nbAjouts += c. size () ;
        return interne . addAll (c ); //
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public int getNbAjouts () {
        return nbAjouts ;
    }
}
