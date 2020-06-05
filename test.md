
# Table of Contents

1.  [什么是DI？](#orgf142cc7)
2.  [在Spring中注入Bean有几种方式？你认为那种方式最好， 为什么？](#org5fdb94b)
3.  [BeanFactory和ApplicationContext之间的区别是什么？](#org513de46)
4.  [什么是Spring Bean？](#orgcb14a18)
5.  [如何定义Spring Bean的作用域？](#org78cf737)
6.  [Spring Bean的生命周期是怎样的？](#org575c7bd)
7.  [Spring Boot是什么？](#org74af3dc)
8.  [列举Spring Framework所使用的设计模式](#org1d7859a)
9.  [Bean Scope Prototype如何工作？](#org05d6de8)
10. [描述在Spring MVC模型下对于一次请求的完整工作流](#org1663bef)
11. [AOP的实现原理及其优点](#org821b839)


<a id="orgf142cc7"></a>

# 什么是DI？

 DI的意思就是依赖注入，在spring以前使用new关键字注入依赖，当一个类使用其他对象时必须使用new，程序间的耦合性很高，不利于维护和拓展，在spring中使用IOC控制反转，把注入依赖的工作从程序员转由spring控制，不再使用new，使得程序之间耦合性大大降低，只需要使用注解即可，非常有利于维护和拓展。


<a id="org5fdb94b"></a>

# 在Spring中注入Bean有几种方式？你认为那种方式最好， 为什么？

可以使用构造方式注入，set方法注入或者使用注解的方法注入Bean，我认为使用注解的方法最好，使用Spring Boot创建项目后，很好的简便了各种配置，在注入Bean的使用只需要使用@Controller,@Service,@Repository,@Bean等注解标注在类的上面，@Bean标注在方法的上面即可，不需要额外的配置，其他工作交于spring来完成，非常方便。


<a id="org513de46"></a>

# BeanFactory和ApplicationContext之间的区别是什么？

BeanFactory使用懒加载，在程序使用bean的使用才初始化，ApplicationContext在自己初始化的时候就把所用的bean初始化。BeanFactory不支持基于注解的依赖注入，而ApplicationContext支持。ApplicationContext是BeanFactory更进一步的拓展。


<a id="orgcb14a18"></a>

# 什么是Spring Bean？

bean是程序的主干，组件，交由spring管理，由spring初始化的类和对象都是spring bean。


<a id="org78cf737"></a>

# 如何定义Spring Bean的作用域？

有五种作用域，默认的是singloton，单例；Prototype，多例；Request，session，Golobo-session，后三种是spring用于web程序的时候，bean的作用域。


<a id="org575c7bd"></a>

# Spring Bean的生命周期是怎样的？

springBean的生命周期分为四个阶段，实例化，属性赋值，初始化和销毁。如果作用域是singloton，程序使用结束就会销毁。如果作用域是Prototype多例，生命周期几乎和存储bean的ApplicationContext生命周期一致。


<a id="org74af3dc"></a>

# Spring Boot是什么？

Spring boot是spring众多组件的集合简化版本，很方便的快速搭建一个项目，以及简单的配置，随着spring的组件越来越多，整合配置的复杂程序越来越高，让spring逐渐变重，因此官方推出spring boot


<a id="org1d7859a"></a>

# 列举Spring Framework所使用的设计模式

工厂模式，单例模式


<a id="org05d6de8"></a>

# Bean Scope Prototype如何工作？


<a id="org1663bef"></a>

# 描述在Spring MVC模型下对于一次请求的完整工作流

用户通过浏览器发送http请求到web service，再把URL和Request参数发送到前端控制器，前端控制器把URL和参数发送给存储所用Controller的信息区进行匹配，把URL和Request参数经过拦截器链发送给匹配到的Controller进行处理，如果需要查看数据库比对信息或者修改数据库数据，调用由spring管理的service层处理，返回的结果通过拦截器链返回给前端控制器，前端控制器发送给视图渲染器进行后端渲染，完成后再由前端控制器返回给web service；如果Controller发现是转发或者重定向请求，就直接把转发或者重定向地址发送到前端控制器，转由视图渲染器渲染。最后的结果通过web esrvice，浏览器接收并解析后展示。


<a id="org821b839"></a>

# AOP的实现原理及其优点

AOP是面向切面编程，原理就是通过静态代理或者动态代理，在不改变原来代码的情况下做一些操作，增加功能。可以添加一些不是核心逻辑的功能，不破坏原来的功能和代码，避免原来的功能出BUG。

