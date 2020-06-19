package com.amy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testing {
    public static void main(String[] args) {
        File saveFile = new File("20200609.txt");
        FileWriter writer = null;
        try{
            writer = new FileWriter(saveFile,true);
        }catch(IOException e){
            e.printStackTrace();
        }
        Car car = new Car("AAB=5566");
        Car truck = new Truck("DE336");
        try{
            writer.write(car.id+","+car.enter+","+car.leave);
            writer.write("\n");
            writer.write(truck.id+","+truck.enter+","+truck.leave);
            writer.write("\n");
            writer.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
