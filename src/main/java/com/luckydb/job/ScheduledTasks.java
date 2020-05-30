package com.luckydb.job;

import com.alibaba.fastjson.JSONObject;
import com.luckydb.model.entity.UserEntity;
import com.luckydb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yy-mm-dd HH:mm:ss");

    @Autowired
    private UserService userService;

    //    @Scheduled(fixedRate = 5000)
    @Scheduled(cron = "0 0/10 * * * ? ")
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));

        List<UserEntity> userlist = userService.getUserlist();
        log.info("返回的数据是: {}", JSONObject.toJSONString(userlist));

    }
}
