package com.forgotten.companies;

import java.io.File;
import java.util.ArrayList;

public class FileBrowseEngine {

    public ArrayList<String> listFiles(File folder) {
        File[] files = folder.listFiles();
        ArrayList<String> folderFiles = new ArrayList<String>();
//        folderFiles.add("..");
        for (final File fileEntry : files) {
            folderFiles.add(fileEntry.getName());
        }
        return folderFiles;
    }
}
