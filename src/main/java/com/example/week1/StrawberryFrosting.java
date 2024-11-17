package com.example.week1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sFrosting")
public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrosting() {
        return "Strawberry Frosting";
    }
}
