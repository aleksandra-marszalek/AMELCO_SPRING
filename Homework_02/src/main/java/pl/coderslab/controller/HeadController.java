package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;


@Controller
public class HeadController {

@GetMapping("/showUserAgent")
    public String showUserAgent(Model model, @RequestHeader("user-agent") String userAgent) {
        model.addAttribute("userAgent", userAgent);
        return "userAgent";
    }

    @GetMapping("/workers")
    public String workersAction (Model model){
        Random rand = new Random();
        int n = rand.nextInt(29)+1;
        String nString;
//        String line="";
        String worker="";
        if (n <10) {
            nString = ("0"+n);
        } else {
            nString = (n+"");
        }

        File file = new File("/Users/janmadej/Desktop/modul4/spring/Homework_02/src/main/java/pl/coderslab/Workers.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] splits = line.split(",");
                if (splits[0].equals(nString)) {
                    worker = splits[1];
                }
            }
            System.out.println(nString);
            if (worker.equals("")) {
                model.addAttribute("numberWorker", nString);
                model.addAttribute("worker", "no such Worker");
            } else {
                model.addAttribute("worker", worker);
                model.addAttribute("numberWorker", nString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "workers";
    }
}
