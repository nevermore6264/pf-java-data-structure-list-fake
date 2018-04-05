
import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    protected int modCount = 0;

    //Phương thức khởi tạo không tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Phương thức khởi tạo có tham số
    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    //Phương thức add
    public void add(int index, E element) {

    }


    //Phương thức remove
    public E remove(int index) {
        Objects.checkIndex(index, size);
        final Object[] es = elements;
        E oldValue = (E) es[index];
        fastRemove(es, index);
        return oldValue;
    }

    private void fastRemove(Object[] es, int i) {
        modCount++;
        final int newSize;
        if ((newSize = size - 1) > i) {
            System.arraycopy(es, i + 1, es, i, newSize - i);
        }
        es[size = newSize] = null;
    }

    //Phương thức clone()
//    public Object cloneObject() {
//
//    }

    //Phương thức size
    public int size() {
        return size;
    }

    //Phương thức contains
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    //Phương thức indexOf
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }


    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    //Phương thức ensureCapacity
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Phương thức get
    public E get(int i) {
        return (E) elements[i];
    }

    //Phương thức clear
    public void clear() {
        modCount++;
        final Object[] es = elements;
        for (int to = size, i = size = 0; i < to; i++) {
            es[i] = null;
        }
    }

}