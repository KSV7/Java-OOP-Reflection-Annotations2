package com.gmail.kutepov89.sergey;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo {
    String path();
}

@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
@interface Saver {}

@SaveTo(path = "text.txt")
public class TextContainer {
    String s = "Hello world";

    @Saver
    public void save() {
        SaveTextToFile saveText = new SaveTextToFile();
        saveText.saveTextToFile();
    }
}