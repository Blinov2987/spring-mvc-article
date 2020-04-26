package com.marcobehler.springmvcarticle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _404WithMissingResponseBodyController {

    @GetMapping("/users/{id}")
    public User getUser_404(@PathVariable String id) {
        return new User("Everyone's name is John", id);
    }

    @GetMapping("/users2/{id}")
    @ResponseBody
    public User getUser_200(@PathVariable String id) {
        return new User("Everyone's name is John", id);
    }
}
