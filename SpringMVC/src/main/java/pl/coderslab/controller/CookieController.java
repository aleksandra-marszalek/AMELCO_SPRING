package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @GetMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setCookie (HttpServletResponse response, @PathVariable String value1, @PathVariable String value2) {
            Cookie cookie1 = new Cookie("cookie1", value1);
            cookie1.setPath("/");
            response.addCookie(cookie1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie2.setPath("/");
        response.addCookie(cookie2);
            return "setCookies";
    }


    @RequestMapping("/getcookies")
    @ResponseBody
    public String home(HttpServletRequest request){
        Cookie c = WebUtils.getCookie(request, "cookie2");
        return "cookie2: " + c.getValue();
    }

    @RequestMapping("/cookieGet")
    @ResponseBody
    public String home(@CookieValue("cookie1") String fooCookie) {
        return "cookie1: " +fooCookie ;
    }

}
