package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @InitBinder
    public void initMyBinder(WebDataBinder binder) {
        // 添加对日期的统一处理
        //binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));

        // 添加表单验证
        //binder.addValidators();
    }

    @ModelAttribute
    public void addMyAttribute(Model model) {
        model.addAttribute("user", "zfh"); // 在@RequestMapping的接口中使用@ModelAttribute("name") Object name获取
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody // 如果使用了@RestControllerAdvice，这里就不需要@ResponseBody了
    public Map handler(Exception ex) {
        logger.error("统一异常处理", ex);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 400);
        //判断异常的类型,返回不一样的返回值
        if(ex instanceof MissingServletRequestParameterException){
            map.put("msg","缺少必需参数："+((MissingServletRequestParameterException) ex).getParameterName());
        }
        else if(ex instanceof BussinessException){
            map.put("msg","这是自定义异常");
        }
        return map;
    }

    /**
     * 如果不需要返回json数据，而要渲染某个页面模板返回给浏览器，那么可以这么实现：
     * @param ex
     * @return
     */
//    @ExceptionHandler(value = BussinessException.class)
//    public ModelAndView myErrorHandler(BussinessException ex) {
//        ModelAndView modelAndView = new ModelAndView();
//        //指定错误页面的模板页
//        modelAndView.setViewName("error");
//        modelAndView.addObject("code", ex.getCode());
//        modelAndView.addObject("msg", ex.getMsg());
//        return modelAndView;
//    }
}
