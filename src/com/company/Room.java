package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;









public class Room {
    private final int numberOfRows=5;
    private final int numberOfColums=16;
    float transp;
    float volume;
    int vol;
    float release;
    int rel;
    int transpose;
    int prg=0;
    int bank=0;
    int[] pitch1 = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int[] note1 = new int[16];
    int[] note2 = new int[16];
    int[] note3 = new int[16];
    int[] note4 = new int[16];
    int[] note5 = new int[16];
    int[] nnote1 = new int[16];
    int[] nnote2 = new int[16];
    int[] nnote3 = new int[16];
    int[] nnote4 = new int[16];
    int[] nnote5 = new int[16];
    int[] chord1 = { 3, 7, 10, 14};

    //int colour=color(255, 0, 0);
    int windows=2;
    String name="";
    int mc=0;
    boolean wifi=false;
    boolean isDefined=false;

    Room() {

        Rasta[][] rasta = new Rasta[numberOfRows][numberOfColums];
        // A loop to evenly space out the buttons along the window
        for (int x = 0; x < numberOfRows; x++) {
            for (int y = 0; y < numberOfColums; y++) {
               rasta[x][y]=new Rasta();
            }
        }
//
        // get the screen size as a java dimension
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

// get 2/3 of the height, and 2/3 of the width
        int height = screenSize.height * 2 / 3;
        int width = screenSize.width * 2 / 3;

// set the jframe height and width

        //
        JFrame frame = new JFrame("Selecting Toggle");
       frame.setSize(new Dimension(width, height));
        frame.setPreferredSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToggleButton toggleButton = new JToggleButton("Toggle Button");
        //toggleButton.setHorizontalAlignment(JToggleButton.EAST);
        final JToggleButton toggleButton1 = new JToggleButton("Another Toggle Button");
        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                System.out.println("Action - selected=" + selected + "\n");
                toggleButton1.setSelected(selected);
            }
        };
        toggleButton.addActionListener(actionListener);
        frame.add(toggleButton, BorderLayout.NORTH);
        frame.add(toggleButton1, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        //


    }
}
