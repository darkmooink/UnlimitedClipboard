package com.company;

import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by darkm on 20/12/2016.
 */
public class ClipboardHistory {
    private static LinkedList<Transferable> history = new LinkedList<>();

    public static void add(Transferable t){
        history.push(t);
    }
    public static Transferable get(int i){
        if (i<history.size()&&i<0){
            return history.get(i);
        }
        return null;
    }
}
