package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Queue;
import my_project.model.*;
import my_project.view.InputManager;

import java.awt.event.MouseEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        // Ball ball = new Ball();
        // viewController.draw(ball1);

        Hintergrund hintergrund = new Hintergrund();
        viewController.draw(hintergrund);

        House h1 = new House(200, 200);
        viewController.draw(h1);

        House h2 = new House(270,200);
        viewController.draw(h2);

        House h3 = new House(340,200);
        viewController.draw(h3);

        House h4 = new House(410,200);
        viewController.draw(h4);

        House h5 = new House(480,200);
        viewController.draw(h5);

        Sun sun = new Sun(400,110);
        viewController.draw(sun);

        Tree t1 = new Tree(400,280,2);
        viewController.draw(t1);

        Tree t2 = new Tree(300,280,2);
        viewController.draw(t2);

        Tree t3 = new Tree(500,280,2);
        viewController.draw(t3);

        Tree t4 = new Tree(50,280,2);
        viewController.draw(t4);

        Tree t5 = new Tree(100,280,2);
        viewController.draw(t5);

        Cloud c1 = new Cloud(70,90,20);
        viewController.draw(c1);

        Cloud c2 = new Cloud(170,90,20);
        viewController.draw(c2);

        Cloud c3 = new Cloud(270,90,20);
        viewController.draw(c3);

        Cloud c4 = new Cloud(370,90,20);
        viewController.draw(c4);

        Cloud c5 = new Cloud(470,90,20);
        viewController.draw(c5);

        Fence f1 = new Fence(150,290);
        viewController.draw(f1);

        Fence f2 = new Fence(160,290);
        viewController.draw(f2);

        Fence f3 = new Fence(170,290);
        viewController.draw(f3);

        Fence f4 = new Fence(180,290);
        viewController.draw(f4);

        Fence f5 = new Fence(190,290);
        viewController.draw(f5);

        Car q1 = new Car(450,280);
        viewController.draw(q1);

        Car q2 = new Car(65,280);
        viewController.draw(q2);

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
