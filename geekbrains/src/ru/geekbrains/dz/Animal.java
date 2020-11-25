package ru.geekbrains.dz;

public abstract class Animal implements Participants {
    private String name;
    private String color;
    private boolean readyDistance;
    private int lengthMaxRun;
    private int heightMaxJump;


    Animal(String name, String color, int lengthMaxRun, int heightMaxJump) {
        this.name = name;
        this.color = color;
        this.lengthMaxRun = lengthMaxRun;
        this.heightMaxJump = heightMaxJump;
        this.readyDistance = true;
    }
    public void run() {
        System.out.println(name +" " + color + " бежит");
    }

    public void jump() {
        System.out.println(name +" " + color + " прыгает");
    }
    public void action(Obstacles o) {

        if (o instanceof Treadmill) {
            if (lengthMaxRun >= ((Treadmill) o).getDistance()) {
                this.run();
            } else {
                readyDistance = false;
                System.out.println(name +" Сходит с дистанции");
            }
        }
        if (o instanceof Wall) {
            if (heightMaxJump >= ((Wall) o).getDistance()) {
                this.jump();
            } else {
                readyDistance = false;
                System.out.println(name +" Сходит с дистанции");
            }

        }
    }

    @Override
    public void printInfo() {
        System.out.println("Результат гонки: " +name + " " + isReadyDistance());
    }

    public boolean isReadyDistance() {
        return readyDistance;
    }

    public String getName() {
        return name;
    }

    public void setReadyDistance(boolean readyDistance) {
        this.readyDistance = readyDistance;
    }
}