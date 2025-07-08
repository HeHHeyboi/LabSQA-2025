javac -cp $env.JUNIT src/**/*.java -d bin/
java -jar $env.JUNIT bin/**/*.class execute --scan-classpath 
