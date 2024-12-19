package com.aptner.point.designpatternexample.example2.domain.observer;

import com.aptner.point.designpatternexample.example2.domain.subject.AdControl;

public class SlackObserver implements Observer {
    private final AdControl adControl;

    public SlackObserver(AdControl adControl) {
        this.adControl = adControl;
        adControl.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Slack 신규 광고 발행 알림 갯수::: " + adControl.getNewAdCount());
    }
}
