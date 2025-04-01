package jay.frc.util;

import java.util.Iterator;
import java.util.List;

public class OrderedList<T>  implements Iterable<T> {

    private int off = 0;
    private T buffer[];

    @SuppressWarnings("unchecked")
    public OrderedList() {
        buffer = (T[])new Object[1 << 4];
    }

    @SuppressWarnings("unchecked")
    public void add(T item) {
        buffer[off++] = item;
        if(off == buffer.length) {
            T next[] = (T[])new Object[off * 2];
            for(int i = 0; i < buffer.length; i++) next[i] = buffer[i];
        }
    }

    public T get(int index) {
        return buffer[index];
    }

    public int size() {
        return off;
    }

    @Override
    public Iterator<T> iterator() {
        return new OrderedListIterator(this);
    }

    private class OrderedListIterator implements Iterator<T> {

        private int offset = 0;
        private OrderedList<T> list;

        private OrderedListIterator(OrderedList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return offset < list.size();
        }

        @Override
        public T next() {
            return list.get(offset++);
        }
    }

}
