package com.lazy.house.web.controller;

import java.util.List;

import com.lazy.house.biz.service.RecommendService;
import com.lazy.house.common.model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomepageController {
  
  @Autowired
  private RecommendService recommendService;
  
  @RequestMapping("index")
  public String accountsRegister(ModelMap modelMap){
    List<House> houses =  recommendService.getLastest();
    modelMap.put("recomHouses", houses);
    return "/homepage/index";
  }
  

  @RequestMapping("")
  public String index(ModelMap modelMap){
    return "redirect:/index";
  }
}
