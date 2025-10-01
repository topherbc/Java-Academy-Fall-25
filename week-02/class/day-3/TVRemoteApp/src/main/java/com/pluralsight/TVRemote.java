package com.pluralsight;

public class TVRemote {
    private String manufacturerName;
    private int currentChannel, currentVolume;
    private boolean powerState;

    public TVRemote(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        this.currentChannel = 0;
        this.currentVolume = 10;
        this.powerState = false;
    }

    public String getStatus() {
        String powerStatus = "OFF";

        if (this.isPowerState()) {
          powerStatus = "ON";
        }

        return "Status: " + powerStatus +", Channel: "+this.getCurrentChannel()+" (" + this.getChannelName() +"), Volume: " + getCurrentVolume();
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public boolean isPowerState() {
        return powerState;
    }

    public String getChannelName() {
        switch (this.currentChannel) {
            case 3: return "Cartoon Network";
            case 5: return "Discovery Channel";
            case 8: return "Food Network";
            case 13: return "HGTV";
            case 25: return "Comedy Central";
            default: return "Unknown Channel";
        }
    }

    public void turnOn() {
        this.powerState = true;
    }

    public void turnOff() {
        this.powerState = false;
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
    }

    public void adjustVolume(int newVolume) {
        this.currentVolume = newVolume;
    }
}
