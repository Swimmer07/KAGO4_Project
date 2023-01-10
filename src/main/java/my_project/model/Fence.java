package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Fence extends GraphicalObject {

    public Fence(double x, double y){
    this.x = x;
    this.y= y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(74, 0, 106));
        drawTool.drawFilledRectangle(x,y,6,10);
        drawTool.drawFilledTriangle(x,y,x+6,y,x+3,y-3);
        drawTool.drawFilledRectangle(x,y+3,10,3);
    }
}