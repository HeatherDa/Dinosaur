package com.Heather;

public class DinosaurSupervisor {

    public static void main(String[] args) {
	// write your code here
        Dinosaur t_rex=new Dinosaur();
        Dinosaur velociraptor=new Dinosaur();
        Dinosaur diplodocus=new Dinosaur();

        t_rex.roar();
        velociraptor.roar();
        diplodocus.roar();
        t_rex.stomp();
        diplodocus.stomp();

    }
}
