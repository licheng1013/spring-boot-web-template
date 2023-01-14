package com.template.api;

import com.template.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lc
 * @since 2023/1/14
 */
@RestController
@RequestMapping("/user")
public class UserApi {
    @GetMapping("login") //这里方便测试使用了 GetMapping 如需使用Post则 PostMapping
    public R<String> login(){
        return R.okMsg("login");
    }
}
