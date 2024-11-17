package br.com.richmont;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        InitialWindow janela = new InitialWindow();
        janela.setVisible(true);

        /*
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                InitialWindow janela = new InitialWindow();
                janela.setVisible(true); }
        });*/
    }
}