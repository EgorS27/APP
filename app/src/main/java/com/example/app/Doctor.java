package com.example.app;

public class Doctor {

    private String fio;

    // Image name (Without extension)
    private String flagName;
    private String opisaniye;

    public Doctor(String fio, String flagName, String opisaniye) {
        this.fio = fio;
        this.flagName= flagName;
        this.opisaniye = opisaniye;
    }

    public String getOpisaniye() {
        return opisaniye;
    }

    public void setOpisaniye(String opisaniye) {
        this.opisaniye = opisaniye;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    @Override
    public String toString()  {
        return this.fio +" (Opisaniye: "+ this.opisaniye +")";
    }
}
