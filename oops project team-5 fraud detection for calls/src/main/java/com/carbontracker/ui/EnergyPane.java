package com.carbontracker.ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class EnergyPane extends VBox {
    private final TextField electricityInput;
    private final TextField naturalGasInput;
    private final Label resultLabel;

    public EnergyPane() {
        setPadding(new Insets(20));
        setSpacing(15);

        Label electricityLabel = new Label("Electricity (kWh):");
        electricityInput = new TextField();
        Button addElectricityButton = new Button("Add");
        addElectricityButton.setOnAction(e -> addElectricity());

        Label naturalGasLabel = new Label("Natural Gas (therms):");
        naturalGasInput = new TextField();
        Button addNaturalGasButton = new Button("Add");
        addNaturalGasButton.setOnAction(e -> addNaturalGas());

        resultLabel = new Label("Total Emissions: 0.00 kg CO₂");

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(electricityLabel, 0, 0);
        grid.add(electricityInput, 1, 0);
        grid.add(addElectricityButton, 2, 0);
        grid.add(naturalGasLabel, 0, 1);
        grid.add(naturalGasInput, 1, 1);
        grid.add(addNaturalGasButton, 2, 1);
        grid.add(resultLabel, 0, 2, 3, 1);

        getChildren().add(grid);
    }

    private void addElectricity() {
        try {
            double kWh = Double.parseDouble(electricityInput.getText());
            // Assuming EmissionCalculator is a singleton or accessible instance
            double emissions = kWh * 0.92; // kg CO₂/kWh
            // Update total emissions in the calculator
            // calculator.addElectricityEmission(kWh);
            updateResult(emissions);
            electricityInput.clear();
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid number for electricity.");
        }
    }

    private void addNaturalGas() {
        try {
            double therms = Double.parseDouble(naturalGasInput.getText());
            // Assuming EmissionCalculator is a singleton or accessible instance
            double emissions = therms * 2.0; // kg CO₂/therm
            // Update total emissions in the calculator
            // calculator.addNaturalGasEmission(therms);
            updateResult(emissions);
            naturalGasInput.clear();
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid number for natural gas.");
        }
    }

    private void updateResult(double emissions) {
        // Update the result label with the new total emissions
        // double totalEmissions = calculator.getTotalEmissions();
        // resultLabel.setText("Total Emissions: " + totalEmissions + " kg CO₂");
        resultLabel.setText("Total Emissions: " + emissions + " kg CO₂");
    }
}