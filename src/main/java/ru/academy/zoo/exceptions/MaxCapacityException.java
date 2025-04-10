package ru.academy.zoo.exceptions;

import java.text.MessageFormat;

public class MaxCapacityException extends Exception {

    public MaxCapacityException(int maxCapacity) {
        super(MessageFormat.format("Некорректное значние максимально объема вальера {0}", maxCapacity));
    }
}
