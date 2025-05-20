package com.skyhawk.nbastats.models;

public class Player {
    private Long id;
    private String firstName;
    private String lastName;
    private Long teamId;
    private String jerseyNumber;
    private String position;

    public Player() {
    }

    public Player(Long id, String firstName, String lastName, Long teamId, String jerseyNumber, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamId = teamId;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

