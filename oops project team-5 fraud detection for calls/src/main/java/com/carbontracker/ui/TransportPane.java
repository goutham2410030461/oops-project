package com.carbontracker.ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class TransportPane extends VBox {

    private EmissionCalculator calculator;

    public TransportPane(EmissionCalculator calculator) {
        this.calculator = calculator;
        createTransportInput();
    }

    private void createTransportInput() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Car Input
        Label carLabel = new Label("🚗 Car (km):");
        TextField carInput = new TextField();
        Button addCarButton = new Button("Add");
        addCarButton.setOnAction(e -> addCarEmission(carInput));

        grid.add(carLabel, 0, 0);
        grid.add(carInput, 1, 0);
        grid.add(addCarButton, 2, 0);

        // Bus Input
        Label busLabel = new Label("🚌 Bus (km):");
        TextField busInput = new TextField();
        Button addBusButton = new Button("Add");
        addBusButton.setOnAction(e -> addBusEmission(busInput));

        grid.add(busLabel, 0, 1);
        grid.add(busInput, 1, 1);
        grid.add(addBusButton, 2, 1);

        // Train Input
        Label trainLabel = new Label("🚆 Train (km):");
        TextField trainInput = new TextField();
        Button addTrainButton = new Button("Add");
        addTrainButton.setOnAction(e -> addTrainEmission(trainInput));

        grid.add(trainLabel, 0, 2);
        grid.add(trainInput, 1, 2);
        grid.add(addTrainButton, 2, 2);

        // Flight Input
        Label flightLabel = new Label("✈️ Flight (km):");
        TextField flightInput = new TextField();
        Button addFlightButton = new Button("Add");
        addFlightButton.setOnAction(e -> addFlightEmission(flightInput));

        grid.add(flightLabel, 0, 3);
        grid.add(flightInput, 1, 3);
        grid.add(addFlightButton, 2, 3);

        this.getChildren().add(grid);
    }

    private void addCarEmission(TextField input) {
        try {
            double km = Double.parseDouble(input.getText());
            if (km > 0) {
                calculator.addCarEmission(km);
                input.clear();
            } else {
                showError("Please enter a positive number");
            }
        } catch (NumberFormatException e) {
            showError("Please enter a valid number");
        }
    }

    private void addBusEmission(TextField input) {
        try {
            double km = Double.parseDouble(input.getText());
            if (km > 0) {
                calculator.addBusEmission(km);
                input.clear();
            } else {
                showError("Please enter a positive number");
            }
        } catch (NumberFormatException e) {
            showError("Please enter a valid number");
        }
    }

    private void addTrainEmission(TextField input) {
        try {
            double km = Double.parseDouble(input.getText());
            if (km > 0) {
                calculator.addTrainEmission(km);
                input.clear();
            } else {
                showError("Please enter a positive number");
            }
        } catch (NumberFormatException e) {
            showError("Please enter a valid number");
        }
    }

    private void addFlightEmission(TextField input) {
        try {
            double km = Double.parseDouble(input.getText());
            if (km > 0) {
                calculator.addFlightEmission(km);
                input.clear();
            } else {
                showError("Please enter a positive number");
            }
        } catch (NumberFormatException e) {
            showError("Please enter a valid number");
        }
    }

    private void showError(String message) {
        // Implement error display logic (e.g., alert dialog)
    }
}