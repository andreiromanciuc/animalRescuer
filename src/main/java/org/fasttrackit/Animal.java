package org.fasttrackit;

public class Animal {
        private String nameAnimal;
        private int ageAnimal;
        private int healthLevel; // level 1 .. 10
        private int hungryLevel; // level 1 .. 10
        private int spiritLevel; // level 1 .. 10
        private String color;
        private String preferredFood;
        private int sleepingTime; // measured in min 1-10. Due this increase healthLevel and decrease hungryLevel




        public Animal(String nameAnimal, int ageAnimal, String color) {
                this.nameAnimal = nameAnimal;
                this.ageAnimal = ageAnimal;
                this.color = color;
        }

        public String getNameAnimal() {
                return nameAnimal;
        }

        public void setNameAnimal(String nameAnimal) {
                this.nameAnimal = nameAnimal;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public String getPreferredFood() {
                return preferredFood;
        }

        public void setPreferredFood(String preferredFood) {
                this.preferredFood = preferredFood;
        }

        public int getAgeAnimal() {
                return ageAnimal;
        }

        public void setAgeAnimal(int ageAnimal) {
                this.ageAnimal = ageAnimal;
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
