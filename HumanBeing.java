package ru.geekbrains.core;

public class HumanBeing implements Member {
    protected String name;
    protected int length;
    protected int height;

    public HumanBeing(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public void run(Barrier barrier) {
        if (length >= barrier.length) {
            System.out.print(name + " RunRunRun ") ;

        }
    }

    public void jump(Barrier barrier) {
        if (height >= barrier.height) {
            System.out.print(name + " JumpJumpJump ");

        }
    }


}
