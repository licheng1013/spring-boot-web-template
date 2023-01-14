package com.template.exception;

import com.template.model.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理
 * @author lc
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 处理 ServiceException 异常
     * @since 2021/6/23
     */
    @ExceptionHandler(ServiceException.class)
    public R<String> doHandleServiceException(ServiceException e) {
        return R.fail(e.getMessage());
    }

    /**
     * 处理 Exception 异常
     * @since 2021/6/23
     */
    @ExceptionHandler(Exception.class)
    public R<String> doHandleServiceException(Exception e) {
        e.printStackTrace();
        return R.fail("系统错误");
    }
}
