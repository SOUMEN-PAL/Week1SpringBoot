package com.example.week1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CakeBacker {

    private final Syrup srp;
    private final Frosting frs;

    public CakeBacker(
           @Qualifier("cSyrup") Syrup srp,
           @Qualifier("sFrosting") Frosting frs
    ) {

        this.srp = srp;
        this.frs = frs;
    }

    String bakeCake(){
        String frosting = frs.getFrosting();
        String syrup = srp.getSyrup();

        return "Used " + frosting + " " + syrup + " in baking the cake";
    }

}