package com.markus.project.web;

import com.markus.project.common.core.domain.AjaxResult;
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

    @GetMapping("/hello")
    public AjaxResult hello() {
        return AjaxResult.success("Hello Web");
    }
}
