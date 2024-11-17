package com.example.week1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cSyrup")
public class ChocolateSyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Chocolate Syrup";
    }
}
