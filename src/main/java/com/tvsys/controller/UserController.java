package com.tvsys.controller;

import com.tvsys.entity.User;
import com.tvsys.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public void create(@RequestBody User user) {

        userRepository.save(user);

    }

    @ResponseBody
    @GetMapping("/users")
    public List<User> read() {

        List<User> users = userRepository.findAll(); // Busca todos os users no banco de dados

        return users;

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/users", method = RequestMethod.PUT)
    public void update(@RequestBody User user) {

        userRepository.save(user);

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/users/{userId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long userId){

        userRepository.deleteById(userId);

    }

}
