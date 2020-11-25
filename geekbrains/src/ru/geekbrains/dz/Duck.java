package ru.geekbrains.dz;

public class Duck extends Animal implements Swimable {
    int maxSwim;

    Duck(String name, String color, int lengthMaxRun, int heightMaxJump, int maxSwim) {
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
    }

