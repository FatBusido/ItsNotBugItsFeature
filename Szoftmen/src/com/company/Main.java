package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame window;
    JMenuBar menuBar;
    JMenu menuKosar,menuAkcio,menuAdventure,menuRPG,menuSimulation,menuStrategy;
    JMenuItem iElerhetoAkcio,iElerhetoAdventure,iElerhetoRPG,iElerhetoSimulation,iElerhetoStrategy,
            iElorendeles;

    Function file=new Function(this);

    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        createWindow();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
    }

    private void createWindow() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        window=new JFrame("LevelUp");
        window.setSize(screenWidth, screenHeight);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createMenuBar(){
        menuBar=new JMenuBar();
        window.setJMenuBar(menuBar);

        menuKosar=new JMenu("Kosar");
        menuBar.add(menuKosar);

        menuAkcio=new JMenu("Akcio");
        menuBar.add(menuAkcio);

        menuAdventure=new JMenu("Adventure");
        menuBar.add(menuAdventure);

        menuRPG=new JMenu("RPG");
        menuBar.add(menuRPG);

        menuSimulation=new JMenu("Simulation");
        menuBar.add(menuSimulation);

        menuStrategy=new JMenu("Strategy");
        menuBar.add(menuStrategy);
    }
    public void createFileMenu(){
        //Akció gameszkó
        iElerhetoAkcio=new JMenuItem("ElerhetoAkcio");
        iElerhetoAkcio.addActionListener(this);
        iElerhetoAkcio.setActionCommand("ElerhetoAkcio");
        menuAkcio.add(iElerhetoAkcio);
        iElorendeles=new JMenuItem("ElorendelesAkcio");
        menuAkcio.add(iElorendeles);
        //Akció gameszkó vége

        //Adventure gameszkó
       iElerhetoAdventure=new JMenuItem("ElerhetoAdventure");
        iElerhetoAdventure.addActionListener(this);
        iElerhetoAdventure.setActionCommand("ElerhetoAdventure");
        menuAdventure.add(iElerhetoAdventure);
       iElorendeles=new JMenuItem("ElorendelesAdventure");
        menuAdventure.add(iElorendeles);
        //Adventure gameszkó vége

        //RPG gameszkó
       iElerhetoRPG=new JMenuItem("ElerhetoRPG");
        iElerhetoRPG.addActionListener(this);
        iElerhetoRPG.setActionCommand("ElerhetoRPG");
        menuRPG.add(iElerhetoRPG);
       iElorendeles=new JMenuItem("ElorendelesRPG");
        menuRPG.add(iElorendeles);
        //RPG gameszkó vége

        //Simulation gameszkó
        iElerhetoSimulation=new JMenuItem("ElerhetoSimulation");
        iElerhetoSimulation.addActionListener(this);
        iElerhetoSimulation.setActionCommand("ElerhetoSimulation");
        menuSimulation.add(iElerhetoSimulation);
        iElorendeles=new JMenuItem("ElorendelesSimulation");
        menuSimulation.add(iElorendeles);
        //Simulation gameszó vége

        //Strategy gameszkó eleje
        iElerhetoStrategy=new JMenuItem("ElerhetoStrategy");
        iElerhetoStrategy.addActionListener(this);
        iElerhetoStrategy.setActionCommand("ElerhetoStrategy");
        menuStrategy.add(iElerhetoStrategy);
        iElorendeles=new JMenuItem("ElorendelesStrategy");
        menuStrategy.add(iElorendeles);
        //Strategy gameszkó vége
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case"ElerhetoAkcio":file.Akcio(); break;
            case"ElerhetoAdventure":file.Adventure(); break;
            case"ElerhetoRPG":file.RPG();break;
            case"ElerhetoSimulation":file.Simulation();break;
            case"ElerhetoStrategy":file.Strategy();break;
        }
    }
}
