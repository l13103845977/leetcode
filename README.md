# leetcode
学习文档

docker 菜鸟教程https://www.runoob.com/docker/docker-architecture.html

docker包括镜像(image),容器(contains),仓库(repository)

docker常用命令
    启动docker systemctl start docker 
      开机自启 systemctl enable docker
      关闭docker systemctl stop docker
      进入容器 docker exec
  docker安装    
 yum install -y docker 
 配置docker加速器 curl -sSL https://get.daocloud.io/daotools/set_mirror.sh | sh -s http://f1361db2.m.daocloud.io
 docker开启远程服务 修改docker宿主机文件/lib/systemd/system/docker.service
                   修改Execstart开头，centos7改为ExecStart=/usr/bin/dockerd -H tcp://0.0.0.0:2375 -H unix://var/run/docker.sock
                     docker重新读取配置文件 systemctl daemon-reload
      docker 启动失败 参考https://blog.csdn.net/zhangbeizhen18/article/details/85239758
       idea使用docekr main下创建一个docker文件夹，创建Dockerfile文件，
         
       docker run  -p 192.168.6.128:9999:9999 -d leetcode
       -d 后台运行 -p 宿主机ip:端口(开放):端口(启动)
      
    