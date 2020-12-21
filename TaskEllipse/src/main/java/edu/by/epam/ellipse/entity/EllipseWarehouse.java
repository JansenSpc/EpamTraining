package edu.by.epam.ellipse.entity;

import java.util.HashMap;
import java.util.Map;

public class EllipseWarehouse {

    private static EllipseWarehouse instance;
    private final Map<Long, EllipseData> warehouse;

    public EllipseWarehouse() {
        warehouse = new HashMap<>();
    }

    public static EllipseWarehouse getInstance() {
        if (instance  == null) {
            instance = new EllipseWarehouse();
        }
        return instance;
    }

    public EllipseData get(long key) {
        return warehouse.get(key);
    }

    public boolean remove(EllipseData data, long key) {
        return warehouse.remove(key, data);
    }

    public EllipseData put(EllipseData data, long key) {
        return warehouse.put(key, data);
    }

    public boolean contains(EllipseData data) {
        return warehouse.containsValue(data);
    }

    public boolean contains(long key) {
        return warehouse.containsKey(key);
    }
}
