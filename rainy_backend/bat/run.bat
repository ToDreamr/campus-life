@echo off
echo.
echo [信息] 使用Jar命令运行校园后台管理系统工程。
echo.

cd %~dp0

cd D:\JavaWork\school_life\rainy_backend\target

java -jar %JAVA_OPTS% rainy_backend-0.0.1-SNAPSHOT.jar

cd bin
pause