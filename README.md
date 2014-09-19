appCloneAttack_springFramework
==============================

spring framework

開發環境：
。JDK: 1.8.0_05
。Android SDK: v22.6.2-1085508
。Maven: 3.2.3，http://maven.apache.org/download.cgi
下載後Apache Maven後，unzip在gs-maven-android-master\initial\下

環境變數：
。JAVA_HOME: C:\Program Files\Java\jdk1.8.0_05
。CLASSPASS: .;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar
。Path: %JAVA_HOME%\bin;D:Android20140510\adt-bundle-windows-x86_64-20140321\sdk;C:\gs-maven-android-master\initial\apache-maven-3.2.3\bin

測試環境：
。Java -version
。mvn -v

成功訊息應如下：
C:\Users\Jane>mvn -v
Apache Maven 3.2.3 (33f8c3e1027c3ddde99d3cdebad2656a31e8fdf4; 2014-08-12T04:58:10+08:00)
Maven home: C:\gs-maven-android-master\initial\apache-maven-3.2.3\bin\..
Java version: 1.8.0_05, vendor: Oracle Corporation
Java home: C:\Program Files\Java\jdk1.8.0_05\jre
Default locale: zh_TW, platform encoding: MS950
OS name: "windows 7", version: "6.1", arch: "amd64", family: "dos"


建立第一個HelloWorld專案：

根
└── src
    └── main
        └── java
            └── org
                └── hello
                  └── HelloActivity.java
└── res
    └── values
        └── strings.xml
    └── layout
        └── hello_layout.xml
└── AndroidManifest.xml
└── pom.xml

編譯Android code：
。mvn compile
This command runs Maven, telling it to execute the compile goal. When it’s finished, you should find the compiled .class files in the target/classes directory.

。mvn package
The package goal compiles your Java code, runs any tests, and packages the code in a JAR file within the target directory. For example, given the minimal pom.xml file shown earlier, the JAR file will be named gs-maven-android-0.1.0.jar.
