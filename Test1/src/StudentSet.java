import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet<S> extends HashSet<Student> {

    @Override
    public int size() {

        return this.size();
    }

    @Override
    public boolean isEmpty() {

        return this.isEmpty();
    }

    @Override
    public boolean contains(Object o) {

        return this.contains(o);
    }

    @Override
    public Iterator<Student> iterator() {
        //TODO
        return null;
    }

    @Override
    public Object[] toArray() {
        //TODO
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Student student) {

        return this.add(student);
    }

    @Override
    public boolean remove(Object o) {

        return this.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Student> collection) {

        return this.addAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        //Ignore this for homework
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.clear();
    }
}
