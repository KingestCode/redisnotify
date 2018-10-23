package top.agno.redis.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

/**
 * @author kuangpeng
 * @ClassName: TopicMessageListener
 * @Description: TopicMessageListener
 * @date 2018年9月3日21:13:09
 */
@Component
public class TopicMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] bytes) {
        // 请使用valueSerializer
        byte[] body = message.getBody();
        byte[] channel = message.getChannel();
        //String topic = new String(channel);
        String expireKey = new String(body);
    }


}
