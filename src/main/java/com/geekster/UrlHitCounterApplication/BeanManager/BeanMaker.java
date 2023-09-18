package com.geekster.UrlHitCounterApplication.BeanManager;

import com.geekster.UrlHitCounterApplication.Entity.UrlHitCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration

public class BeanMaker {
    @Bean
    public List<UrlHitCounter> getUrlHitCounterList()
    {
        return new ArrayList<>();
    }

}
