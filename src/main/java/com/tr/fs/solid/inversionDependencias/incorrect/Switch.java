package com.tr.fs.solid.inversionDependencias.incorrect;

class Switch {
    public void encender() {
        // Logic to turn on the switch
    }

    public void apagar() {
        // Logic to turn off the switch
    }
}

class LightBulb {
    private Switch botonSwitch = new Switch(); // Direct dependency

    public void encender() {
        botonSwitch.encender();
    }

    public void apagar() {
        botonSwitch.apagar();
    }
}

