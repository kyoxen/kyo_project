package com.kyo;


import com.kyo.Model.KyoModel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class KyoApplication {





    public static void main(String[] args) {

        BigDecimal rates = new BigDecimal("1.00");


        BigDecimal rate = rates.multiply(new BigDecimal(0.01)).setScale(4,BigDecimal.ROUND_DOWN);
        System.out.println(rate);

        List<KyoModel> kyoModelList = Arrays.asList(new KyoModel("Sheesh","sss"),new KyoModel("Sheesh1","sWERss"));

        Map<String,String> map = kyoModelList.stream().collect(Collectors.toMap(KyoModel::getKey,KyoModel::getValue));

        System.out.println(kyoModelList);
        System.out.println(map);
        SpringApplication.run(KyoApplication.class,args);
    }
}
