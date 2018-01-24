package com.jeecx.exception;

import com.jeecx.bean.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class GlobalException {

    private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);
    
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResponse onException(Exception e) {
        logger.info("GlobalException",e);
        return JsonResponse.error();
    }
}
