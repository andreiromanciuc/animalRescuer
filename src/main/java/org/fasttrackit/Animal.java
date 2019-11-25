package org.fasttrackit;

public class Animal {

        private int age;
        private int healthLevel; // level 1 .. 10
        private int hungryLevel; // level 1 .. 10
        private int spiritLevel; // level 1 .. 10
        Dog dogAnimal;
        Cat catAnimal;

        public Animal(int age) {
                this.age = age;
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
}
