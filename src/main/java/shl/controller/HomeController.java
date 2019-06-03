package shl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController{

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

    @RequestMapping("/admin")
    public ModelAndView admin() {
        ModelAndView mav = new ModelAndView("admin");
        return mav;
    }
}
