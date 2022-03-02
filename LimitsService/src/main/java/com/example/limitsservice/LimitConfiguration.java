package com.example.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@AllArgsConstructor
public class LimitConfiguration {

    private int max;
    private int min;

    protected LimitConfiguration(){}
}
