package com.aptner.point.designpatternexample.example2.domain.observer;

import com.aptner.point.designpatternexample.example2.domain.subject.AdControl;

public class EmailObserver implements Observer {
    private final AdControl adControl;

    public EmailObserver(AdControl adControl) {
        this.adControl = adControl;
        adControl.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Email 알림 새로운 광고 발행 ::: 갯수 " + adControl.getNewAdCount());
    }
}
