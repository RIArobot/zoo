import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import ru.academy.zoo.exceptions.AddTypeAnimalException;
import ru.academy.zoo.exceptions.AgeException;
import ru.academy.zoo.exceptions.MaxCapacityException;
import ru.academy.zoo.objects.*;

import java.util.ArrayList;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //Configurator.setRootLevel(Level.ERROR);

        try {
            Lion lion = new Lion("Лёва", 10);
            Egle egle = new Egle("Олег", 3);
            Dolphin dolphin = new Dolphin("Дима", 4);

            ArrayList<Animal> listAnimal = new ArrayList<Animal>();
            listAnimal.add(lion);
            listAnimal.add(egle);
            listAnimal.add(dolphin);

            for (Animal animal: listAnimal) {
                animal.makeSoung();
            }

            GroundEnclosure groundEnclosure = new GroundEnclosure(1);
            groundEnclosure.addAnimal(egle);

        } catch (AgeException | MaxCapacityException | AddTypeAnimalException e) {

            log.error("Ошибка", e);
        }
    }
}