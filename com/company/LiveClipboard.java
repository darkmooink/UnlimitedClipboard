//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class LiveClipboard implements ClipboardOwner {
public static ClipboardOwner co = new ClipboardOwning();
    public static void main(String[] args) {
        LiveClipboard textTransfer = new LiveClipboard();
        System.out.println("Clipboard contains:" + textTransfer.getClipboardContents());
        textTransfer.setClipboardContents("blah, blah, blah");
        System.out.println("Clipboard contains:" + textTransfer.getClipboardContents());
    }

    public void lostOwnership(Clipboard aClipboard, Transferable aContents) {
    }

    public void setClipboardContents(String aString) {
        StringSelection stringSelection = new StringSelection(aString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, co);
    }

    public String getClipboardContents() {
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents((Object)null);
        boolean hasTransferableText = contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if(hasTransferableText) {
            try {
                result = (String)contents.getTransferData(DataFlavor.stringFlavor);
            } catch (IOException | UnsupportedFlavorException var6) {
                System.out.println(var6);
                var6.printStackTrace();
            }
        }

        return result;
    }
}
