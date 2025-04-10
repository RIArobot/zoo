package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;

public class Dolphin extends Animal implements ISwimmeble {

    private static final Logger log = LogManager.getLogger(Dolphin.class);

    public Dolphin(String name_, int age_) throws AgeException {
        super(name_, age_);
    }

    @Override
    public void makeSoung() {
        log.info("Пипипи");
    }


    @Override
    public boolean isSultWater() {
        return true;
    }
}
