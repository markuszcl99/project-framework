package com.markus.project.web;

import com.markus.project.common.config.PeopleConfig;
import com.markus.project.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: markus
 * @date: 2022/12/17 2:48 PM
 * @Description: Web Hello
 * @Blog: http://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
@RestController
public class HelloController {

    /**
     * 数组形式获取 xx.xx[0]
     */
    @Value("${server.port}")
    private String port;

    @Autowired
    private Environment environment;

    @Autowired
    private PeopleConfig peopleConfig;


    @GetMapping("/hello")
    public AjaxResult hello() {
        System.out.println(environment.getProperty("server.port"));
        System.out.println(peopleConfig);
        return AjaxResult.success("Hello Web");
    }
}
