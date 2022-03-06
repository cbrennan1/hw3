# Colin Brennan
# CS445-HW3

-----------------------------------------------------------------------------------------------------------
The build can be automated by running the build.sh script.
```
sudo chmod 777 build.sh
./build.sh
```
-----------------------------------------------------------------------------------------------------------


1. Install java and gradle if not yet installed on your machine:

```
sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk

sudo snap install gradle --classic
gradle wrapper
```

2. CD into the project directory if not already inside it
```
cd hw3
```

3. Change the permissions for gradlew and the build script

```
sudo chmod +x gradlew
sudo chmod 777 build.sh
```

4. Build/Test/Run

```
./gradlew clean build
./gradlew test
./gradlew jacocoTestReport
./gradlew run
```

After the build has finished you can view the unit testing report that was created in build/reports/tests/test/index.html