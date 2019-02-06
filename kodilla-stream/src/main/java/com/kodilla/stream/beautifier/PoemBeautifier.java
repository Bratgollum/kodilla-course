package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator ){
        String afterChange;
        System.out.println("\nText before change : "+text);
        poemDecorator.decorate(text);
        afterChange = poemDecorator.decorate(text);

        System.out.println("Text after change : "+afterChange);


}
}
