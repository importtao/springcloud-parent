package me.importtao.user.esDao;

import me.importtao.user.model.PlanetUser1;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program spring-cloud-parent
 * @description:
 * @author: changhu
 * @create: 2019/11/12 16:53
 */
public interface PlanetUser1ESDao extends ElasticsearchRepository<PlanetUser1,String> {
}
