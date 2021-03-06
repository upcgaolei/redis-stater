package star.xiaolei.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 周高磊
 * Date: 2017/5/2.
 * Email: gaoleizhou@gmail.com
 * Desc: 属性信息
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    //host
    private String host;

    //端口号,默认6379
    private int port = 6379;

    //认证
    private String auth;

    //最大连接数
    private int maxTotal = 5;

    //最大空闲连接
    private int maxIdle = 0;

    //获取连接时最大等待毫秒数
    private int maxWaitMillis = 10000;

    //在获取连接的时候是否检查有效性
    private boolean testOnBorrow = true;

    //是否开启集群模式,默认关闭
    private boolean cluster = false;

    //Sentinel Instance 列表
    private String SentinelHosts;

    //Sentinel Master Name
    private String SentinelMasterName;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMaxWaitMillis() {
        return maxWaitMillis;
    }

    public void setMaxWaitMillis(int maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isCluster() {
        return cluster;
    }

    public void setCluster(boolean cluster) {
        this.cluster = cluster;
    }

    public String getSentinelHosts() {
        return SentinelHosts;
    }

    public void setSentinelHosts(String sentinelHosts) {
        SentinelHosts = sentinelHosts;
    }

    public String getSentinelMasterName() {
        return SentinelMasterName;
    }

    public void setSentinelMasterName(String sentinelMasterName) {
        SentinelMasterName = sentinelMasterName;
    }
}
