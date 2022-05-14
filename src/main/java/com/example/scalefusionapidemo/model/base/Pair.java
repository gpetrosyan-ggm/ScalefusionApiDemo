package com.example.scalefusionapidemo.model.base;

public class Pair<U, V> {
    public final U key;
    public final V value;

    private Pair(U key, V value) {
        this.key = key;
        this.value = value;
    }

    public U getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static <U, V> Pair<U, V> of(U a, V b) {
        // calls private constructor
        return new Pair<>(a, b);
    }

}