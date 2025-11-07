import java.util.ArrayList;
import java.util.List;

class Enclosure {
    // Инкапсуляция: приватное поле с контролируемым доступом
    private List<Animal> animals;
    private String enclosureType;
    private double area;

    public Enclosure(String enclosureType, double area) {
        this.animals = new ArrayList<>();
        this.enclosureType = enclosureType;
        this.area = area;
    }

    // Контролируемые методы для работы со списком животных
    public void addAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Животное не может быть null");
        }
        animals.add(animal);
        System.out.println(animal.getClass().getSimpleName() + " " +
                ((Vertebrate) animal).getName() + " добавлен");
    }

    public void removeAnimal(Animal animal) {
        if (animals.remove(animal)) {
            System.out.println(animal.getClass().getSimpleName() + " " +
                    ((Vertebrate) animal).getName() + " удален из вольера");
        } else {
            System.out.println("Животное не найдено в вольере");
        }
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals); // Возвращаем копию для защиты инкапсуляции
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public double getArea() {
        return area;
    }

    public void displayAnimals() {
        System.out.println("\nВольер '" + enclosureType + "' (площадь: " + area + " м²):");
        if (animals.isEmpty()) {
            System.out.println("  Вольер пуст");
        } else {
            for (Animal animal : animals) {
                System.out.println("  - " + animal);
            }
        }
    }

    // Полиморфизм: общий метод для всех животных
    public void makeAllAnimalsSound() {
        System.out.println("\nВсе животные добавлены'" + enclosureType + "' издают звуки:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void feedAllAnimals() {
        System.out.println("\nКормление всех добавленных животных '" + enclosureType + "':");
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}