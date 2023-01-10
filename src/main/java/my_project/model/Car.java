package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Car extends GraphicalObject {

    public Car(double x, double y){
    this.x = x;
    this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(224, 149, 0, 255));
        drawTool.drawFilledRectangle(x,y-1,28,20);
        drawTool.drawFilledRectangle(x,y+6,35,13);
        drawTool.setCurrentColor(new Color(0, 0, 0, 255));
        drawTool.drawFilledCircle(x+2,y+17,3);
        drawTool.drawFilledCircle(x+33,y+17,3);
        drawTool.setCurrentColor(new Color(0, 255, 251, 255));
        drawTool.drawFilledRectangle(x+3,y+1,22,8);
        drawTool.setCurrentColor(new Color(0, 0, 0, 255));
        drawTool.drawLine(x+14,y+1,x+14,y+8);
    }

    public void update(double dt){
        x = x+90*dt;

        if(x>700){
            x=-100;
        }
    }
}
