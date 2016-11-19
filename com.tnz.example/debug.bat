@rem batch file for maven debugging
set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.7.0_45
set PATH=%JAVA_HOME%\bin;%PATH%
mvn clean install -Dmaven.surefire.debug
