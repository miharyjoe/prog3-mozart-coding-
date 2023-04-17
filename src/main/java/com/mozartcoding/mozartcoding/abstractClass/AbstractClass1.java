package com.mozartcoding.mozartcoding.abstractClass;

import com.mozartcoding.mozartcoding.concreteDependance.ConcreteDependance1;
import com.mozartcoding.mozartcoding.concreteDependance.ConcreteDependance2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;
}
