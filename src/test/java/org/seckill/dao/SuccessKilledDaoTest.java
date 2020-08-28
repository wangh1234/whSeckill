package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import javax.annotation.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void testInsertSuccessKilled() throws Exception{
        long id = 1000L;
        long pthone = 13502181181L;
        int insertCount = successKilledDao.insertSuccessKilled(id,pthone);
        System.out.println("insertCount=" + insertCount);

    }

    @Test
    public void testQueryByIdWithSeckill() throws Exception{
        long id = 1000L;
        long pthone = 13502181181L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id,pthone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}