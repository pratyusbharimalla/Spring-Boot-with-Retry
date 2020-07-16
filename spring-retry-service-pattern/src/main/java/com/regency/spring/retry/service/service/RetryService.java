/**
 * @File : RetryService.java
 *
 * @Author : Pratyus Kumar
 *
 * @Time : Jul 11, 2020 10:22:56 PM
 *
 */
package com.regency.spring.retry.service.service;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import static com.regency.spring.retry.service.constant.RetryConstant.RETRY_TIMES;
/**
 * @author : Pratyus Kumar
 *
 */

@Service
public class RetryService {
    
	private static final Logger LOGGER = LoggerFactory.getLogger(RetryService.class);

    int counter =0;

    @Retryable(value = { SQLException.class }, maxAttempts = RETRY_TIMES)
    public String simpleRetry() throws SQLException {
        counter++;
        LOGGER.info("Retry Service Failed "+ counter);
        throw new SQLException();
    }

    @Recover
    public String recover(SQLException t) throws InterruptedException{
    	TimeUnit.SECONDS.sleep(30);
        LOGGER.info("Retry Service recovering");
        return "Service recovered from retry service failure.";
    }
}
