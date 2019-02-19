package me.importtao.user.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.apache.commons.lang3.ClassUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.ReflectionUtils;

import javax.activation.DataSource;
import java.util.HashSet;
import java.util.Set;

@Configuration
@MapperScan("me.importtao.user.dao")
public class MybatisPlusConfig {
    /*
     * 分页插件，自动识别数据库类型
     * 多租户，请参考官网【插件扩展】
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


   /*
    * oracle数据库配置JdbcTypeForNull
    * 参考：https://gitee.com/baomidou/mybatisplus-boot-starter/issues/IHS8X
    不需要这样配置了，参考 yml:
    mybatis-plus:
      confuguration
        dbc-type-for-null: 'null'
   @Bean
   public ConfigurationCustomizer configurationCustomizer(){
       return new MybatisPlusCustomizers();
   }

   class MybatisPlusCustomizers implements ConfigurationCustomizer {

       @Override
       public void customize(org.apache.ibatis.session.Configuration configuration) {
           configuration.setJdbcTypeForNull(JdbcType.NULL);
       }
   }
   */
    /**
     * 性能分析拦截器，不建议生产使用
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor(){
        return new PerformanceInterceptor();
    }
    @Bean
    public ConversionService conversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        Set<Converter> converters = new HashSet<>();
        converters.add(new String2SqlInjectorConverter());
        bean.setConverters(converters);
        bean.afterPropertiesSet();
        return bean.getObject();
    }

    /**
     *  将String 转成 ISqlInjector 实例
     */
    public class String2SqlInjectorConverter implements Converter<String, ISqlInjector> {
        @Override
        public ISqlInjector convert(String s) {
            if(StringUtils.isEmpty(s))
                return null;

            try {
                Class clazz = ClassUtils.getClass(s);
                ISqlInjector sqlInjector = (ISqlInjector)clazz.newInstance();
                return sqlInjector;
            } catch (ClassNotFoundException|IllegalAccessException|InstantiationException e) {
                ReflectionUtils.rethrowRuntimeException(e);
            }

            return null;
        }
    }
}