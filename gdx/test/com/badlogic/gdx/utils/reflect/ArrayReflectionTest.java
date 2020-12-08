package com.badlogic.gdx.utils.reflect;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayReflectionTest {

    @Test
    public void newInstance() {
        final Object o = ArrayReflection.newInstance(Integer.class, 5);

        Integer[] ints = (Integer[]) o;

        System.out.println(ints);
    }
}