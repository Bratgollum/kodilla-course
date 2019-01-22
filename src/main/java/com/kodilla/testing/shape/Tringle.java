package com.kodilla.testing.shape;

    public class Tringle implements Shape{
        private String nameOfFigure;
        private double sideASize;
        private double sideBSize;
        private double sideCSize;

        public Tringle(String nameOfFigure, double sideASize, double sideBSize, double sideCSize) {
            this.nameOfFigure = nameOfFigure;
            this.sideASize = sideASize;
            this.sideBSize = sideBSize;
            this.sideCSize = sideCSize;
        }

        @Override
        public String getShapeName() {
            return nameOfFigure;
        }

        @Override
        public double getField()
        {  double p ;
           p = (sideASize+sideBSize-sideCSize)/2;
           double s;
           s = (double) Math.sqrt(p*(p-sideASize)*(p-sideBSize)*(p-sideCSize));
            return s;
        }
    }
