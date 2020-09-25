package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public class ArrayStorage {
    //хранилище резюме
    private Resume[] storage = new Resume[10000];
    private int size = 0;

    public void clear() {
        Arrays.fill(storage, size, 0, null);
    }

    public void save(Resume r) {}

    public Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if(uuid == storage[i].getUuid()) {
                return storage[i];
            }
        }
        return null;
    }

    public void delete(String uuid) {}

    Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    public int size() {
        return 0;
    }
}
