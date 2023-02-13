package com.project.db.controller;

import com.project.db.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MsgController {
    @Autowired
    private MsgService msgService;

    @RequestMapping("/messages")
    @ResponseBody
    public ResponseEntity<List> getMessages(){
        return new ResponseEntity<List>(msgService.getMessages(), HttpStatus.OK);
    }
}
