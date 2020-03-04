package com.company;

import java.awt.AWTException;
import java.awt.DisplayMode;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.util.Random;

public class MSEQ {
   public  House myHouse;

    MSEQ() {
        myHouse = new House();
    //    reportMouseOnScreen();

    }
public void reportMouseOnScreen() {
        while (true) {
            try {
                PointerInfo pntInfo = MouseInfo.getPointerInfo();
                System.out.println(pntInfo.getLocation());
                DisplayMode dispMode = pntInfo.getDevice().getDisplayMode();
                int newX = new Random().nextInt(dispMode.getWidth());
                int newY = new Random().nextInt(dispMode.getHeight());
                //    new Robot(pntInfo.getDevice()).mouseMove(newX, newY);
                //} catch (AWTException exception) {
            } catch (Exception exception) {
            }
        }
    }
}
