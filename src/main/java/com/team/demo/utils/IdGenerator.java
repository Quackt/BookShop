package com.team.demo.utils;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.ObjectId;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.security.SecureRandom;

/**
 * @program bookshop
 * @author lwy
 * @description Id生成器
 * @date 2020/03/20
 */

@Service
@Lazy(false)
public class IdGenerator {
    private long workerId = 0;
    private static SecureRandom random = new SecureRandom();

    /**
     * 生成18位有顺序数字id
     * */
    private static SnowFlake idWorker = new SnowFlake(0, 0);
    public static String getLongNextId() {
        String id = String.valueOf(idWorker.nextId());
        //System.out.println(id);
        return id;
    }

    /**
     * 获取一个批次号，形如 2019071015301361000101237
     * <p>
     * 数据库使用 char(25) 存储
     *
     * @param tenantId 租户ID，5 位
     * @param module   业务模块ID，2 位
     * @return 返回批次号
     */
    public synchronized String batchId(int tenantId, int module) {
        String prefix = DateTime.now().toString(DatePattern.PURE_DATETIME_MS_PATTERN);
        return prefix + tenantId + module + RandomUtil.randomNumbers(3);
    }

    @Deprecated
    public synchronized String getBatchId(int tenantId, int module) {
        return batchId(tenantId, module);
    }

    /**
     * 生成的是不带-的字符串，类似于：b17f24ff026d40949c85a24f4f375d42
     *
     * @return
     */
    public String simpleUUID() {
        return IdUtil.simpleUUID();
    }

    /**
     * 生成的UUID是带-的字符串，类似于：a5c8a5e8-df2b-4706-bea4-08d0939410e3
     *
     * @return
     */
    public String randomUUID() {
        return IdUtil.randomUUID();
    }

    private Snowflake snowflake = IdUtil.createSnowflake(workerId, 1);

    public synchronized long snowflakeId() {
        return snowflake.nextId();
    }

    public synchronized long snowflakeId(long workerId, long dataCenterId) {
        Snowflake snowflake = IdUtil.createSnowflake(workerId, dataCenterId);
        return snowflake.nextId();
    }

    /**
     * 生成类似：5b9e306a4df4f8c54a39fb0c
     * <p>
     * ObjectId 是 MongoDB 数据库的一种唯一 ID 生成策略，
     * 是 UUID version1 的变种，详细介绍可见：服务化框架－分布式 Unique ID 的生成方法一览。
     *
     * @return
     */
    public String objectId() {
        return ObjectId.next();
    }


    public static void main(String[] args) {
        System.out.println(IdGenerator.getLongNextId());
        System.out.println(IdGenerator.getLongNextId().length());

    }
}