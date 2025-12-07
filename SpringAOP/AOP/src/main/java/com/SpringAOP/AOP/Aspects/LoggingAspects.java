package com.SpringAOP.AOP.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

    @Pointcut("execution(* com.SpringAOP.AOP.Service.PersonService.addPerson(..))") // the pointcut expression
    private void namedPointCut() {}

    //@Before("execution(* com.SpringAOP.AOP.Service.*.*(..))") - all the methods inside Service package will be intercepted
    //@Before("execution(* com.SpringAOP.AOP.Service.PersonService.*(..))") - all the methods inside PersonService will be intercepted
    //@Before("execution(* com.SpringAOP.AOP.Service.PersonService.addPerson(..))")
    @Before("namedPointCut()")
    public void log(){
       // System.out.println("--------Log1---------");
    }
    
    @Around("execution(* com.SpringAOP.AOP.Service.PersonService.addPerson(..))")
        public Object log1(ProceedingJoinPoint joinPoint) throws Throwable{
            System.out.println("--------Log2_Before_Method_Call---------");
            Object result=joinPoint.proceed();
            System.out.println("--------Log2_After_Method_Call---------");
            return result;
        }


    @Pointcut("within(com.SpringAOP.AOP.Service.PersonService)") // the pointcut expression
     private void withIn() {}

     @Before("withIn()")
     public void log2(){
        //System.out.println("--------Log2---------");
    }

    @Pointcut("@within(org.springframework.stereotype.Service)") // the pointcut expression
     private void withInAt() {}

     @Before("withInAt()")
     public void log3(){
       //System.out.println("--------Log3---------");
    }

    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void anotaion(){}

    @Before("anotaion()")
    public void log4(){
       System.out.println("--------Log4---------");
   }



    

}
