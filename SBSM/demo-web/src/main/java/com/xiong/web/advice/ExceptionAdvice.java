package com.xiong.web.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionAdvice {


    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView handleRuntimeException(RuntimeException exception){
        return new ModelAndView("error/404");
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView handleException(Exception exception){
        return new ModelAndView("error/404");
    }
}
