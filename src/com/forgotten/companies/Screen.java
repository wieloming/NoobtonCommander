package com.forgotten.companies;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Screen extends JPanel {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;
    private JTextArea textArea;
    String[][] screenArray = new String[HEIGHT][WIDTH];

    public Screen() {
        super();

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
        setLayout(new GridLayout());

        textArea = new JTextArea();
        textArea.setFont(new Font("Consolas", Font.PLAIN, 12));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        add(textArea);

        addToScreen(
                new Table(
                        new Point(0, 0),
                        new FileBrowseEngine().listFiles(
                                new File("C:\\Users\\Łukasz\\Desktop")
                        )
                )
        );
        addToScreen(
                new Table(
                        new Point(60, 0),
                        new FileBrowseEngine().listFiles(
                                new File("C:\\Users\\Łukasz\\Desktop")
                        )
                )
        );

        draw();
    }

    public void addToScreen(Drawable objectToAdd) {
        String[][] arrayToAdd = objectToAdd.toDrawableArray();
        for (int i = 0; i < arrayToAdd.length; i++) {
            for (int j = 0; j < arrayToAdd[i].length; j++) {
                screenArray[i + objectToAdd.getStartY()][j + objectToAdd.getStartX()] = arrayToAdd[i][j];
            }
        }
    }

    public void draw() {
        String textToPrint = "";
        StringBuilder sb = new StringBuilder(textToPrint);
        for (String[] row : screenArray) {
            for (String element : row) {
                if (element == null) {
                    element = " ";
                }
                sb.append(element);
            }
            sb.append("\n");
        }
        textArea.setText(sb.toString());
    }
}
