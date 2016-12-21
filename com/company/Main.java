package com.company;

import java.awt.datatransfer.ClipboardOwner;

public class Main {

    public static void main(String[] args) {
        LiveClipboard textTransfer = new LiveClipboard();
        ClipboardOwner co = new ClipboardOwning();
            //display what is currently on the clipboard
            System.out.println("Clipboard contains:" + textTransfer.getClipboardContents());

            //change the contents and then re-display
            textTransfer.setClipboardContents("blah, blah, blah");
            System.out.println("Clipboard contains:" + textTransfer.getClipboardContents());
        }
}
