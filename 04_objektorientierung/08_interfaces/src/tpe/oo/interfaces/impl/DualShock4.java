package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController, DigitalController {

    private AnalogController analog = new AnalogControllerImpl();
    private DigitalController digital = new DigitalControllerImpl();
    
    @Override
    public void up() {
        digital.up();
       
    }

    @Override
    public void down() {
        digital.down();
        
    }

    @Override
    public void left() {
        digital.left();
        
    }

    @Override
    public void right() {
        digital.right();
        
    }

    @Override
    public void up(double percentage) {
        analog.up(percentage);
        
    }

    @Override
    public void down(double percentage) {
        analog.down(percentage);
        
    }

    @Override
    public void left(double percentage) {
        analog.left(percentage);
        
    }

    @Override
    public void right(double percentage) {
        analog.right(percentage);
        
    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub
        return new Point((int)(analog.getPosition().getX()+digital.getPosition().getX()),
                         ((int)(analog.getPosition().getY()+digital.getPosition().getY())));
    }

}
