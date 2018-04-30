package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class FreeTimeController {



    @GetMapping("/freeTime")
    @ResponseBody
    public String freeTime() {
        LocalDateTime now = LocalDateTime.now();

        //to check the app
//        String str = "2018-04-28 05:30";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime now = LocalDateTime.parse(str, formatter);

        String dayOfWeek = now.getDayOfWeek().toString();
        System.out.println(dayOfWeek);
        Integer hour = now.getHour();
        if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday")) {
            return "Wolne";
        } else if (hour>9 && hour<17) {
            return  "Pracuje, nie dzwon.";
        } else {
            return "Po Pracy";
        }

    }




}
