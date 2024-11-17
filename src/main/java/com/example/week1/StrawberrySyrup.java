package com.example.week1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sSyrup")
public class StrawberrySyrup implements Syrup {
    @Override
    public String getSyrup() {
        return "Strawberry Syrup";
    }
}
