package org.example.builderpattern;

public class PhoneBuilder {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    // generate the setters only

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;// return same eobject
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    // Method that will give Phone Object
    public Phone getPhone()
    {
        return new Phone(os,ram,processor,screenSize,battery);
    }
}
