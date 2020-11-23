package onjava.atunit;

import java.lang.annotation.*;

// 用元注解定义注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // 注解信息保存时长
@Documented
@Inherited
@Repeatable(Tests.class)
public @interface Test {
    // 不含元素则为标记注解
    // 注解元素只能是 基本类型 String Class enum Annotation 以上类型的数组
    // 元素要么有默认值 要么使用时提供，非基本类型不能为null，使用特殊值表示不存在
    String value() default "test";
}

