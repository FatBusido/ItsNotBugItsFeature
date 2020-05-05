package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame window;
    JMenuBar menuBar;
    JMenu menuKosar,menuAkcio,menuAdventure,menuRPG,menuSimulation,menuStrategy;
    JMenuItem iElerheto,iElorendeles;

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
        window=new JFrame("LevelUp");
        window.setSize(800,400);
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
        iElerheto=new JMenuItem("Elerheto");
        iElerheto.addActionListener(this);
        iElerheto.setActionCommand("ElerhetoAkcio");
        menuAkcio.add(iElerheto);
        iElorendeles=new JMenuItem("Elorendeles");
        menuAkcio.add(iElorendeles);

       iElerheto=new JMenuItem("Elerheto");
        menuAdventure.add(iElerheto);
       iElorendeles=new JMenuItem("Elorendeles");
        menuAdventure.add(iElorendeles);

       iElerheto=new JMenuItem("Elerheto");
        menuRPG.add(iElerheto);
       iElorendeles=new JMenuItem("Elorendeles");
        menuRPG.add(iElorendeles);

        iElerheto=new JMenuItem("Elerheto");
        menuSimulation.add(iElerheto);
        iElorendeles=new JMenuItem("Elorendeles");
        menuSimulation.add(iElorendeles);

        iElerheto=new JMenuItem("Elerheto");
        menuStrategy.add(iElerheto);
        iElorendeles=new JMenuItem("Elorendeles");
        menuStrategy.add(iElorendeles);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case"ElerhetoAkcio":file.Akcio();
        }
    }
}
