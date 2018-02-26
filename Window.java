/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author ionut.tenea
 */
public class Window {
    JFrame window;
    JPanel panel;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JLabel label1;
    GridLayout grid;
    JTextField textField;
    public Window(){
    window = new JFrame("Baza");
    panel = new JPanel();
    menuBar = new JMenuBar();
    menu = new JMenu("Test");
    menuItem = new JMenuItem("Close");
    label1 = new JLabel("Numar Masina: ");
    textField = new JTextField(20);
    grid = new GridLayout(3,2);
    window.add(panel, BorderLayout.CENTER);
    window.add(menuBar, BorderLayout.NORTH);
    menuBar.add(menu);
    menu.add(menuItem);
    panel.setLayout(grid);
    panel.add(label1);
    panel.add(textField);
    window.setSize(800,600);
    window.setVisible(true);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
    public static void main (String[] args){
        Window w = new Window();
    }
}
