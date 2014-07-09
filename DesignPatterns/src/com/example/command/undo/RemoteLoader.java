/*
 * Using examples from Head First - Design Patterns
 */
package com.example.command.undo;

/**
 *
 * @author Armando
 */
public class RemoteLoader {

    public static void main(String... args) {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

            
        Light livingRoomLight = new Light("Living room");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);


        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
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
                
        
    }
}
