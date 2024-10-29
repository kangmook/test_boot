package com.skmns.infra.controller;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    
    @RequestMapping("/")
	public String hello(Model model) throws InterruptedException, ExecutionException, JsonProcessingException {
		model.addAttribute("name", "sungmook kang");
        return "home";
	}

	@RequestMapping("/data.do")
	public String data(Model model) throws InterruptedException, ExecutionException, JsonProcessingException {
		model.addAttribute("name", "sungmook kang");
		return "data";
	}
		
	@RequestMapping(value = "/api/getData.json", method = RequestMethod.GET, produces = "application/json" )
	@ResponseBody
	public HashMap<String, Object> getData(String param1, String param2) throws Exception {
		HashMap<String, Object> rtnParam = new HashMap<String, Object>();
		
		rtnParam.put("param1", param1);
		rtnParam.put("param2", param2);

		return rtnParam;
	}

	@RequestMapping(value = "/api/insertData.json", method = RequestMethod.POST, produces = "application/json")
	public HashMap<String, Object> insertData(String param1, String param2, String param3) throws Exception {
		HashMap<String, Object> rtnParam = new HashMap<String, Object>();
		
		rtnParam.put("param1", param1);
		rtnParam.put("param2", param2);
		rtnParam.put("param3", param3);

		return rtnParam;
	}

	@RequestMapping(value = "/api/updateData.json", method = RequestMethod.PUT, produces = "application/json")	
	public HashMap<String, Object> updateData(String param1, String param2, String param3) throws Exception {
		HashMap<String, Object> rtnParam = new HashMap<String, Object>();
		
		rtnParam.put("param1", param1);
		rtnParam.put("param2", param2);
		rtnParam.put("param3", param3);

		return rtnParam;
	}

	@RequestMapping(value = "/api/deleteData.json", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public HashMap<String, Object> deleteData(String param1) throws Exception {
		HashMap<String, Object> rtnParam = new HashMap<String, Object>();
		
		rtnParam.put("param1", param1);
		rtnParam.put("result", "success");

		return rtnParam;
	}

	
		
	


}
