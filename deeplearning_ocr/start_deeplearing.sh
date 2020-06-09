docker run  -it -p 8888:8888 -p 6006:6006 -v /home/gaochuyang/ucas/deeplearing_docker/sharedfolder:/root/sharedfolder floydhub/dl-docker:cpu bash


#-p 后面表示主机和docker端口映射，-v表示文件夹目录共享

#nvidia-docker run -it -p 8888:8888 -p 6006:6006 -v /home/gaochuyang/ucas/deeplearing_docker/sharedfolder:/root/sharedfolder floydhub/dl-docker:gpu bash
#-e DISPLAY=$DISPLAY
####
#docker run  -it -p 8888:8888 -p 6006:6006 -v /home/gaochuyang/ucas/deeplearing_docker/sharedfolder:/root/sharedfolder -d -p 50001:22 floydhub/dl-docker:cpu /usr/sbin/sshd -D floydhub/dl-docker:cpu bash
####
