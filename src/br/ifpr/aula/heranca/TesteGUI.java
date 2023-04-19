package br.ifpr.aula.heranca;

import javax.swing.JFrame;

public class TesteGUI extends JFrame{
    public static void main(String[] args) {
        TesteGUI teste = new TesteGUI();
        teste.setSize(200, 200);
        teste.setTitle("Oi");
        teste.setVisible(true);
    }
}
