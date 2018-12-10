package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;



/**
 * 将配置文件中的配置的每一个属性的值 映射到这个组件在
 * @ConfigurationProperties 告诉springboot将本类中的所有的属性和配置文件中的有关的配置进行绑定
 * prefix = "person" 配置文件中的哪一个下面的所有属性进行映射
 *
 * 只有这个组件是容器中的组件 才能提供@ConfigurationProperties 的值
 *
 *@ConfigurationProperties(prefix = "person")默认从全局配置文件中获取
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//数据校验
@Validated
public class Person {

    /**
     * 使用@Value注解 从字面量/${key}#{SpEL}等语法中获取
     */
//    @Value("${person.last-name}")
            //lastName必须是邮件地址
//    @Email
    private String lastName;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
