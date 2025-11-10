package br.com.richmont;

import view.WindowManager;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        javax.swing.SwingUtilities.invokeLater(() -> {
        	WindowManager.showInitialWindow();
        });
    }
}
