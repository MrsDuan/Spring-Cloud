package com.funtl.hello.spring.cloud.web.admin.feign.service;

import com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {


    /**
     *  FeignClient(value = "hello-spring-cloud-service-admin")
     *  RequestMapping(value = "hi",method = RequestMethod.GET)
     *  RequestParam(value = "message")
     *  RequestParam(value="uname")
     *  http://hello-spring-cloud-service-admin/hi?message=HiFeign&uname=duancuntao
     */
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message,@RequestParam(value="uname") String name);
}
