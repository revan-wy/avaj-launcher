rm */*/*/*.class */*/*/*/*.class
rm sources.txt
rm simulation.txt
find * -name "*.java" > sources.txt
javac @sources.txt