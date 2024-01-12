package com.skmns.infra.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class IndexController {
    
    @RequestMapping("/")
	public String hello(Model model) throws InterruptedException, ExecutionException, JsonProcessingException {
		model.addAttribute("name", "sungmook kang");
        return "home";
	}

}
