package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
     return "Hello World!";
    }

//    /hello/<firstName>/<lastName>

    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String helloYou(@PathVariable String firstName, @PathVariable String lastName) {
        return ("Hello, "+firstName+" "+lastName+".");
    }

    @GetMapping("/helloview")
    public String helloView() {
        return "home";

    }

    @GetMapping("/colors")
    private String passParam(Model model) {
       LocalTime now = LocalTime.now();

       //to check if app is working
//        String str = "2018-04-28 01:00";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime now = LocalDateTime.parse(str, formatter);


        if (now.getHour()>8 && now.getHour()<20) {
            model.addAttribute("backgroundColor", "white");
            model.addAttribute("color", "black");
        } else {
            model.addAttribute("backgroundColor", "black");
            model.addAttribute("color", "white");
        }
        return "home";
    }


}
