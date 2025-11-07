// Класс Лев
class Lion extends Vertebrate {
    private String maneColor;

    public Lion(String name, int age, double weight, String maneColor) {
        super(name, age, weight);
        this.maneColor = maneColor;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " рычит: РРРРРР!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ест мясо");
    }

    public void hunt() {
        System.out.println(getName() + " охотится");
    }
}