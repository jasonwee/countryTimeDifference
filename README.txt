timezone diff
https://www.mkyong.com/java/java-convert-date-and-time-between-timezone/
https://stackoverflow.com/questions/15788913/java-calculating-time-zone-difference


gradle
https://stackoverflow.com/questions/14017364/how-to-create-java-gradle-project
https://www.mkyong.com/gradle/gradle-create-java-project-structure-automatically/
https://spring.io/guides/gs/gradle/
https://steffenschaefer.github.io/gwt-gradle-plugin/doc/latest/eclipse

export JAVA_HOME=/usr/lib/jvm/jdk1.8.0_74/
gradle init --type java-library
gradle eclipse



javafx
https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm

https://docs.oracle.com/javafx/2/overview/jfxpub-overview.htm
https://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-overview.htm
http://www.tutorialspoint.com/javafx/
http://www.javafxtutorials.com/whatisjavafx/
https://java.com/en/download/faq/javafx.xml

how to package
gradle build
/usr/lib/jvm/jdk1.8.0_74/bin/javapackager -createjar -appclass net.opentracker.app.TimeDiffApp -srcdir build/classes/main/ -outdir build -outfile  TimeDiffApp.jar -v
/usr/lib/jvm/jdk1.8.0_74/bin/java -jar build/TimeDiffApp.jar
/usr/lib/jvm/jdk1.8.0_74/bin/javapackager -deploy  -native deb -BsystemWide=true -Bruntime=/usr/lib/jvm/jdk1.8.0_74/jre/  -BjvmOptions=-Xmx8m  -BjvmOptions=-Xms8m  -outdir build  -outfile TimeDiffApp  -srcdir build/ -srcfiles TimeDiffApp.jar  -appclass net.opentracker.app.TimeDiffApp   -name TimeDiffApp -v

how to run after package
sr/lib/jvm/jdk1.8.0_74/bin/java -jar build/helloworld.jar



https://www.tutorialspoint.com/javafx/javafx_quick_guide.htm
https://www.travelmath.com/time-change/from/Kuala+Lumpur,+Malaysia/to/Amsterdam,+Netherlands
https://www.happyzebra.com/timezones-worldclock/Malaysia-and-Netherlands.php
https://docs.oracle.com/javase/8/javase-clienttechnologies.htm
https://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-architecture.htm#JFXST788
https://docs.oracle.com/javase/8/docs/technotes/guides/deploy/
https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/charts.htm#JFXUI577
https://docs.oracle.com/javase/8/javafx/collections-tutorial/collections.htm#JFXCL107
https://docs.oracle.com/javase/8/javafx/interoperability-tutorial/concurrency.htm#JFXIP546


malaysia            -> netherland
2017-11-08 21:51:33 -> 2017-11-08 15:51:33 
