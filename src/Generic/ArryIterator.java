package Generic;

import java.lang.*;
import java.util.Iterator;

public class ArryIterator<T> implements Iterable<T> {
    private T[] arr = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        arr[count++] = item;
    }

    public T get(int indx) {
        return arr[indx];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private ArryIterator<T> list;
        private int indx;

        public ListIterator(ArryIterator<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (indx < list.count);
        }

        @Override
        public T next() {
            return list.arr[indx++];
        }
    }
}
