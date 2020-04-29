3  阐述redirect和request dispatch的区别

redirect重定向，当客户端发来request请求，servlet无法处理，通过重定向，发送给客户端一个新的servlet路径，客户端接收后再次访问新的servlet，状态码为301，302.

dispatch转发，客户端发送request请求后，servlet处理一部分，把参数和request对象，response对象，转发给其他servlet或者JSP处理。


4  阐述redirect location的不同形式

重定向参数可以使资源文件URL，其他servlet，JSP
