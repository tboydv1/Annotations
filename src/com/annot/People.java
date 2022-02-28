package com.annot;

import java.util.ListResourceBundle;

public class People extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"john", new Person("John", 30)}
        };
    }
}
