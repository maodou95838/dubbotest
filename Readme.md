# 说明：
主要演示dubbo远程调用，其中，使用zookeeper作为注册中心。

# zookeeper环境
使用docker。启动命令如下
```shell
$ docker run -p 8080:8080 -p 2181:2181 --name some-zookeeper --restart always -d zookeeper

```
zookeeper的端口要映射出来，否则外部无法访问到。