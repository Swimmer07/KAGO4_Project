package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {

    public Tree(double x, double y, double r){
    this.x = x;
    this.y = y;
    radius = r;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(106, 32, 0));
        drawTool.drawFilledRectangle(x,y,10,20);
        drawTool.setCurrentColor(new Color(0, 108, 1));
        drawTool.drawFilledCircle(x+5,y-10,11);
        drawTool.setCurrentColor(new Color(255, 0, 0));
        drawTool.drawFilledCircle(x+7,y-9,radius);
        drawTool.drawFilledCircle(x+8,y-8,radius);
        drawTool.drawFilledCircle(x+8,y-7,radius);
        drawTool.drawFilledCircle(x+9,y-8,radius);
        drawTool.drawFilledCircle(x+9,y-9,radius);
        drawTool.drawFilledCircle(x+2,y-8,radius);
        drawTool.drawFilledCircle(x+2,y-7,radius);
        drawTool.drawFilledCircle(x+9,y-6,radius);
        drawTool.drawFilledCircle(x+2,y-9,radius);
        drawTool.drawFilledCircle(x+2,y-10,radius);
    }
}
