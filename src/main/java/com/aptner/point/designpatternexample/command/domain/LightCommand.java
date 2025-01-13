package com.aptner.point.designpatternexample.command.domain;

public class LightCommand implements Command{
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
