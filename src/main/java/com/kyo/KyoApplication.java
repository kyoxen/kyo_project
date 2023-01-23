package com.kyo;


import com.kyo.Model.KyoModel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class KyoApplication {





    public static void main(String[] args) {

        List<KyoModel> kyoModelList = Arrays.asList(new KyoModel("Sheesh","sss"),new KyoModel("Sheesh1","sWERss"));

        Map<String,String> map = kyoModelList.stream().collect(Collectors.toMap(KyoModel::getKey,KyoModel::getValue));

        System.out.println(kyoModelList);
        System.out.println(map);
        SpringApplication.run(KyoApplication.class,args);
    }
}
