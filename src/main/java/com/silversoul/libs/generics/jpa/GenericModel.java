package com.silversoul.libs.generics.jpa;

public class GenericModel<T> {
    private T value;

    public GenericModel(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    

}
