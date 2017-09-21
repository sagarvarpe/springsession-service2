package com.example.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by svarpe on 21.09.17.
 */
@RestController("product")
public class ProductController {


    @RequestMapping(method = RequestMethod.GET)
    public String index(Principal principal) {
        return "Hallo from Product Service to " + principal.getName();
    }
}
