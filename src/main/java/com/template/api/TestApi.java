package com.template.api;

import com.template.exception.ServiceException;
import com.template.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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
    @RequestMapping("/json")
    public R<String> json(int page,int size){
        return R.okData(page+":"+size);
    }
    @PostMapping("/upload")
    public R<String> upload(MultipartFile file) {
        String fileName =  file.getOriginalFilename();
        String path = "C:\\Users\\lc\\IdeaProjects\\spring-boot-web-template\\";
        try {
            if (fileName == null){
                return R.fail("文件名为空");
            }
            File f = new File(path+fileName);
            file.transferTo(f);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("上传失败");
        }
        return R.okMsg("上传成功");
    }
}
