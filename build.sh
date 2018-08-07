#!/usr/bin/env bash
cd Exam1/
mvn clean package
cp target/Exam1-0.0.1-SNAPSHOT.jar ../docker/java/app.jar
cd ..
docker-compose build