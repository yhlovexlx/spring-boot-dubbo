# 项目结构

|模块          |功能                                                |
|:----         |:-----                                              |
|dubbo-bean    |底层实体bean封装                                    |
|dubbo-dao     |这个模块主要是数据持久化层，主要用来操作数据库      |
|dubbo-api     |这个模块主要提供API服务，里面都是接口               |
|dubbo-service |这个模块通过暴露服务，并对外提供服务                |
|dubbo-web     |这个模块对外提供HTTP接口，并调用dubbo服务           |

# 项目部署和启动
* 安装zookeeper，拷贝并修改zoo.cfg，最后启动
* 运行dubbo-service下的Bootstrap.java文件启动dubbo服务
* 部署dubbo-web在tomcat服务器上并启动。
