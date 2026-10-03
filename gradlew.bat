```bat
@echo off
setlocal

if exist "gradlew.jar" goto run
java -jar gradlew.jar %*
exit /b %errorlevel%
:run
call "%~dp0gradlew" %*
exit /b %errorlevel%
```
