package ru.geekbrains.dz;

public class Cat {
    boolean isWin;
    private double lengthMaxRun;
    private double heightMaxJump;

    public Cat(double lengthMaxRun, double heightMaxJump) {
        this.lengthMaxRun = lengthMaxRun;
        this.heightMaxJump = heightMaxJump;
    }

    public boolean isWin() {
        return isWin;
    }

    public double getLengthMaxRun() {
        return lengthMaxRun;
    }

    public double getHeightMaxJump() {
        return heightMaxJump;
    }

    public void jump() {
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
            if (this.getHeightMaxJump() >= ((Wall) o).getHeight()) {
                this.jump();
            } else {
                isWin = true;
                System.out.println("Слищком высоко!");
            }
        }
    }
}

