package com.JavaDepIjection.JavaDepIjection.nebi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Primary
public class Automobile  implements Ivehicle{

    private String name;
    private Date builtDate;
    private int id;
    private int mileage;

    public Automobile() {
        System.out.println("Automobile class started.");
        this.name = "Düz Araç";
    }
    public Automobile(String name, int id){
        this.name = name;
        this.id = id;
        this.builtDate = new Date();
        this.mileage = 0;
    }

    public void increaseMileage(int mileage) {
        this.mileage = ++mileage;
    }

    public void resetMileage() {
        this.mileage = 0;
    }



    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleAge() {
        Date now = new Date();
        int age = now.getYear() - builtDate.getYear();
        return age;
    }

    @Override
    public int getVehicleId() {
        return id;
    }
}
