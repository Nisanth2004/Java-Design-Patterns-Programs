package org.example.factorypattern;

public class FactoryMain
{
    public static void main(String[] args)
    {

        // factory object
        OperatingSystemFactory operatingSystemFactory=new OperatingSystemFactory();
        OS obj= operatingSystemFactory.getInstance("Closed");

        // default
      //  OS obj=new Windows();
        obj.spec();
    }
}
