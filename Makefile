SBT ?= java -Xmx2G -Xss8M -XX:MaxPermSize=256M -jar sbt-launch.jar

test:
	$(SBT) run

clean: 
	rm -f *.h *.cpp *.o
