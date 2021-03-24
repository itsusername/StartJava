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
    //private String weapon;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setKillKaiju(int killKaiju) {
        this.killKaiju = killKaiju;
    }

    public int getKillKaiju() {
        return killKaiju;
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