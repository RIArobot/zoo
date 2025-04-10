package ru.academy.zoo.objects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exceptions.AgeException;

// базовый класс всех животных
public abstract class Animal {

    private static final Logger log = LogManager.getLogger(Animal.class);

    protected final String name;

    //TODO перевести на Date - дата рождения 1234
    protected int age;

    public Animal(String name_, int age_) throws AgeException {

        log.trace("Создаем новое животное с именем {}, возраст{}", name_, age_);
        this.name = name_;

        log.debug("Проверяем значение возраста");
        if (age_ < 0 || age_ > 5000) {
            throw new AgeException(age_);
        } else {
            this.age = age_;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSoung();
}
