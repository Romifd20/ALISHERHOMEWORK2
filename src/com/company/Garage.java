package com.company;

public class Garage <E extends Car> implements Printable<E>{

        private E inhabitant;

        public Garage(E inhabitant) {
            this.inhabitant = inhabitant;
        }

        public E getInhabitant() {
            return inhabitant;
        }


        public void setInhabitant(E inhabitant1) {
            this.inhabitant = inhabitant1;
        }

    @Override
    public void print(E e) {
        System.out.println("----------------------------");
        System.out.println(e.getClass().getSimpleName()+" "+ e.getModel()+ " в доме.");
    }











}
