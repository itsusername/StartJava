package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger rob1 = new Jaeger("Cherno Alpha (Jaeger)", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10, 4);

        System.out.println(rob1);
        rob1.oldModel(2019);
        System.out.println("Old Model: " + rob1.oldModel(2010));
        rob1.powerMoves("Sluggernaut/Headshock");
        rob1.useWeapon("Incinerator turbines and Tesla fists" + ".n");

        Jaeger rob2 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10, 10, 9, 2);

        System.out.println(rob2);
        System.out.println("Old Model: " + rob2.oldModel(2010));
        rob2.powerMoves("Six Shooter");
        rob2.useWeapon("Assault Mount 3.25 \"Sting-Blades\" and WMB2x90 AKM Chest launcher");
    }
}
