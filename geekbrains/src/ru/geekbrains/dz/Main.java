package ru.geekbrains.dz;




public class Main {

    public static void main(String[] args) {
         Course c = new Course(new Obstacles[]{new Wall(2), new Treadmill(100), new Watter(50)});
         Team team = new Team(new Participants[]{new Robot(100, 5, 60,"T - 1000"),
         new Cat("Barsic", "gray", 50, 4 ),
         new Dog("Bobic", "black", 150,2, 30),
         new Duck("Scrooge", "wheit", 30, 3, 80)});

         team.gameStart(c);
         team.resultCross(team.participants);
        }
    }


