package com.carbontracker.ui;

import com.carbontracker.model.EmissionCalculator;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.PieChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class DashboardPane extends BorderPane {
    private EmissionCalculator calculator;
    private PieChart pieChart;
    private Label transportTotal;
    private Label energyTotal;
    private Label foodTotal;

    public DashboardPane(EmissionCalculator calculator) {
        this.calculator = calculator;
        createUI();
        updateDashboard();
    }

    private void createUI() {
        VBox statsBox = new VBox();
        statsBox.setPadding(new Insets(20));
        statsBox.setSpacing(15);

        transportTotal = new Label();
        energyTotal = new Label();
        foodTotal = new Label();

        statsBox.getChildren().addAll(transportTotal, energyTotal, foodTotal);
        setTop(statsBox);

        pieChart = new PieChart();
        setCenter(pieChart);
    }

    public void updateDashboard() {
        transportTotal.setText("Transport Total: " + calculator.getTransportTotal() + " kg CO₂");
        energyTotal.setText("Energy Total: " + calculator.getEnergyTotal() + " kg CO₂");
        foodTotal.setText("Food Total: " + calculator.getFoodTotal() + " kg CO₂");

        pieChart.getData().clear();
        pieChart.getData().addAll(
            new PieChart.Data("Transport", calculator.getTransportTotal()),
            new PieChart.Data("Energy", calculator.getEnergyTotal()),
            new PieChart.Data("Food", calculator.getFoodTotal())
        );
    }
}