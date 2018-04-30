package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
@RequestMapping("/first")
public class FormController {
    @GetMapping("/form")
    public String getForm() {
        return "/WEB-INF/views/Form.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String postForm(@RequestParam(name="paramName") String paramName){
        return paramName;
    }


}
