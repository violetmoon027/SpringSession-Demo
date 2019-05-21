package com.test.service.a.service;

import com.test.service.a.serviceinterface.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

    @Autowired
    ServiceB serviceB;

    public String index() {
        return serviceB.index();
    }
}
