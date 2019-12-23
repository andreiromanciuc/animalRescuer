package org.fasttrackit;

public class Animal {
        private String name;
        private int age;
        private int healthLevel = 2; // level 1 .. 10
        private int hungryLevel = 3; // level 1 .. 10
        private int spiritLevel = 2; // level 1 .. 10
        private String color;
        private String favoriteFood;
        private String favoriteTime;
        private int sleepingTime; // measured in min 1-10. Due this increase healthLevel and decrease hungryLevel
        Activity favoriteHappyTime;



        public void highSpirit (){
                if (spiritLevel <= 4){
                        System.out.println("Your animal isn't happy.");

                } else if ( 4 < spiritLevel && spiritLevel <= 6){
                        System.out.println("Your animal is ok.");

                } else if ( 6 < spiritLevel) {
                        System.out.println("Your animal is happy");
                }

        }


        public String getFavoriteTime() {
                return favoriteTime;
        }

        public void setFavoriteTime(String favoriteTime) {
                this.favoriteTime = favoriteTime;
        }

        public Animal(String name) {
                this.name = name;
        }

        public Animal() {
                this.setName(name);
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public String getFavoriteFood() {
                return favoriteFood;
        }

        public void setFavoriteFood(String favoriteFood) {
                this.favoriteFood = favoriteFood;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public int getHealthLevel() {
                return healthLevel;
        }

        public void setHealthLevel(int healthLevel) {
                this.healthLevel = healthLevel;
        }

        public int getHungryLevel() {
                return hungryLevel;
        }

        public void setHungryLevel(int hungryLevel) {
                this.hungryLevel = hungryLevel;
        }

        public int getSpiritLevel() {
                return spiritLevel;
        }

        public void setSpiritLevel(int spiritLevel) {
                this.spiritLevel = spiritLevel;
        }

        public int getSleepingTime() {
                return sleepingTime;
        }

        public void setSleepingTime(int sleepingTime) {
                this.sleepingTime = sleepingTime;
        }


}
