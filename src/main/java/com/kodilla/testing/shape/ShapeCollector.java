package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figure = new ArrayList<Shape>();

    public void addFigure(Shape shape ){
       figure.add(shape);
    }
    public boolean removeFigure(Shape shape ){
        boolean result = false;
        if(figure.contains(shape)){
            figure.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int figureNumber ){
        Shape shape = null;
        if(figureNumber >= 0 && figureNumber< figure.size()){
            shape = figure.get(figureNumber);
        }
        return shape;
    }
    public ArrayList<Shape> showFigures(){
        ///nothing yet    napisac metode wypisujaca liste figure
        for(Shape figuresList : figure){
            System.out.println("Figure name: "+figuresList.getShapeName()+
                               "\nFigure field: "+ figuresList.getField());        }
    return figure;
    }
    public int getFigureQuantity(){

        return figure.size();
    }


}
