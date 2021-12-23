package com.gmail.kutepov89.sergey;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        final Class<?> cls = TextContainer.class;

        Method[] methods = cls.getMethods();
        for (Method method: methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                TextContainer tc = new TextContainer();
                tc.save();
            }
        }
    }
}
