
class Snake extends Reptile {
    private double length;

    public Snake(String name, int age, double weight, double bodyTemperature, double length) {
        super(name, age, weight, bodyTemperature);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " шипит: Шшшшшш!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ест грызунов");
    }

    @Override
    public void move() {
        System.out.println(getName() + " ползет");
    }

    public void shedSkin() {
        System.out.println(getName() + " сбрасывает кожу");
    }
}