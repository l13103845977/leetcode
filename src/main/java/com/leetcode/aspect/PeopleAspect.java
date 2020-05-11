package com.leetcode.aspect;

import com.leetcode.domain.People;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.Period;

@Aspect
@Component
public class PeopleAspect {

    @Pointcut("execution(* com.leetcode.controller.PeopleController.selectPeopleByName(..))")
    public  void  cutSelectPeopleByName(){
        System.out.println("执行了aop");
    };

    @AfterReturning(value = "cutSelectPeopleByName()",returning = "returnValue")
    public void setAge(JoinPoint joinPoint,People returnValue){
        System.out.println("目标方法名为:" + joinPoint.getSignature().getName());
        System.out.println("目标方法所属类的简单类名:" +        joinPoint.getSignature().getDeclaringType().getSimpleName());
        System.out.println("目标方法所属类的类名:" + joinPoint.getSignature().getDeclaringTypeName());
     ;

        try {
            returnValue.setAge(returnValue.getAge());
        }catch (Exception e){

                throw new RuntimeException("用户不存在");

        }
    }
}
