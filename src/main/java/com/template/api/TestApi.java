package com.template.api;

import com.template.exception.ServiceException;
import com.template.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 * @since 2023/1/14
 */
@RestController
@RequestMapping("/test")
public class TestApi {
    @GetMapping("/index")
    public R<String> index(){
        return R.okMsg("HelloWorld");
    }
    @GetMapping("/err")
    public R<String> err(){
        throw new ServiceException("模拟业务异常!");
    }
}
