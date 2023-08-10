package com.bin.shop.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author 苏建锋
 * @create 2018-12-31 17:41
 */
public class ReflectionTddUtils {

    /**
     * 设置属性值
     * @param obj
     * @param fieldName
     * @param value
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void setFieldValue(Object obj, String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    /**
     * 访问私有方法
     * @param obj
     * @param funcName
     * @param parameterTypes
     * @param args
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static Object invoke(Object obj, String funcName, Class<?>[] parameterTypes, Object... args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Method insideMethod = clazz.getDeclaredMethod(funcName, parameterTypes);
        insideMethod.setAccessible(true);
        //访问私有方法
        Object value = insideMethod.invoke(obj, args);
        return value;
    }
}
