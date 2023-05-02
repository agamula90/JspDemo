package me.mvc.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DogsController {

    @GetMapping("dogs")
    @ResponseBody
    List<String> getDogs() {
        return new ArrayList<>();
    }

    @GetMapping("/")
    String index() {
        return "index";
    }
}
