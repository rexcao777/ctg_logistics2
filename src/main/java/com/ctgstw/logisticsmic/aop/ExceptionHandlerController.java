package com.ctgstw.logisticsmic.aop;

import com.ctgstw.logisticsmic.common.entity.ResponseCode;
import com.ctgstw.logisticsmic.common.entity.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

/**
 * @Author: 黄方健
 * @Description: 全局异常捕获
 * @Date: 创建于 2017/10/31 下午11:08
 */
@ControllerAdvice
public class ExceptionHandlerController {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ServerResponse exceptionHandler(HttpServletRequest request, Exception e) {
        // 验证controller层传入参数异常
        if (e instanceof ConstraintViolationException) {
            return ServerResponse.createByErrorMessage(ResponseCode.PARAMETER_ERROR.getDesc());
        }
        logger.error("*****************************异常开始*******************************");
        logger.error("请求者IP: {}，", request.getRemoteAddr());
        logger.error("请求时间: {},", formatter.format(System.currentTimeMillis()));
        logger.error("请求地址:" + request.getRequestURL());
        logger.error("请求方式: {}", request.getMethod());
        logger.error("请求参数:");
        Enumeration enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String name = enumeration.nextElement().toString();
            logger.error(name + "---" + request.getParameter(name));
        }
        StackTraceElement[] error = e.getStackTrace();
        for (StackTraceElement stackTraceElement : error) {
            logger.error(stackTraceElement.toString());
        }
        logger.error("*****************************异常结束*******************************");
        return ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(), "系统异常，请稍后再试.");
    }
}
