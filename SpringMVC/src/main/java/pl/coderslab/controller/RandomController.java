package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping("/random")
    @ResponseBody
    public String showRandom() {
        Random rand = new Random();
        int  n = rand.nextInt(100)+1;
        return ("Wylosowano liczbę: "+n);
    }

    @GetMapping("/random/{max}")
    @ResponseBody
    public String showRandomMax(@PathVariable int max) {
        Random rand = new Random();
        int  n = rand.nextInt(max)+1;
        return ("Użytkownik podal: " + max+ ". Wylosowano liczbę: "+n);
    }

    @GetMapping("/random/{min}/{max}")
    @ResponseBody
    public String showRandomMinMax(@PathVariable int min, @PathVariable int max) {
        Random rand = new Random();
        int  n = rand.nextInt(max-min)+min;
        return ("Użytkownik podal min: " + min + ", max: " + max+ ". Wylosowano liczbę: "+n);
    }
}
