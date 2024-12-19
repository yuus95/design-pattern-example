package com.aptner.point.designpatternexample.example2.domain.subject;

import com.aptner.point.designpatternexample.example2.domain.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
