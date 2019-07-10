rm */*/*.class */*/*/*.class
rm sources.txt
find * -name "*.java" > sources.txt
javac @sources.txt