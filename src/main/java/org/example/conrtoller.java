package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LeeSon QQ & WX:25901875
 * @version V1.0
 * @Package org.example
 * @create 2019-12-11 19:06
 * @Copyright © 2019 LeeSon QQ & WX:25901875
 */
@RestController
public class conrtoller {
    @Autowired
    E e;
    @GetMapping("/")
    public E test() {
        e.setUsername("bbb");
        e.setAge(10);

        return e;
    }
}
