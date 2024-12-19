package com.aptner.point.designpatternexample.example2.domain.subject;

import com.aptner.point.designpatternexample.example2.domain.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class AdControl implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private Integer newAdCount;

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.stream()
                .filter(o -> o == observer).findFirst()
                .ifPresent(o -> this.observers.remove(observer));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void issueNewAdd(Integer count) {
        this.newAdCount = count;
        notifyObservers();
    }

    public Integer getNewAdCount() {
        return newAdCount;
    }
}
