package com.project.db;

import com.project.db.entity.Message;
import com.project.db.service.MsgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumer {

    public static final Logger log = LoggerFactory.getLogger(RabbitConsumer.class);

    @Autowired
    private MsgService msgService;

    @RabbitListener(queues = {"${post.queue.name}"})
    public void receivedMsg(@Payload Message message){
        log.info("Objeto recibido--->>>>"+message);
        msgService.setMessage(message);
    }

    private void makeSlow(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
