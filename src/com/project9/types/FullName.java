package com.project9.types;

import com.project9.enums.NameType;

public class FullName {

    private NameType type;
    private String[] names;


    public FullName(NameType type, String name) {

        this.type = type;
        String[] splitStrings = name.trim().split("\\s+");
        switch (type) {
            case FULL_NO_MIDDLE_NAME:
                names = new String[]{splitStrings[0], splitStrings[1]};
                break;
            case FULL_WITH_MIDDLE_NAME:
                names = new String[]{splitStrings[0], splitStrings[1], splitStrings[2]};
                break;
        }

    }

    public NameType getType() {
        return type;
    }

    public void setType(NameType type) {
        this.type = type;
    }


    public String getfullname() {
        return String.join(" ", names);
    }
    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return getfullname();
    }
}
