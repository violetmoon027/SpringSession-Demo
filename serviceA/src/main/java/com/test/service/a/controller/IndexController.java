package com.test.service.a.controller;

import com.test.service.a.configuration.MyConfiguration;
import com.test.service.a.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @Autowired
    MyConfiguration configuration;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        /*
         * first flushall to your's redis
         * Enter debug mode on this line and observe the data in redis
         *
         *  1.Observe the number of redis in the case of A \ B ，
         *  2.the number of sessions in redis in case of request return
         */


        // point A
        String result = indexService.index();
        //point B
        String mySessionId = request.getSession() == null ? "null" : request.getSession().getId();
        return " service A return : " + mySessionId + ".  service B return :" + result;
    }

}
