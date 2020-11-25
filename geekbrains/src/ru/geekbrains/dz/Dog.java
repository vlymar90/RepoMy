package ru.geekbrains.dz;

public class Dog extends Animal implements Swimable {
    int maxSwim;

    public Dog(String name, String color,int lengthMaxRun, int heightMaxJump, int maxSwim) {
        super(name, color, lengthMaxRun, heightMaxJump);
        this.maxSwim = maxSwim;
    }

    @Override
    public void swim(Obstacles o) {
        if(maxSwim >= o.getDistance()) {
            System.out.println(getName() + " плывет");
        }
        else {
            setReadyDistance(false);
            System.out.println(getName() + " Сошел с дистанции");
        }

    }

    /* public void run() {
        System.out.println("Я бегу!");
    }

    public void jump() {
        System.out.println("Я прыгаю!");
    }

    public void action(Object o) {
        isWin = false;
        if (o instanceof Treadmill) {
            if (this.getLengthMaxRun() >= ((Treadmill) o).getDistance()) {
                this.run();
            } else {
                isWin = true;
                System.out.println("Слишком длинная дистанция!");
            }
        }
        if (o instanceof Wall) {
            if (this.getHeightMaxJump() >= ((Wall) o).getDistance()) {
                this.jump();
            } else {
                isWin = true;
                System.out.println("Слищком высоко!");
            }
        }
    } */
}
