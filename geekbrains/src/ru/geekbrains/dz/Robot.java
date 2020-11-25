package ru.geekbrains.dz;

public class Robot implements Participants, Swimable{
    int maxSwim;
    private String model;
    private boolean readyDistance;
    private double lengthMaxRun;
    private double heightMaxJump;

    public Robot(double lengthMaxRun, double heightMaxJump, int maxSwim, String model) {
        this.lengthMaxRun = lengthMaxRun;
        this.heightMaxJump = heightMaxJump;
        this.model = model;
        this.maxSwim = maxSwim;
        this.readyDistance = true;
    }

    @Override
    public void swim(Obstacles o) {

            if(maxSwim >= o.getDistance()) {
                System.out.println(model + " плывет");
            }
            else {
                readyDistance = false;
                System.out.println(model + " Сошел с дистанции");
            }

        }

    @Override
    public void printInfo() {
        System.out.println("Результат гонки: " + model + " " + readyDistance);
    }

    public boolean isReadyDistance() {
        return readyDistance;
    }



    public void jump() {
        System.out.println(model + " прыгает!");
    }

    public void run() {
        System.out.println(model +" бежит!");
    }

    public void action(Obstacles o) {

        if (o instanceof Treadmill) {
            if (lengthMaxRun >= ((Treadmill) o).getDistance()) {
                this.run();
            } else {
                readyDistance = false;
                System.out.println(model + " Сходит с дистанции");
            }
        }

        if (o instanceof Wall) {
            if (heightMaxJump >= ((Wall) o).getDistance()) {
                this.jump();
            } else {
                readyDistance = false;
                System.out.println(model + " Сходит с дистанции");
            }
        }
    }
}


