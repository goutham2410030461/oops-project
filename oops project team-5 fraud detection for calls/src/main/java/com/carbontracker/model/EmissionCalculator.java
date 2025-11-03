package com.carbontracker.model;

import java.util.HashMap;
import java.util.Map;

public class EmissionCalculator {

    private Map<String, Double> transportEmissions;
    private Map<String, Double> energyEmissions;
    private Map<String, Double> foodEmissions;

    private static final double CAR_EMISSION_FACTOR = 0.21; // kg CO₂/km
    private static final double BUS_EMISSION_FACTOR = 0.089; // kg CO₂/km
    private static final double TRAIN_EMISSION_FACTOR = 0.041; // kg CO₂/km
    private static final double FLIGHT_EMISSION_FACTOR = 0.255; // kg CO₂/km
    private static final double ELECTRICITY_EMISSION_FACTOR = 0.92; // kg CO₂/kWh
    private static final double NATURAL_GAS_EMISSION_FACTOR = 2.0; // kg CO₂/therm
    private static final double BEEF_EMISSION_FACTOR = 27.0; // kg CO₂/kg
    private static final double PORK_EMISSION_FACTOR = 12.1; // kg CO₂/kg
    private static final double CHICKEN_EMISSION_FACTOR = 6.9; // kg CO₂/kg
    private static final double VEGETARIAN_EMISSION_FACTOR = 2.0; // kg CO₂/meal

    public EmissionCalculator() {
        transportEmissions = new HashMap<>();
        energyEmissions = new HashMap<>();
        foodEmissions = new HashMap<>();
    }

    // Transport methods
    public void addCarEmission(double km) {
        transportEmissions.put("car", transportEmissions.getOrDefault("car", 0.0) + (km * CAR_EMISSION_FACTOR));
    }

    public void addBusEmission(double km) {
        transportEmissions.put("bus", transportEmissions.getOrDefault("bus", 0.0) + (km * BUS_EMISSION_FACTOR));
    }

    public void addTrainEmission(double km) {
        transportEmissions.put("train", transportEmissions.getOrDefault("train", 0.0) + (km * TRAIN_EMISSION_FACTOR));
    }

    public void addFlightEmission(double km) {
        transportEmissions.put("flight", transportEmissions.getOrDefault("flight", 0.0) + (km * FLIGHT_EMISSION_FACTOR));
    }

    // Energy methods
    public void addElectricityEmission(double kWh) {
        energyEmissions.put("electricity", energyEmissions.getOrDefault("electricity", 0.0) + (kWh * ELECTRICITY_EMISSION_FACTOR));
    }

    public void addNaturalGasEmission(double therms) {
        energyEmissions.put("naturalGas", energyEmissions.getOrDefault("naturalGas", 0.0) + (therms * NATURAL_GAS_EMISSION_FACTOR));
    }

    // Food methods
    public void addBeefEmission(double kg) {
        foodEmissions.put("beef", foodEmissions.getOrDefault("beef", 0.0) + (kg * BEEF_EMISSION_FACTOR));
    }

    public void addPorkEmission(double kg) {
        foodEmissions.put("pork", foodEmissions.getOrDefault("pork", 0.0) + (kg * PORK_EMISSION_FACTOR));
    }

    public void addChickenEmission(double kg) {
        foodEmissions.put("chicken", foodEmissions.getOrDefault("chicken", 0.0) + (kg * CHICKEN_EMISSION_FACTOR));
    }

    public void addVegetarianMeal(int meals) {
        foodEmissions.put("vegetarian", foodEmissions.getOrDefault("vegetarian", 0.0) + (meals * VEGETARIAN_EMISSION_FACTOR));
    }

    // Aggregation methods
    public double getTransportTotal() {
        return transportEmissions.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public double getEnergyTotal() {
        return energyEmissions.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public double getFoodTotal() {
        return foodEmissions.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public double getTotalEmissions() {
        return getTransportTotal() + getEnergyTotal() + getFoodTotal();
    }

    // Data access methods
    public Map<String, Double> getTransportBreakdown() {
        return new HashMap<>(transportEmissions);
    }

    public Map<String, Double> getEnergyBreakdown() {
        return new HashMap<>(energyEmissions);
    }

    public Map<String, Double> getFoodBreakdown() {
        return new HashMap<>(foodEmissions);
    }

    // Reset method
    public void reset() {
        transportEmissions.clear();
        energyEmissions.clear();
        foodEmissions.clear();
    }
}