package com.aptner.point.designpatternexample.command;

import com.aptner.point.designpatternexample.command.domain.Light;
import com.aptner.point.designpatternexample.command.domain.LightCommand;
import com.aptner.point.designpatternexample.command.domain.SimpleRemoteControl;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        //커맨드
        LightCommand lightCommand = new LightCommand(light);
        //인보커
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(lightCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
