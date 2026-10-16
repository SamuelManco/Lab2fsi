package com.udea.labdrools.model;

public class Seat {
    private String seatNumber;
    private boolean emergencyExit;
    private boolean familyPreferential;
    private boolean occupied;

    // Getters y Setters
    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public boolean isEmergencyExit() { return emergencyExit; }
    public void setEmergencyExit(boolean emergencyExit) { this.emergencyExit = emergencyExit; }
    public boolean isFamilyPreferential() { return familyPreferential; }
    public void setFamilyPreferential(boolean familyPreferential) { this.familyPreferential = familyPreferential; }
    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
}