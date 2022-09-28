
# Finite State Machine Checker

This application is used to check whether the w1w0 word can reach the final state where w0 is given and w1 is a word that can reach the final state by itself.


## Run Locally (WHY??? This is a Java application with zero use cases!)

Clone the project

```bash
  git clone https://github.com/nndergunov/finiteStateMachineChecker
```

Go to the project directory

```bash
  cd finiteStateMachineChecker
```

Compile Java (using Maven)

```bash
  make build
```

OR

```bash
  mvn package
```

Edit ```finite-state-machine.txt``` file and then run the application

```bash
  make run
```

OR

```bash
  java -cp target/finiteSateMachineChecker-1.0-SNAPSHOT.jar org.mykytaderhunov.Main
```

It is also possible to create any new file and provide relative path to it as a path argument

```bash
  java -cp target/finiteSateMachineChecker-1.0-SNAPSHOT.jar org.mykytaderhunov.Main -Dexec.args="path/to/your/file/here/file.txt"
```