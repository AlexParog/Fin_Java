package com.company;

import java.util.Collection;
import java.util.HashSet;

public class RemoveTheSame {
    public static <T>Collection<T> RemoveTheSame(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
