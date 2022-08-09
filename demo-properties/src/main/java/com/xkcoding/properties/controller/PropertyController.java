package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.properties.property.ApplicationProperty;
import com.xkcoding.properties.property.DeveloperProperty;
import com.xkcoding.properties.property.ProductProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:49
 */
@RestController
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;
    private final ProductProperty productProperty;

    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty, ProductProperty productProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
        this.productProperty = productProperty;
    }

    @GetMapping("/developerProperty")
    public Dict index1() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
    }

    @GetMapping("/productProperty")
    public Dict index2(){
        return Dict.create().set("applicationProperty",applicationProperty).set("productProperty",productProperty);
    }
}
