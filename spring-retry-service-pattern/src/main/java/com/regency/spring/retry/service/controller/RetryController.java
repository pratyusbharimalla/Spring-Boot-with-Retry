/**
 * @File : RetryController.java
 *
 * @Author : Pratyus Kumar
 *
 * @Time : Jul 11, 2020 10:21:56 PM
 *
 */
package com.regency.spring.retry.service.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regency.spring.retry.service.service.RetryService;

/**
 * @author : Pratyus Kumar
 *
 */

@RestController
@RequestMapping(value="/retry")
public class RetryController {

    @Autowired
    private RetryService retryService;

    @GetMapping
    public String callRetryService() throws SQLException {
        return retryService.simpleRetry();
    }
    
}
