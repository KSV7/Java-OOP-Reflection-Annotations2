package com.gmail.kutepov89.sergey;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveTextToFile {
    public void saveTextToFile() {
        final Class<?> cls = TextContainer.class;
        SaveTo an = cls.getAnnotation(SaveTo.class);
        TextContainer tc = new TextContainer();

        try (PrintWriter a = new PrintWriter(an.path())) {
            a.println(tc.s);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }
    }
}