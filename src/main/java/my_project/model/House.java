package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {

    public House(double x, double y){
    this.x = x;
    this.y = y;

    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(135, 58, 0));
        drawTool.drawFilledRectangle(x,y,50,100);
        drawTool.setCurrentColor(new Color(0,0,0,107));
        drawTool.drawFilledRectangle(x+5,y-35,10,30);
        drawTool.setCurrentColor(new Color(255, 0, 0));
        drawTool.drawFilledTriangle(x,y,x+50,y,x+25,y-50);
        drawTool.setCurrentColor(new Color(1,1,1));
        drawTool.drawTriangle(x,y,x+50,y,x+25,y-50);
        drawTool.setCurrentColor(new Color(1,1,1));
        drawTool.drawFilledRectangle(x+20, y+80, 10, 20);
        drawTool.setCurrentColor(new Color(0, 0, 0, 107));
        drawTool.drawFilledRectangle(x+10, y+20, 10, 10);
        drawTool.drawFilledRectangle(x+30, y+20, 10, 10);
        drawTool.setCurrentColor(new Color(1,1,1));
        drawTool.drawRectangle(x+10, y+20, 10, 10);
        drawTool.drawRectangle(x+30, y+20, 10, 10);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawFilledRectangle(x+11, y+24, 9, 3);
        drawTool.drawFilledRectangle(x+14, y+20, 3, 10);
        drawTool.drawFilledRectangle(x+31, y+24, 9, 3);
        drawTool.drawFilledRectangle(x+34, y+20, 3, 10);
        drawTool.setCurrentColor(new Color(255, 198, 0));
        drawTool.drawFilledCircle(x+22,y+90,1);

    }
}
