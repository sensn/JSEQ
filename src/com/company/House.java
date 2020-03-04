package com.company;

public class House {
    public int  numchannels=10;
    Room[] rooms = new Room[10];

    House(){
        for (int i = 0; i < numchannels; i++) {
            rooms[i]=new Room();
        }
    }

}
