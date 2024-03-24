package org.example;

import org.example.Exception.IndexIsNotFoundException;
import org.example.Exception.NullConfirmItemException;
import org.example.Exception.StorageLocationIsCrowdedException;
import org.example.Exception.UnacceptableIndexException;

import java.util.Arrays;

public class StringListImpl implements StringList {

    private final String[] storageLocation;
    private int size;

    public StringListImpl() {
        storageLocation = new String[5];
    }

    public StringListImpl(int storageSize) {
        storageLocation = new String[storageSize];
    }

    @Override
    public String add(String item) {
        confirmItem(item);
        confirmSize();
        storageLocation[size+1] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        confirmSize();
        confirmItem(item);
        confirmIndex(index);
        if (index == size) {
            storageLocation[size+1] = item;
            return item;
        }
        System.arraycopy(storageLocation,index,storageLocation,index+1,size-index);
        storageLocation[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        confirmIndex(index);
        confirmItem(item);
        storageLocation[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        confirmItem(item);

        int index = indexOf(item);
        if (index == -1) {
            throw new IndexIsNotFoundException();
        }
        if (index != size) {
            System.arraycopy(storageLocation,index+1,storageLocation,index,size-index);
        }
        size--;
        return item;
    }

    @Override
    public String remove(int index) {
        confirmIndex(index);
        String item = storageLocation[index];
        if (index != size) {
            System.arraycopy(storageLocation,index+1,storageLocation,index,size-index);
        }
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            String s = storageLocation[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size-1; i > 0; i--) {
            String s = storageLocation[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        confirmIndex(index);
        return storageLocation[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(),otherList.toArray());
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size ==0;
    }
    @Override
    public void clear() {
        remove(size);
    }
    @Override
    public String[] toArray() {
        return Arrays.copyOf(storageLocation, size);
    }
    public void confirmItem(String item) {
        if (item == null) {
            throw new NullConfirmItemException();
        }
    }
    public void confirmSize() {
        if (size == storageLocation.length) {
            throw new StorageLocationIsCrowdedException();
        }
    }
    public void confirmIndex(int index) {
        if (index < 0 || index >= size) {
            throw new UnacceptableIndexException();
        }
    }
}
