package com.company;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;

/**
 * Created by darkm on 21/12/2016.
 */
public class ClipboardOwning implements ClipboardOwner {
    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        ClipboardHistory.add(contents);
        clipboard.setContents(contents, this);
        System.out.println("changed clipboard");
    }
}
