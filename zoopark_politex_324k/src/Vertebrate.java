// Абстрактный класс Позвоночное
abstract class Vertebrate implements Animal {
    private String name;
    private int age;
    private double weight;

    public Vertebrate(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры с проверками
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть положительным");
        }
        this.weight = weight;
    }

    // Общие методы для всех позвоночных
    public void sleep() {
        System.out.println(name + " спит");
    }

    public void move() {
        System.out.println(name + " двигается");
    }

    // Абстрактные методы (должны быть реализованы в подклассах)
    @Override
    public abstract void makeSound();

    @Override
    public abstract void feed();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}