package com.xxl.job.admin.core.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author zhengtao
 * @Date 2024/8/15 16:05
 * @Description
 **/
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public LRUCache(int capacity, float loadFactor) {
        super(capacity, loadFactor, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}
