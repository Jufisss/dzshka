// Класс Слон
class Elephant extends Vertebrate {
    private double tuskLength;

    public Elephant(String name, int age, double weight, double tuskLength) {
        super(name, age, weight);
        this.tuskLength = tuskLength;
    }

    public double getTuskLength() {
        return tuskLength;
    }

    public void setTuskLength(double tuskLength) {
        this.tuskLength = tuskLength;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " трубит: ТУУУУУУ!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ест фрукты и овощи");
    }

    public void sprayWater() {
        System.out.println(getName() + " обливается водой");
    }
}