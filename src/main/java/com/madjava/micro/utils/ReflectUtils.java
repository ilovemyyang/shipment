package com.madjava.micro.utils;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouyang
 */
public class ReflectUtils {

    /**
     * 尝试反射设置对象属性值
     *
     * @param field  属性
     * @param entity 对象
     * @param value  属性值
     */
    public static void changeFieldValue(Field field, Object entity, Object value) {
        try {
            field.setAccessible(true);
            field.set(entity, value);
            field.setAccessible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 反射获取对象指定的属性值
     *
     * @param field 属性
     * @param obj   对象
     * @return 属性值
     */
    public static Object getFieldValue(Field field, Object obj) {
        try {
            field.setAccessible(true);
            Object value = field.get(obj);
            field.setAccessible(false);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 递归获取包括父类属性在内的属性
     *
     * @param clz 类
     * @return 属性数组
     */
    public static Field[] getFieldsRecursively(Class<?> clz) {
        List<Field[]> fieldList = new ArrayList<>(5);
        fieldList.add(clz.getDeclaredFields());
        Class<?> superClass = clz.getSuperclass();
        while (superClass != null) {
            fieldList.add(superClass.getDeclaredFields());
            superClass = superClass.getSuperclass();
        }

        int sumLength = 0;
        for (Field[] fs : fieldList) {
            sumLength += fs.length;
        }

        Field[] fields = new Field[sumLength];
        int destPos = 0;
        for (Field[] fs : fieldList) {
            int fsLen = fs.length;
            System.arraycopy(fs, 0, fields, destPos, fsLen);
            destPos += fsLen;
        }
        return fields;
    }

    /**
     * 根据属性名递归获取指定属性
     *
     * @param clz       类
     * @param fieldName 属性名
     * @return 属性
     */
    public static Field getFieldRecursively(Class<?> clz, String fieldName) {
        Field result = null;
        Class<?> superClz = clz;
        while (result == null && superClz != null) {
            try {
                result = superClz.getDeclaredField(fieldName);
            } catch (Exception e) {
                superClz = superClz.getSuperclass();
            }
        }
        return result;
    }

    /**
     * 对象转换
     * 只转换双方都有的属性
     *
     * @param source    源对象
     * @param targetClz 目标类
     * @param <S>       源对象泛型
     * @param <R>       目标对象泛型
     * @return 转换后的结果
     */
    public static <S, R> R assign(S source, Class<R> targetClz) {
        ModelMapper mapper = new ModelMapper();
        //一种是在设置中，规定必须字段名完全匹配；另一种就是将匹配策略定义为严格
        mapper.getConfiguration().setFullTypeMatchingRequired(true);
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        //跳过空值已启用
//        mapper.getConfiguration().setAmbiguityIgnored(true);
        return mapper.map(source, targetClz);
    }
}
