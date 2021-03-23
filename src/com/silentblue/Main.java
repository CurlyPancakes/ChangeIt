package com.silentblue;

import com.silentblue.function.Actions;

import java.io.File;
import java.nio.file.attribute.FileTime;

public class Main {
    public static void main(String[] args) {
        //Example
        Actions.changeAttribute(new File("./test.txt"), "creationTime", FileTime.fromMillis(1426518838000L));
    }
}
