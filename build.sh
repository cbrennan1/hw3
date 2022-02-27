#!/bin/bash

sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk


sudo snap install gradle --classic
gradle wrapper
sudo chmod +x gradlew
./gradlew clean build
./gradlew test
./gradlew jacocoTestReport