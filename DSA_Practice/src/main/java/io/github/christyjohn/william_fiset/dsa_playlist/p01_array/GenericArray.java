package io.github.christyjohn.william_fiset.dsa_playlist.p01_array;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class GenericArray<T> implements Iterable<T> {

    private T[] arr;
    private int len = 0; // length user thinks array is
    private int capacity = 0; // Actual array length

    public GenericArray() {
        this(16);
    }

    public GenericArray(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[] ) new Object[capacity];
    }

    // Returns the size of the array
    public int size() { return len; }

    // Returns true/false on whether the array is empty
    public boolean isEmpty() { return this.size() == 0; }

    public T get(int index) {
        if (index < 0 || index >= len)
            throw new IndexOutOfBoundsException("Index: " + index);
        return arr[index];
    }

    public void set(int index, T elem ) {
        if (index < 0 || index >= len)
            throw new IndexOutOfBoundsException("Index: " + index);
        arr[index] = elem;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++)
            arr[i] = null;
        len = 0;
    }

    // Add an element to this dynamic array
    public void add (T elem) {
        if (len == capacity) {
            if (capacity == 0)
                capacity = 1;
            else
                capacity *= 2;
        }

        T[] new_arr = (T[]) new Object[capacity];
        for(int i = 0; i < len; i++)
            new_arr[i] = arr[i];

        arr = new_arr; // arr has extra nulls padded

        arr[len++] = elem;
    }

    // removes element at the specified index in this list.
    // If possible, avoid calling this method as it takes O(n) time
    // to remove an element (since you have to shift elements).
    public T removeAt(int rm_index) {
        if (rm_index >= len || rm_index < 0)
            throw new IndexOutOfBoundsException();

        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len-1];

        for(int i = 0, j = 0; i < len; i++, j++) {
            if(i == rm_index)
                j--; // Skip over rm_index by fixing j temporarily
            else
                new_arr[j] = arr[i];
        }

        arr = new_arr;
        --len;

        return data;
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < len; i++) {
            if(arr[i].equals(obj)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < len; i++)
            if (arr[i].equals(obj))
                return i;
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    // Reverse the contents of this array
    public void reverse() {
        for (int i = 0; i < len / 2; i++) {
            T tmp = (T) arr[i];
            arr[i] = arr[len - i -1];
            arr[len - i - 1] = tmp;
        }
    }

    // Iterator is still fast but not as fast as iterative for loop
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString() {
        if (len == 0) return "[]";
        else {
            StringBuilder sb = new StringBuilder( len ).append("[");
            for(int i = 0; i < len - 1; i++)
                sb.append(arr[i] + ", ");
            return sb.append(arr[len - 1] + "]").toString();
        }
    }

    public static void main(String[] args) {
        GenericArray<Integer> ar = new GenericArray<>(2);
        System.out.println("len: " + ar.len + ", capacity: " + ar.capacity);

        ar.add(2);
        ar.add(3);
        ar.add(4);

        System.out.println(ar.toString());
        System.out.println("len: " + ar.size() + ", capacity: " + ar.capacity);

        ar.remove(2);

        System.out.println(ar.toString());
        System.out.println("len: " + ar.len + ", capacity: " + ar.capacity);

    }
}
