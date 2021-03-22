@echo off
call mvn clean package
call docker build -t br.edu.unipam/AppTodo .
call docker rm -f AppTodo
call docker run -d -p 9080:9080 -p 9443:9443 --name AppTodo br.edu.unipam/AppTodo