package com.project9.enums;

public enum Gender {
    MALE("მამრობითი"), FEMALE("მდედრობითი");

     private String readableName;

    Gender(String humanReadableName) {
        this.readableName = humanReadableName;
    }


    public String getReadableName() {
        return readableName;
    }

    @Override
    public String toString() {
        return readableName;
    }
}
