package com.udea.labdrools.model;

public class Luggage {
    private String passengerId;
    private double weightKg;
    private double discountPercentage;
    private boolean discountApplied;
    private boolean allowed = true;
    private String restrictionReason;

    // Getters y Setters
    public String getPassengerId() { return passengerId; }
    public void setPassengerId(String passengerId) { this.passengerId = passengerId; }
    public double getWeightKg() { return weightKg; }
    public void setWeightKg(double weightKg) { this.weightKg = weightKg; }
    public double getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(double discountPercentage) { this.discountPercentage = discountPercentage; }
    public boolean isDiscountApplied() { return discountApplied; }
    public void setDiscountApplied(boolean discountApplied) { this.discountApplied = discountApplied; }
    public boolean isAllowed() { return allowed; }
    public void setAllowed(boolean allowed) { this.allowed = allowed; }
    public String getRestrictionReason() { return restrictionReason; }
    public void setRestrictionReason(String restrictionReason) { this.restrictionReason = restrictionReason; }
}