package cn.itedus.lottery.test.dao;

import cn.itedus.lottery.infrastructure.dao.IActivityDao;
import cn.itedus.lottery.infrastructure.po.Activity;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author：cheese，微信：
 * @date: 2024-01-24
 * @Copyright： 公众号：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityDaoTest {
    private Logger logger = LoggerFactory.getLogger(ActivityDaoTest.class);
    @Resource
    private IActivityDao activityDao;

    @Test
    public void test_queryActivityById() {
        Activity activity = activityDao.queryActivityById(100001L);
        logger.info("测试结果：{}", JSON.toJSONString(activity));
    }
}
