public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private int killKaiju;

    Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor, int killKaiju) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.killKaiju = killKaiju;
    }

    public String toString() {
        return "Модель робота: " + modelName + "\n"
        + "Марка: " + mark + "\n"
        + "Источник: " + origin + "\n"
        + "Высота: " + height + "\n"
        + "Масса: " + weight + "\n"
        + "Скорость: " + speed + "\n"
        + "Сила: " + weight + "\n"
        + "Броня: " + armor + "\n"
        + "Убито Kaiju: " + killKaiju;
    }

    public boolean oldModel(int launch) {
        if (launch > 2015) {
            return true;
        } else {
            return false;
        }
    }

    public void powerMoves(String move) {
        System.out.println("Силовое движение " + modelName + ": " + move);
    }

    public void useWeapon(String weapon) {
        System.out.println("Робот использует оружие " + weapon);
    }
}