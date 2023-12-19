package com.tr.fs.designPatterns.singleton.incorrect;

import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

    // Accessing and using the ConfigurationManager
    ConfigurationManagerIncorrecto configManager = new ConfigurationManagerIncorrecto();

    public void proveerConfiguraciones() {
        System.out.println(configManager.getSetting1()); // Accessing setting1
        configManager.setSetting2(20); // Modifying setting2
    }

}

