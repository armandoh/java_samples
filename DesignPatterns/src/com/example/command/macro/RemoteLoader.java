/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.macro;



/**
 *
 * @author Armando
 */
public class RemoteLoader {

    public static void main(String... args) {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        
        
        Light livingRoomLight = new Light("Living room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);
        
        Command[] partyOn = {livingRoomLightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {livingRoomLightOff, stereoOff, tvOff, hottubOff};
        
        
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        remote.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remote);
        System.out.println("----- Pushing Macro On ------");
        remote.onButtonWasPushed(0);
        System.out.println("----- Pushing Macro Off ------");
        remote.offButtonWasPushed(0);
        /*
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        System.out.println("----- Ceiling Fan stuff ------");
        //
        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remote.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);       
        System.out.println(remote);
        remote.undoButtonWasPushed();
                
        */
    }
}
