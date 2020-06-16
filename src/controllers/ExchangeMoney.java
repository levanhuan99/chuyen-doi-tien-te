package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeMoney {
    @GetMapping("/exchange")
    public String exchange(){
        return "form";
    }
    
    @GetMapping("/doExchange")
    public String doExchange(@RequestParam double usd, double rate, Model model){

        double vnd=rate*usd;
        model.addAttribute("vnd",vnd);
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        return "result";
    }

}
