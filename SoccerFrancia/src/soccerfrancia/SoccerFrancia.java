/*
RIP
 */

package soccerfrancia;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Hector
 * @author Mauro
 * @author Lucas
 * @author William 
 */


public class SoccerFrancia extends Application {
    // olvidense de esta parte por ahora, esto es java fx
    @Override
   
    public void start(Stage primaryStage) {
        // aqui empieza el programa
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction
        (new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            } }
        );
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // esto corre el metodo start
        
        // cualquier cosa aqui lo hace despues de correr el metodo start
        int s = 4;
        equipo madrid = new equipo(1);
        madrid.temp();
    } 
}


// clase juego
class juego {
    int kk;
    
    public juego(int id) {
        kk=id;
        
        
        
    }
    public void temp() {
        System.out.println(kk);
    }
}


// clase player
class player {
    // declaracion de variables iniciales
    
    /*
    * Skill 1 = skill offensivo
    * Skill 2 = skill dribleo 
    * Skill 3 = skill defensivo
    * Skill 4 = skill desicion
    * Skill 5 = skill portero  
    */
    
    
    int id;
    String nombre;
    String posicion;
    int skill1; int skill2; int skill3; int skill4; int skill5;
    boolean HasBall;
    int FaltasLeve; int TarjetaAmarilla;
    boolean FaltaGrave;  // si tiene falta grave es lo mismo que tarjeta roja y es out, no hay mas de una por lo que puede ser bool
    boolean EstaHerido;
    
    public player (int pid, String pnombre, String pposicion, int pskill1, int pskill2, int pskill3, int pskill4, int pskill5 ) {
        // aqui se setean los valores iniciales, es el constructor
        id=pid;
        posicion = pposicion;
        skill1 = pskill1;
        skill2= pskill2;
        skill3 = pskill3;
        skill4 = pskill4;
        skill5 = pskill5;
            
    }
    
    public void temp() {
        System.out.println(id);
    }
    
    
}


//clase equipo con 20 instancia de clase player
class equipo {
    int kk;
    List<player> jugadores = new ArrayList(); // lista de 20 jugadores
    
    public equipo (int id) {
        kk=id;
    }
    
    public void temp() {
        System.out.println();
    }
    
    public void start() {
     setplayers();  
    }
    
    public void setplayers() {
        // asi se crean jugadores nuevos dentro del equipo 
        jugadores.add(new player(1,"ronaldoElDios","delantero",100,50,0,100,0));
        jugadores.add(new player(2,"lucas","noC",50,30,20,-5,0));
        
    }
    
}



// clase info
class informacion {
    int kk;
    
    public informacion (int id) {
        kk=id;
 
    }
    
    public void temp() {
        System.out.println(kk);
        
    }
}
