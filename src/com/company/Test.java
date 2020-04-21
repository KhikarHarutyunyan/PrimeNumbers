package com.company;

import java.util.ArrayList;

@FunctionalInterface
public interface Test<T> {
    ArrayList<T> test(T n);
}
