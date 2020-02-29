package me.importtao.test;

import lombok.extern.slf4j.Slf4j;
import me.importtao.BaseTest;
import me.importtao.user.esDao.PlanetUser1ESDao;
import me.importtao.user.model.PlanetUser1;
import me.importtao.user.util.ESEntity;
//import me.importtao.user.util.ESUtil;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

/**
 * @program spring-cloud-parent
 * @description:
 * @author: changhu
 * @create: 2019/11/14 11:35
 */
@Slf4j
public class EsTest extends BaseTest {
    @Autowired
    //ESUtil esUtil;
            PlanetUser1ESDao planetUser1ESDao;


    @Test
    public void test(){
        //List<PlanetUser1> list = esUtil.search(ESUtil.INDEX_NAME, new SearchSourceBuilder(), PlanetUser1.class);
        Iterable<PlanetUser1> planetUser1Iterable = planetUser1ESDao.findAll();
        planetUser1Iterable.forEach(planetUser1 -> {
            System.out.println(planetUser1.getUserId()+"-"+planetUser1.getNickName());
        });
        System.out.println();
    }

    @Test
    public void test1(){
        PlanetUser1 planetUser1 = new PlanetUser1();
        String uuid = UUID.randomUUID().toString();
        planetUser1.setUserId(uuid);
        planetUser1.setNickName("test");
        //ESEntity<PlanetUser1> entity = new ESEntity<>(planetUser1.getUserId(), planetUser1);
        //esUtil.insertOrUpdateOne(ESUtil.INDEX_NAME, entity);    }
        planetUser1ESDao.save(planetUser1);
    }
}
