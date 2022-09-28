package org.mykytaderhunov;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static FiniteStateMachine Read(String filePath) {
        FiniteStateMachine finiteStateMachine = new FiniteStateMachine();

        Scanner scanner;

        try {
            scanner = new Scanner(Path.of(filePath));
        } catch (IOException e) {
            System.out.println("File not found");

            return null;
        }

        int symbolsNum = scanner.nextInt();
        finiteStateMachine.setSymbolsNum(symbolsNum);
        int statesNum = scanner.nextInt();
        finiteStateMachine.setStatesNum(statesNum);
        finiteStateMachine.setStartState(scanner.nextInt());

        int finalStatesNum = scanner.nextInt();
        List<Integer> finalStates = new ArrayList<>();

        for (int i = 0; i < finalStatesNum; i++) {
            finalStates.add(scanner.nextInt());
        }

        finiteStateMachine.setFinalStates(finalStates);

        for (int i = 0; i < statesNum; i++) {
            int from = scanner.nextInt();
            char letter = scanner.next().charAt(0);
            int to = scanner.nextInt();

            Transition transition = new Transition(to, letter);

            finiteStateMachine.addTransition(transition, from);

            finiteStateMachine.addGraphEnd(from, to);
        }

        return finiteStateMachine;
    }
}
