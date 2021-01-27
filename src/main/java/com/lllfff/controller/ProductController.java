package com.lllfff.controller;

import com.lllfff.service.ProductService;
import com.lllfff.vo.BarVO;
import com.lllfff.vo.DataVO;
import com.lllfff.vo.PieVO;
import com.lllfff.vo.ProductBarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    @ResponseBody
    public DataVO list(Integer page,Integer limit){
        return productService.findData(page, limit);
    }

    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }

    @RequestMapping("/barVO")
    @ResponseBody
    public BarVO getBarVO(){
        return productService.getBarVO();
    }
      @RequestMapping("/pieVO")
    @ResponseBody
    public List<PieVO> getPieVO(){
        return productService.getPieVO();
    }
}
