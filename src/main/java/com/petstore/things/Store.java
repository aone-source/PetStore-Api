package com.petstore.things;

import com.petstore.animals.BirdBreed;

import java.util.ArrayList;

    public class Store <E,I,P> {
        private ArrayList<E> employees;
        private ArrayList<I> inventory;
        private ArrayList<P> pets;

        public Store() {
            ArrayList<Food> food = new ArrayList<>();
            ArrayList<BirdBreed> bird = new ArrayList<>();
            bird.add(BirdBreed.CANARY);
            bird.size();


            employees = new ArrayList<>();
            inventory = new ArrayList<>();
            pets = new ArrayList<>();
        }

        public void hireEmployee(E employee) {
            employees.add(employee);
        }

        public I sell() throws Exception {
            if (inventory.isEmpty())
                throw new Exception("No more inventory");
            return inventory.remove(0);
        }

        public void addToInventory(I item) {
            inventory.add(item);
        }

    }



