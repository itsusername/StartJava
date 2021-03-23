public class WolfTest {

    public static void main(String[] args) {
        Wolf wlf1 = new Wolf();

        wlf1.setSex('m');
        wlf1.setAlias("Перчик");
        wlf1.setWeight(18);
        wlf1.setAge(3);
        wlf1.setColor("Коричневый");
        
        System.out.println("Пол: " + wlf1.getSex());
        System.out.println("Кличка: " + wlf1.getAlias());
        System.out.println("Вес: " + wlf1.getWeight());
        System.out.println("Возраст: " + wlf1.getAge());
        System.out.println("Окрас: " + wlf1.getColor());

        wlf1.move();
        wlf1.sit();
        wlf1.run();
        wlf1.voice();
        wlf1.hunt();

    }
}