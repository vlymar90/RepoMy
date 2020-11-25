package ru.geekbrains.dz;

public class Cat extends Animal {

    public Cat(String name, String color,int lengthMaxRun, int heightMaxJump) {
        super(name, color, lengthMaxRun, heightMaxJump);
    }




    /*public void jump() {
        System.out.println("Я прыгаю!");
    }

    public void run() {
        System.out.println("Я бегу!");
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

