package com.example.week1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cFrosting")
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrosting() {
        return "Chocolate Frosting";
    }
}
