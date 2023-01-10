package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {

    public Cloud(double x, double y, double r) {
        this.x = x;
        this.y = y;
        radius = r;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(220, 220, 220));
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.drawFilledCircle(x + 20, y, radius);
        drawTool.drawFilledCircle(x + 40, y, radius);
        drawTool.drawFilledCircle(x + 10, y - 10, radius);
        drawTool.drawFilledCircle(x + 30, y - 10, radius);
    }

    public void update(double dt){
        x = x+80*dt;

        if (x > 800){
            x = -100;
        }
    }
}
