package com.project9;

public enum Period {
    DAILY("დღიური"),
    WEEKLY("კვირეული"),
    MONTHLY("თვიური"),
    YEARLY("წლიური");

    private String readableName;


    Period(String readableName) {
        this.readableName = readableName;
    }

    public String getReadableName() {
        return readableName;
    }

    @Override
    public String toString() {
        return readableName;
    }
}
