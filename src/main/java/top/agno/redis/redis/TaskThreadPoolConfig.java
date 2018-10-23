package top.agno.redis.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author kuangpeng
 * @ClassName: TaskThreadPoolConfig
 * @Description: TaskThreadPoolConfig
 * @date 2018年9月3日21:12:57
 */
@ConfigurationProperties(prefix = "spring.task.pool")
@Data
@Component
public class TaskThreadPoolConfig {
    private int corePoolSize;
    private int maxPoolSize;
    private int keepAliveSeconds;
    private int queueCapacity;
    private String threadNamePrefix;

    public TaskThreadPoolConfig() {
    }
}
