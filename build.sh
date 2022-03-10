#!/bin/bash

sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk


sudo snap install gradle --classic
gradle wrapper
./gradle clean build
./gradle test
./gradle jacocoTestReport
./gradle run
