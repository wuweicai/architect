package com.ysx.architect.test.quarts.multi;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Component;

@Component
public class WelcomeJob implements Job {
    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        //你的业务逻辑
    }
}