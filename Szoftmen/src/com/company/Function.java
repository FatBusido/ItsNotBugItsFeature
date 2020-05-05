package com.company;

import javax.swing.*;

public class Function {
    Main gui;
    public Function(Main gui){
        this.gui=gui;
    }
    public void Akcio(){

        gui.window.setTitle("Akcio");
        gui.window.setVisible(true);
    }
}
