package com.example.webapl.controller;

import com.example.webapl.domain.Role;
import com.example.webapl.domain.Users;
import com.example.webapl.repos.UsersRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UsersRep usersRep;
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String addUser(Users users, Map<String, Object> model) {
        Users userFromDb = usersRep.findByUsername(users.getUsername());

        if(userFromDb != null){
            model.put("message", "User exists!");
            return "registration";
        }
        int a = (int) (Math.random()*(2+1)) + 1;
        users.setActive(true);
        switch (a){
            case 1: users.setRoles(Collections.singleton(Role.USER));
                    users.setRefresh(5);
                    break;
            case 2: users.setRoles(Collections.singleton(Role.ADMIN));
                users.setRefresh(1000);
                break;
            case 3: users.setRoles(Collections.singleton(Role.AUTH));
                users.setRefresh(50);
                break;
        }
        usersRep.save(users);
        return "redirect:/login";
    }
}
