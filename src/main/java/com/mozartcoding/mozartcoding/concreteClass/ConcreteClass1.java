package com.mozartcoding.mozartcoding.concreteClass;

import com.mozartcoding.mozartcoding.abstractClass.AbstractClass1;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConcreteClass1 {
    private final AbstractClass1 abstractClass1;
}
