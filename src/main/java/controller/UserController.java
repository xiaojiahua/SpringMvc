package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("controller")
public class UserController {
    @RequestMapping("/a")
    public String test1(){
       return "a";
    }
    @RequestMapping("/b")
     public String test2(@RequestParam("bb") String aa){
        System.out.println (aa);
        return "c";
        }
    @RequestMapping("/c")
    @ResponseBody
    public String test3(){
        return "hello world";
    }
}
