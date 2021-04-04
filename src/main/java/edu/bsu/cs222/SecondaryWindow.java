package edu.bsu.cs222;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SecondaryWindow {
    DisplayPlayerStatistics displayPlayerStatistics = new DisplayPlayerStatistics();
    Stage secondaryWindow;

    private final TextArea outputPoints = new TextArea();
    private final TextArea outputRebounds = new TextArea();
    private final TextArea outputBlocks = new TextArea();
    private final TextArea outputSteals = new TextArea();
    private final TextArea outputAssists = new TextArea();
    private final TextArea outputHeight = new TextArea();
    private final TextArea outputWeight = new TextArea();

    public SecondaryWindow() {
        secondaryWindow = new Stage();
        secondaryWindow.setTitle("|Player Stats Window|");

        outputPoints.setEditable(false);
        outputRebounds.setEditable(false);
        outputBlocks.setEditable(false);
        outputSteals.setEditable(false);
        outputAssists.setEditable(false);
        outputHeight.setEditable(false);
        outputWeight.setEditable(false);

        outputPoints.setText(displayPlayerStatistics.pointsString);
        outputRebounds.setText(displayPlayerStatistics.reboundsString);
        outputBlocks.setText(displayPlayerStatistics.blocksString);
        outputSteals.setText(displayPlayerStatistics.stealsString);
        outputAssists.setText(displayPlayerStatistics.assistsString);
        outputHeight.setText(displayPlayerStatistics.heightString);
        outputWeight.setText(displayPlayerStatistics.weightString);

        ScrollPane Pane = createSecondaryWindow();

        Scene secondaryScene = new Scene(Pane, 800, 500);

        secondaryWindow.setScene(secondaryScene);

    }

    public void showSecondaryWindow() {
        secondaryWindow.show();
    }


    private ScrollPane createSecondaryWindow() {
        //TODO create scene layout
        // create Pane
        ScrollPane scrollPane = new ScrollPane();
        VBox root = new VBox();
        root.setSpacing(20);
        root.setPrefSize(800, 500);
        root.setAlignment(Pos.CENTER_LEFT);
        root.getChildren().addAll(
                new Label("Points Per Game:"),
                outputPoints,
                new Label("Rebounds Per Game: "),
                outputRebounds,
                new Label("Blocks Per Game: "),
                outputBlocks,
                new Label("Steals Per Game: "),
                outputSteals,
                new Label("Assists Per Game: "),
                outputAssists,
                new Label("Player Height: "),
                outputHeight,
                new Label("Player Weight: "),
                outputWeight
        );
        scrollPane.setContent(root);
        return scrollPane;
    }
}
