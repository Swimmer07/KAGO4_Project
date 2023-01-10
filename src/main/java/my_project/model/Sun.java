package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {

    public Sun(double x, double y){
    this.x = x;
    this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(255, 198, 0));
        drawTool.drawFilledCircle(x,y,50);
        //drawTool.drawLine(x+70, y, x, 155);
        //drawTool.drawLine(x+90, y, x+50, y+40);
        //drawTool.drawLine(x+130, y, x+90, y+35);
    }
    public void update(double dt){
        x = x+50*dt;

        if(x>700){
            x=-100;
        }
    }
}
