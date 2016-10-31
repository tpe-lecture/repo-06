package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private double x;
    private double y;
    
 
    @Override
    public void up(double percentage) {
        y=y-percentage;
        
    }

    @Override
    public void down(double percentage) {
       y=y+percentage;
        
    }

    @Override
    public void left(double percentage) {
        x=x-percentage;
        
    }

    @Override
    public void right(double percentage) {
        x=x+percentage;
        
    }

    @Override
    public Point getPosition() {
        return new Point ((int)x, (int)y);
        
    }
    

}
