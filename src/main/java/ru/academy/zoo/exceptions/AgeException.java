package ru.academy.zoo.exceptions;

public class AgeException extends Exception {
    public AgeException(int age) {

        super("Некорректный возраст " + age);

    }
}
