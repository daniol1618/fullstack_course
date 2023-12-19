package com.tr.fs.designPrinciples.solid.inversionDependencias.correct;

interface ISwitcheable {
    void encender();

    void apagar();
}

class Switch implements ISwitcheable {
    @Override
    public void encender() {
        // Logic to turn on the switch
    }

    @Override
    public void apagar() {
        // Logic to turn off the switch
    }
}
class Bombilla {

    private ISwitcheable iSwitcheable;

    public Bombilla(ISwitcheable iSwitcheable) {
        this.iSwitcheable = iSwitcheable;
    }

    public void encender() {
        iSwitcheable.encender();
    }

    public void apagar() {
        iSwitcheable.apagar();
    }
}

