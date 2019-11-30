package org.fasttrackit;

public class Animal {
        private String name;
        private int age;
        private int healthLevel; // level 1 .. 10
        private int hungryLevel; // level 1 .. 10
        private int spiritLevel; // level 1 .. 10
        private String color;
        private String favoriteFood;
        private String favoriteTime = "play";
        private int sleepingTime; // measured in min 1-10. Due this increase healthLevel and decrease hungryLevel
        HappyTime favoriteHappyTime;



        public Animal(String nameAnimal, int ageAnimal, String color) {
                this.name = nameAnimal;
                this.age = ageAnimal;
                this.color = color;
        }




        public String getFavoriteTime() {
                return favoriteTime;
        }

        public void setFavoriteTime(String favoriteTime) {
                this.favoriteTime = favoriteTime;
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
