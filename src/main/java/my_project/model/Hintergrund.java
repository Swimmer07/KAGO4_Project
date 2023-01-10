package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Hintergrund extends GraphicalObject {

    public Hintergrund(){

    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(0, 200, 255));
        drawTool.drawFilledRectangle(0,0,900,900);
        drawTool.setCurrentColor(new Color(0, 255, 4));
        drawTool.drawFilledRectangle(0,300,900,900);
    }
}
