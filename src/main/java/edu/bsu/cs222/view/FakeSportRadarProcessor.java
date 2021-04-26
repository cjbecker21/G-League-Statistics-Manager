package edu.bsu.cs222.view;

import java.util.ArrayList;
import java.util.Scanner;

public class FakeSportRadarProcessor {
    private final ArrayList<String> playerNamesList = new ArrayList<>();
    public String position = "Point Guard";
    public String PPG = "28.4";
    public String RPG = "4.5";
    public String BPG = "2.4";
    public String APG = "9.6";
    public String SPG = "2.4";
    public String height = "6'3";
    public String weight = "215 Pounds";

    //Console Application
    public static void main(String[] args) {
        FakeSportRadarProcessor processor = new FakeSportRadarProcessor();
        System.out.println("Enter Player Name");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        processor.searchPlayerNames(input);
    }

    public void addNamesToList() {
        playerNamesList.add("Jaylen Hoard");
        playerNamesList.add("Omer Yurtseven");
        playerNamesList.add("Zavier Simpson");
        playerNamesList.add("Melvin Frazier");
        playerNamesList.add("Phil Booth");
    }

    public boolean searchPlayerNames(String playerName) {
        addNamesToList();
        if(playerNamesList.contains(playerName)) {
            printStats(playerName);
            return true;
        }
        else{
            System.out.println("Player not found!");
            return false;
        }
    }

    public void printStats(String playerName){
        System.out.println("Player: " + playerName + " has been found");
        System.out.println("============Player Statistics============\n " +
                "\nPosition:\n " + position + "\n"
                + "Points Per Game:\n " + PPG + "\n"
                + "Rebounds Per Game:\n " + RPG + "\n"
                + "Assists Per Game:\n " + APG + "\n"
                + "Steals Per Game:\n " + SPG + "\n"
        );
    }
}
