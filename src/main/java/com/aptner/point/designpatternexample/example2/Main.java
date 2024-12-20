package com.aptner.point.designpatternexample.example2;

import com.aptner.point.designpatternexample.example2.domain.observer.EmailObserver;
import com.aptner.point.designpatternexample.example2.domain.observer.SlackObserver;
import com.aptner.point.designpatternexample.example2.domain.subject.AdControl;

public class Main {

    public static void main(String[] args) {
        AdControl adControl = new AdControl();

        new EmailObserver(adControl);

        new SlackObserver(adControl);

        adControl.issueNewAdd(5);
    }
}
