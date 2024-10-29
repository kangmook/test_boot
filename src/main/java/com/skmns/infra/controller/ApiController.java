package com.skmns.infra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.json.simple.JSONObject;

public class ApiController {
    
    @SuppressWarnings("unchecked")
    @RequestMapping(value="/api/get/data.json", method = RequestMethod.GET)
    public String getTextApString(String data1) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", data1);
        return jsonObject.toString();
    }

}
