package com.company ;

import javax.swing.*;

public class Function implements  Labels{
    Main gui;
    public Function(Main gui){
        this.gui=gui;
    }
    public  void pozico(){
        l1.setBounds(10,10,500,500);
        l2.setBounds(510,10,500,500);
        l3.setBounds(1020,20,500,500);
        l4.setBounds(1020, 20,500,500);
    }
    public void Akcio(){

        ImageIcon CODMw=new ImageIcon("Images/codmw.jpg");
        l1.setIcon(CODMw);

        ImageIcon PUBG =new ImageIcon("Images/PUBG.jpg");
        l2.setIcon(PUBG);

        ImageIcon MK =new ImageIcon("Images/MK11.jpg");
        l3.setIcon(MK);

        ImageIcon Doom = new ImageIcon("Images/DOOM.jpg");
        l4.setIcon(Doom);

        pozico();

        gui.window.add(l1);
        gui.window.add(l2);
        gui.window.add(l3);
        gui.window.add(l4);
        gui.window.setTitle("Akcio");
        gui.window.setVisible(true);

    }
    public void Adventure(){
        ImageIcon SwJ=new ImageIcon("Images/SW.jpg");
        l1.setIcon(SwJ);

        ImageIcon ACODY =new ImageIcon("Images/ACODY.jpg");
        l2.setIcon(ACODY);

        ImageIcon LegoSw =new ImageIcon("Images/LegoStarWars.jpg");
        l3.setIcon(LegoSw);

        ImageIcon GOW = new ImageIcon("Images/GOW.jpg");
        l4.setIcon(GOW);

        pozico();

        gui.window.add(l1);
        gui.window.add(l2);
        gui.window.add(l3);
        gui.window.add(l4);
        gui.window.setTitle("Adventure");
        gui.window.setVisible(true);

    }
    public void RPG(){
        ImageIcon GTAV=new ImageIcon("Images/GtaV.jpg");
        l1.setIcon(GTAV);

        ImageIcon DS3 =new ImageIcon("Images/Ds3.jpg");
        l2.setIcon(DS3);

        ImageIcon Witcher3 =new ImageIcon("Images/Witcher3.jpg");
        l3.setIcon(Witcher3);

        ImageIcon Skyrim = new ImageIcon("Images/Skyrim.jpg");
        l4.setIcon(Skyrim);

        pozico();
        gui.window.add(l1);
        gui.window.add(l2);
        gui.window.add(l3);
        gui.window.add(l4);
        gui.window.setTitle("RPG");
        gui.window.setVisible(true);

    }
    public void Simulation(){
        ImageIcon Sims4=new ImageIcon("Images/Sims4.jpg");
        l1.setIcon(Sims4);

        ImageIcon Simcity =new ImageIcon("Images/SimCity.jpg");
        l2.setIcon(Simcity);

        ImageIcon NFSh =new ImageIcon("Images/NFS.jpg");
        l3.setIcon(NFSh);

        pozico();
        gui.window.add(l1);
        gui.window.add(l2);
        gui.window.add(l3);
        gui.window.add(l4);
        gui.window.setTitle("Simulation");
        gui.window.setVisible(true);

    }
    public void Strategy(){
        ImageIcon TotalWar=new ImageIcon("Images/totalwar.jpg");
        l1.setIcon(TotalWar);

        ImageIcon Civ6 =new ImageIcon("Images/Civilization.jpg");
        l2.setIcon(Civ6);

        ImageIcon w3 =new ImageIcon("Images/w3Reforged.jpg");
        l3.setIcon(w3);

        pozico();
        gui.window.add(l1);
        gui.window.add(l2);
        gui.window.add(l3);
        gui.window.add(l4);
        gui.window.setTitle("Strategy");
        gui.window.setVisible(true);

    }
}
