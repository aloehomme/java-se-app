public class ArrayStorage {
    //хранилище резюме
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {}

    void save(Resume r) {}

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if(uuid == storage[i].uuid) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {}

    Resume[] getAll() {
        return new Resume[0];
    }

    int size() {
        return 0;
    }
}
