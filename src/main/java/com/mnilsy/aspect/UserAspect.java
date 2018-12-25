/*
package com.mnilsy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

*/
/**
 * Created by MNILSY on 2018/11/4.
 *//*

@Component
@Aspect
public class UserAspect {
    @Around(value = "execution(* com.mnilsy.pojo.UserBean.toString(..))")
    public void Test(ProceedingJoinPoint joinPoint){
        System.out.println("这里是之后");
        try {
            Object object=joinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("这里是错误");
            throwable.printStackTrace();
        }
        System.out.println("这里是之后");
    }
}
*/
