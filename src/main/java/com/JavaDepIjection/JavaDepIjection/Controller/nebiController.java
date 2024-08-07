package com.JavaDepIjection.JavaDepIjection.Controller;

import com.JavaDepIjection.JavaDepIjection.nebi.Automobile;
import com.JavaDepIjection.JavaDepIjection.nebi.Ivehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nebi")
public class nebiController {


    private Ivehicle myVehicle;
    private Ivehicle mySecondVehicle;
    private Ivehicle myThirdVehicle;

    @Autowired
    public nebiController(@Qualifier("automobile") Ivehicle vehicle,
                           @Qualifier("tractor") Ivehicle vehicle2,
                           @Qualifier("automobile") Ivehicle vehicle3) {
        myVehicle = vehicle;
        mySecondVehicle = vehicle2;
        myThirdVehicle = vehicle3;

    }
    @GetMapping("/")
    public String getNebiController(){
        return myVehicle.getVehicleName() + " " + mySecondVehicle.getVehicleName();
    }

    @GetMapping("/check")
    public boolean check(){
        return myVehicle == myThirdVehicle;
    }

}
