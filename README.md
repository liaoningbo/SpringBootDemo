## 一、安装jenkins
jenkins卸载：
rpm -e jenkins
rpm -ql jenkins 
find / -iname jenkins | xargs -n 1000 rm -rf
jenkins安装
在linux宿主机上安装，jenkins只是一个构建工具，构建完项目之后，在使用dockerfile生成镜像，然后启动镜像，达到项目启动的效果
以下是jenkins的安装步骤：
sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key
yum -y install jenkins
修改端口号：
vi /etc/sysconfig/jenkins
