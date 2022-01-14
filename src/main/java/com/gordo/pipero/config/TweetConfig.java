package com.gordo.pipero.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Configuration
public class TweetConfig {

    @Bean
    public Twitter twitter(){
        ConfigurationBuilder config = new ConfigurationBuilder();
        //Set up your credentials here
        TwitterFactory factory = new TwitterFactory();
        return factory.getInstance();
    }

}
