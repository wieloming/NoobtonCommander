package com.forgotten.companies;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Table implements Drawable {

    private Point position;
    private ArrayList<String> listOfFiles;

    public Table(Point start, ArrayList<String> list) {
        position = start;
        listOfFiles = list;
    }

    public int getStartX() {
        return (int)position.getX();
    }

    public int getStartY() {
        return (int)position.getY();
    }

    public String[][] toDrawableArray() {
        String[][] drawableArray = new String[listOfFiles.size()][];
        int rowNum = 0;
        for (String row : listOfFiles) {
            String[] splittedRow = row.split("");
            drawableArray[rowNum] = splittedRow;
            rowNum++;
        }
        return drawableArray;
    }
}
