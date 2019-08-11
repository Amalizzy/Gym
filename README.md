# GymArray

Docker commands

docker ps - list running containers

docker ps -a - list all containters running and stoped

docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=cat26dana -d mysql:latest - download image
for mysql if there is no image and create a new instance of mysql with name mysql

docker start mysql - start container with name mysql

docker stop mysql - stop cpntainer name mysql

docker rm mysql - delete container