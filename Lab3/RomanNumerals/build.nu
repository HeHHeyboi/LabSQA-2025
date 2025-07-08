javac -cp $env.JUNIT src/**/*.java -d bin/
java -jar $env.JUNIT execute --class-path bin --scan-classpath 
