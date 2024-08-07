package com.JavaDepIjection.JavaDepIjection.nebi;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Tractor  implements  Ivehicle{
    private String name;
    private Date builtDate;
    private int id;
    private int mileage;


    public  Tractor() {
        System.out.println("Tractor class started.");
        this.name = "Çuf çuf traktör";
    }

    public Tractor(String name, int id){
        this.name = name;
        this.id = id;
        this.builtDate = new Date();
    }


    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleAge() {
        Date now = new Date();
        int age =now.getYear()- builtDate.getYear();
        return age;
    }

    @Override
    public int getVehicleId() {
        return id;
    }
}
