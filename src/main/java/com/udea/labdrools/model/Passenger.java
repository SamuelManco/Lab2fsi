package com.udea.labdrools.model;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String passengerId;
    private String name;
    private int age;
    private String status; // Gold, Platinum, Regular
    private String membership; // Basic, Silver, Gold, Platinum
    private String cabinClass; // Economy, Business
    private boolean priorityCheckIn;
    private boolean eligibleForUpgrade = true;
    private String seatPreference = "Any";
    private String assignedSeat;
    private double compensationAmount;
    private int loyaltyPoints;
    private boolean vipLoungeAccess;
    private boolean travelingWithChildren;
    private List<String> notes = new ArrayList<>();

    // Getters y Setters
    public String getPassengerId() { return passengerId; }
    public void setPassengerId(String passengerId) { this.passengerId = passengerId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getMembership() { return membership; }
    public void setMembership(String membership) { this.membership = membership; }
    public String getCabinClass() { return cabinClass; }
    public void setCabinClass(String cabinClass) { this.cabinClass = cabinClass; }
    public boolean isPriorityCheckIn() { return priorityCheckIn; }
    public void setPriorityCheckIn(boolean priorityCheckIn) { this.priorityCheckIn = priorityCheckIn; }
    public boolean isEligibleForUpgrade() { return eligibleForUpgrade; }
    public void setEligibleForUpgrade(boolean eligibleForUpgrade) { this.eligibleForUpgrade = eligibleForUpgrade; }
    public String getSeatPreference() { return seatPreference; }
    public void setSeatPreference(String seatPreference) { this.seatPreference = seatPreference; }
    public String getAssignedSeat() { return assignedSeat; }
    public void setAssignedSeat(String assignedSeat) { this.assignedSeat = assignedSeat; }
    public double getCompensationAmount() { return compensationAmount; }
    public void setCompensationAmount(double compensationAmount) { this.compensationAmount = compensationAmount; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
    public void addLoyaltyPoints(int points) { this.loyaltyPoints += points; }
    public boolean isVipLoungeAccess() { return vipLoungeAccess; }
    public void setVipLoungeAccess(boolean vipLoungeAccess) { this.vipLoungeAccess = vipLoungeAccess; }
    public boolean isTravelingWithChildren() { return travelingWithChildren; }
    public void setTravelingWithChildren(boolean travelingWithChildren) { this.travelingWithChildren = travelingWithChildren; }
    public List<String> getNotes() { return notes; }
    public void addNote(String note) { this.notes.add(note); }
}