build:
	mvn package

run:
	java -cp target/finiteSateMachineChecker-1.0-SNAPSHOT.jar org.mykytaderhunov.Main

all:
	make build
	make run