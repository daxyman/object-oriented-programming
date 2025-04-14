package notes_25.src.main.java.excercises3;

import java.util.HashMap;

public class Exo6 {

    public static void main(String[] args) {
        Forme[] arrForme ={
            
        }
    }
}

enum Dimensions {
    BASE,
    HAUTEUR,
    RAYON
}

class Forme {

    HashMap<Dimensions, Double> dimensions;

    public void setDimensions(HashMap<Dimensions, Double> dimensions) {
        this.dimensions = dimensions;
    }

    public Forme(HashMap<Dimensions, Double> dimensions) {
        this.dimensions = dimensions;
    }

    public double getArea() {
        return 0;
    }
}

class Cercle extends Forme {

    public Cercle(HashMap<Dimensions, Double> dimensions) {
        super(dimensions);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(dimensions.get(Dimensions.RAYON), 2);
    }
}

class Triangle extends Forme {

    public Triangle(HashMap<Dimensions, Double> dimensions) {
        super(dimensions);
    }

    @Override
    public double getArea() {
        return (dimensions.get(Dimensions.BASE) * dimensions.get(Dimensions.HAUTEUR)) / 2;
    }
}

class Rectangle extends Forme {

    public Rectangle(HashMap<Dimensions, Double> dimensions) {
        super(dimensions);
    }

    @Override
    public double getArea() {
        return dimensions.get(Dimensions.BASE) * dimensions.get(Dimensions.HAUTEUR);
    }

}
