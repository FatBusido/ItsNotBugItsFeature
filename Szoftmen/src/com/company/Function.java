package com.company ;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.security.PublicKey;
import java.util.ArrayList;

public class Function implements  Labels, ActionListener {
    Main gui;
    public Function(Main gui){
        this.gui=gui;
    }
    public  void Implements(){
        l1.setBounds(10,10,450,500);
        l2.setBounds(500,10,450,500);
        l3.setBounds(950,10,450,500);
        l4.setBounds(1400, 10,450,500);

        Storage1.setBounds(60,500,50,50);
        Storage2.setBounds(550,500,50,50);
        Storage3.setBounds(1000,500,50,50);
        Storage4.setBounds(1450,500,50,50);

        gui.window.add(Storage1);gui.window.add(Storage2);gui.window.add(Storage3);gui.window.add(Storage4);
        gui.window.add(l1);gui.window.add(l2);gui.window.add(l3);gui.window.add(l4);gui.window.add(l5);


    }
    public void ImplementsButtons(){
        Text_game1.setBounds(60,600,50,50);
        Text_game2.setBounds(550,600,50,50);
        Text_game3.setBounds(1000,600,50,50);
        Text_game4.setBounds(1450,600,50,50);

        BPay.setBounds(1750,900,100,50);
        gui.window.add(BPay);
        gui.window.add(Text_game1);
        gui.window.add(Text_game2);
        gui.window.add(Text_game3);
        gui.window.add(Text_game4);
    }
   /* public void ImplementsChecboxs()
    {
        CbPs.setBounds(700,1300,50,50);
        CbPc.setBounds(800,1300,50,50);
        CbXb.setBounds(900,1300,50,50);
        gui.window.add(CbXb);
        gui.window.add(CbPs);
        gui.window.add(CbXb);

    } //Dont touch this*/
    public void Akcio(){

        ImageIcon CODMw=new ImageIcon("Images/codmw.jpg");
        l1.setIcon(CODMw);

        ImageIcon PUBG =new ImageIcon("Images/PUBG.jpg");
        l2.setIcon(PUBG);

        ImageIcon MK =new ImageIcon("Images/MK11.jpg");
        l3.setIcon(MK);

        ImageIcon Doom = new ImageIcon("Images/DOOM.jpg");
        l4.setIcon(Doom);

        ImplementsButtons();
        Implements();
        try{
            readFromFile("Akcio.txt");}
        catch (IOException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        BPay.addActionListener(this);

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

        ImplementsButtons();
        Implements();
        try{
            readFromFile("Adventure.txt");}
        catch (IOException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        BPay.addActionListener(this);
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

        ImplementsButtons();
        Implements();
        try{
            readFromFile("RPG.txt");}
        catch (IOException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        BPay.addActionListener(this);
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

        ImageIcon ETS=new ImageIcon("Images/ETS.jpg");
        l4.setIcon(ETS);

        ImplementsButtons();
        Implements();
        try{
            readFromFile("Simulation.txt");}
        catch (IOException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        BPay.addActionListener(this);
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

        ImageIcon Trop6 = new ImageIcon("Images/Tropico6.jpg");
        l4.setIcon(Trop6);

        ImplementsButtons();
        Implements();
        try{
            readFromFile("Strategy.txt");}
        catch (IOException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        gui.window.setTitle("Strategy");
        gui.window.setVisible(true);

    }

    private void readFromFile(String fileName) throws IOException {
        int [] tomb = new int[4];
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String s;
        int index =0;
        while ((s = br.readLine()) != null) {
            tomb[index]=(Integer.parseInt(s));
            index++;
        }
        br.close();
        Storage1.setText(String.valueOf(tomb[0]));
        Storage2.setText(String.valueOf(tomb[1]));
        Storage3.setText(String.valueOf(tomb[2]));
        Storage4.setText(String.valueOf(tomb[3]));
    }
    public void Order(String File){
    int game1 =Integer.parseInt(Text_game1.getText());
    int game2 =Integer.parseInt(Text_game2.getText());
    int game3 =Integer.parseInt(Text_game3.getText());
    int game4 =Integer.parseInt(Text_game4.getText());
    if (game1>Integer.parseInt(Storage1.getText())||game2>Integer.parseInt(Storage2.getText())||game3>Integer.parseInt(Storage3.getText())||game4>Integer.parseInt(Storage4.getText()))
    {
        JOptionPane.showMessageDialog(null,"Ennyi játék nincs raktárkészleten kérje egy eladónk segitségét!");
    }
    else{
        rendelesek.add(game1);
        rendelesek.add(game2);
        rendelesek.add(game3);
        rendelesek.add(game4);
        try{
        writeToFile(File);}
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    }
    private  void writeToFile(String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int game1,game2,game3,game4;
        if (Text_game1.getText().equals(""))
        { game1=0;}else{game1=Integer.parseInt(Text_game1.getText());}
        if (Text_game2.getText().equals(""))
        { game2=0;}else{game2=Integer.parseInt(Text_game2.getText());}
        if (Text_game3.getText().equals(""))
        { game3=0;}else{game3=Integer.parseInt(Text_game3.getText());}
        if (Text_game4.getText().equals(""))
        { game4=0;}else{game4=Integer.parseInt(Text_game4.getText());}
        bw.write(String.valueOf(Integer.parseInt(Storage1.getText())-game1));
        Storage1.setText(String.valueOf(Integer.parseInt(Storage1.getText())-game1));
        bw.newLine();
        bw.write(String.valueOf(Integer.parseInt(Storage2.getText())-game2));
        Storage2.setText(String.valueOf(Integer.parseInt(Storage2.getText())-game1));
        bw.newLine();
        bw.write(String.valueOf(Integer.parseInt(Storage3.getText())-game3));
        Storage3.setText(String.valueOf(Integer.parseInt(Storage3.getText())-game1));
        bw.newLine();
        bw.write(String.valueOf(Integer.parseInt(Storage4.getText())-game4));
        Storage4.setText(String.valueOf(Integer.parseInt(Storage4.getText())-game1));
        bw.close();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(BPay))
        {
          Order(gui.window.getTitle()+".txt");
        }
    }
}
