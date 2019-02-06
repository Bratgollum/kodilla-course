package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;



public class StreamMain {
    public static void main(String[] args) {
       /* ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Exapmle number 1",(text) -> ("AAA " + text + " AAA"));
        poemBeautifier.beautify("Exapmle number 2",(text) -> ("******** " + text + "********"));
        poemBeautifier.beautify("Exapmle number 3",(text) -> (text.toUpperCase()));
        poemBeautifier.beautify("Exapmle number 4",(text) -> (text.toLowerCase()));
        poemBeautifier.beautify("Exapmle number 5",(text) -> (text = "E X A M P L E number 5"));
        poemBeautifier.beautify("Exapmle number 5",(text) -> (text + " "+ text));
        poemBeautifier.beautify("Exapmle number 5",(text) -> { int a = 0;
                                                                    while( a < 3) {
                                                                        text +="///"+ text ;
                                                                        a++;
                                                                    }
                                                                   return text;
       });




    }
}