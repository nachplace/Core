package ru.geekbrains.core;

public class Main {
    public static void main(String[] args) {
        HumanBeing man1 = new HumanBeing("Jack", 500, 60);
        HumanBeing man2 = new HumanBeing("Max", 700, 80);
        HumanBeing woman1 = new HumanBeing("Lola", 400, 40);
        HumanBeing woman2 = new HumanBeing("Liz", 350, 50);
        Cat cat1 = new Cat("Barsik", 1000, 150);
        Cat cat2 = new Cat("Murzik", 1500, 130);
        Robot robot1 = new Robot("Steve", 2500, 300);

        Wall wall1 = new Wall(30);
        Wall wall2 = new Wall(50);
        Wall wall3 = new Wall(100);

        Treadmill treadmill1 = new Treadmill(300);
        Treadmill treadmill2 = new Treadmill(500);
        Treadmill treadmill3 = new Treadmill(1200);

        Member[] members = {man1, man2, woman1, woman2, cat1, cat2, robot1};
        Barrier[] barriers = {treadmill1, treadmill2, treadmill3, wall1, wall2, wall3};

        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < 3; j++) {
                members[i].run(barriers[j]);
            }

            for (int j = 3; j < barriers.length; j++) {
                members[i].jump(barriers[j]);
            }
            System.out.println();
            System.out.println();
        }

    }
}
