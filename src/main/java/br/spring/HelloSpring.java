package br.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpring {

    @RequestMapping(value = "/spring", method = RequestMethod.GET)
    public ModelAndView showMessage(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        ModelAndView mv = new ModelAndView("hellospring");
        mv.addObject("name", name);
        return mv;
    }
}
