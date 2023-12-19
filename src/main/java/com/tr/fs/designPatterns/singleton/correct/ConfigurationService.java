package com.tr.fs.designPatterns.singleton.correct;

import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

    // Accessing and using the ConfigurationManager
    ConfigurationManager configManager = ConfigurationManager.getInstance();

    public void proveerConfiguraciones() {
        System.out.println(configManager.getSetting1()); // Accessing setting1
        configManager.setSetting2(20); // Modifying setting2
    }

}

