package com.aptner.point.designpatternexample.command.domain;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public SimpleRemoteControl(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
