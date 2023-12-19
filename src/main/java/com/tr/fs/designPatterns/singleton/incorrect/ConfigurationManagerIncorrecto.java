package com.tr.fs.designPatterns.singleton.incorrect;

public class ConfigurationManagerIncorrecto {
    private String setting1;
    private int setting2;

    public ConfigurationManagerIncorrecto() {
        // Initialization of settings
        setting1 = "default";
        setting2 = 10;
    }

    // Getters and setters for settings
    public String getSetting1() {
        return setting1;
    }

    public void setSetting1(String setting1) {
        this.setting1 = setting1;
    }

    public int getSetting2() {
        return setting2;
    }

    public void setSetting2(int setting2) {
        this.setting2 = setting2;
    }
}

