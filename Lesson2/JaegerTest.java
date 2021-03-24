public class JaegerTest {

    public static void main(String[] args) {
        Jaeger rob1 = new Jaeger();
        Jaeger rob2 = new Jaeger();

        rob1.setModelName("Cherno Alpha (Jaeger)");
        rob1.setMark("Mark-1");
        rob1.setOrigin("Russia");
        rob1.setHeight(85.34f);
        rob1.setWeight(2.412f);
        rob1.setSpeed(3);
        rob1.setStrength(10);
        rob1.setArmor(10);
        rob1.setKillKaiju(4);

        rob2.setModelName("Striker Eureka");
        rob2.setMark("Mark-5");
        rob2.setOrigin("Australia");
        rob2.setHeight(76.2f);
        rob2.setWeight(1.850f);
        rob2.setSpeed(10);
        rob2.setStrength(10);
        rob2.setArmor(9);
        rob2.setKillKaiju(2);

        System.out.println("Модель робота: " + rob1.getModelName() + "\n"
        + "Марка:" + rob1.getMark() + "\n"
        + "Источник:" + rob1.getOrigin() + "\n"
        + "Высота:" + rob1.getHeight() + "\n"
        + "Масса:" + rob1.getWeight() + "\n"
        + "Скорость:" + rob1.getOrigin() + "\n"
        + "Сила:" + rob1.getSpeed() + "\n"
        + "Броня:" + rob1.getStrength() + "\n"
        + "Убито Kaiju:" + rob1.getArmor() + "\n"
        + "Оружие:" + rob1.getKillKaiju() + "\n"
        + "Old Model:" + rob1.oldModel(2015) + "\n");
        rob1.powerMoves("Sluggernaut/Headshock");
        rob1.useWeapon("Incinerator turbines and Tesla fists");

        System.out.println("Модель робота: " + rob2.getModelName() + "\n"
        + "Марка:" + rob2.getMark() + "\n"
        + "Источник:" + rob2.getOrigin() + "\n"
        + "Высота:" + rob2.getHeight() + "\n"
        + "Масса:" + rob2.getWeight() + "\n"
        + "Скорость:" + rob2.getOrigin() + "\n"
        + "Сила:" + rob2.getSpeed() + "\n"
        + "Броня:" + rob2.getStrength() + "\n"
        + "Убито Kaiju:" + rob2.getArmor() + "\n"
        + "Оружие:" + rob2.getKillKaiju() + "\n"
        + "Old Model:" + rob2.oldModel(2019) + "\n");
        rob2.powerMoves("Six Shooter");
        rob2.useWeapon("Assault Mount 3.25 \"Sting-Blades\" and WMB2x90 AKM Chest launcher");
    }
}