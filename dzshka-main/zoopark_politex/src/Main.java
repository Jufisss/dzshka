import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== СИСТЕМА УПРАВЛЕНИЯ ЗООПАРКОМ ===\n");


        Lion lion = new Lion("Симба", 5, 190.5, "золотистая");
        Elephant elephant = new Elephant("Дамбо", 10, 4500.0, 1.2);
        Snake snake = new Snake("Каа", 3, 15.5, 25.0, 3.8);


        Enclosure savannaEnclosure = new Enclosure("Саванна", 500.0);
        Enclosure reptileEnclosure = new Enclosure("Террариум", 50.0);


        savannaEnclosure.addAnimal(lion);
        savannaEnclosure.addAnimal(elephant);
        reptileEnclosure.addAnimal(snake);


        savannaEnclosure.displayAnimals();
        reptileEnclosure.displayAnimals();


        System.out.println("\n4. ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА:");


        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(lion);
        allAnimals.add(elephant);
        allAnimals.add(snake);

        System.out.println("Один и тот же код (animal.makeSound()) для разных животных:");
        for (Animal animal : allAnimals) {
            animal.makeSound();
        }


        savannaEnclosure.makeAllAnimalsSound();
        reptileEnclosure.makeAllAnimalsSound();


        System.out.println("\n5. КОРМЛЕНИЕ ЖИВОТНЫХ:");
        savannaEnclosure.feedAllAnimals();
        reptileEnclosure.feedAllAnimals();


        System.out.println("\n6. СПЕЦИФИЧЕСКИЕ МЕТОДЫ ЖИВОТНЫХ:");
        lion.hunt();
        elephant.sprayWater();
        snake.baskInSun();
        snake.shedSkin();

        System.out.println("\n=== ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА ===");
    }
}