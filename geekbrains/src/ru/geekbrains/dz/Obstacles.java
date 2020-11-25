package ru.geekbrains.dz;

public abstract class Obstacles {
    int distance;;
    int height;

    public Obstacles(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }
}
