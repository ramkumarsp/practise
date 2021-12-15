package com.learning.java.interview.jio;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MatchingParanthesis {
    public static void main(String[] args) {
        List<Character> paranthesisList = Arrays.asList('{', '[', ']', '{', '(', ')', '}', '}');

        Stack<Character> characterStack = new Stack<Character>();

        for (int i = 0; i < paranthesisList.size(); i++) {
            Character paranthesis = paranthesisList.get(i);
            if (paranthesis.equals('{') || paranthesis.equals('[') || paranthesis.equals('(')) {
                characterStack.push(paranthesis);
            } else {
                Character matcher = characterStack.peek();
                if ((matcher.equals('(') && paranthesis.equals(')')) || (matcher.equals('[') && paranthesis.equals(']')) || (matcher.equals('{') && paranthesis.equals('}'))) {
                    characterStack.pop();
                } else {
                    System.out.println("incorrect");
                    return;
                }
            }
            if(i == paranthesisList.size() - 1) {
                System.out.println("correct");
            }
        }
    }
}
