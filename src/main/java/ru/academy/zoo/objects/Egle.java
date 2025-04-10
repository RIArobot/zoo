package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;

public class Egle extends Animal implements IFlyable {

    private static final Logger log = LogManager.getLogger(Egle.class);

    public Egle(String name_, int age_) throws AgeException {
        super(name_, age_);
    }

    @Override
    public void makeSoung() {
        log.info("Карррр");
    }

    @Override
    public boolean isBigBird() {
        return true;
    }

    @Override
    public void fly() {
        log.info("Орел с именем {} летит", getName());
    }
}
