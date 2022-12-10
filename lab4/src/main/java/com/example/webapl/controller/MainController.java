package com.example.webapl.controller;

import com.example.webapl.domain.Users;
import com.example.webapl.repos.UsersRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.*;
import java.util.Map;

import static com.example.webapl.course.getHTML;

@Controller
public class MainController {

    @Autowired
    private UsersRep usersRep;

    @GetMapping("/")
    public String greeting(Map<String, Object> model){

        return "greeting";
    }
    @GetMapping("/course")
    public String course(Map<String, Object> model){
        String url = "https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5";
        try {
            model.put("course", getHTML(url));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "course";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        return "main";
    }
}
