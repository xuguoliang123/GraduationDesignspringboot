package com.example.demo.Controller;


import com.example.demo.Interface.MemberRepository;

import com.example.demo.Interface.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/hello")
public class MemberController {
        @Qualifier("MemberRepository")
        private MemberRepository repository;
        @RequestMapping(value = "/test",method = RequestMethod.GET)
        public List<User> Test() {
          return   repository.findByName("xuguoliang");
        }

}
