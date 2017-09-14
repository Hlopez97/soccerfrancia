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
import java.util.concurrent.ThreadLocalRandom;
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
    public void action(equipo pel, equipo nopel)  {
         String posicion = "";
        player PlayerConPelota = pel.hasball();
        if (PlayerConPelota == null)
        {
            player PlayerAccion = nopel.hasball();
            posicion = PlayerAccion.posicion;
        }
        else 
        {
            posicion = PlayerConPelota.posicion;
        }
        
        boolean HasBall = PlayerConPelota.HasBall;
        int act = 0;
        
        
        if (posicion.equals("delantero"))  { act = 1; }
        if (posicion.equals("centro"))  { act = 2; }
        if (posicion.equals("defensa"))  { act = 3; }
        if (posicion.equals("portero"))  { act = 4; }
        // si tiene la pelota
        if (HasBall) {     
            switch(act) {
                case 1:
                    // probabilidad de que tire
                    if (probabilidad(8))
                    {
                        //tiro
                        // probabilidad de gol (incompleto)
                        if (probabilidad(7))
                        {
                            
                        }
                        
                        
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }                  
        }     
        // sino tiene la pelota
        else {        
            switch(act) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }   
        }
        
        
    }
    public boolean probabilidad(int porcentaje) {
    int randomNum = ThreadLocalRandom.current().nextInt(0,10); // es de 0 a 9 incluyendo 9
        // 0 1 2 3 4 5 6 7 8 9 || hay 10 numeros
    if (randomNum < porcentaje)
    {
        return true;
    }
    else {return false;}
    } // completo
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
    int skilloff; int skilldri; int skilldef; int skilldes; int skillpor;
    boolean HasBall = false; // false hasta que empieza el juego
    int FaltasLeve; int TarjetaAmarilla;
    boolean FaltaGrave;  // si tiene falta grave es lo mismo que tarjeta roja y es out, no hay mas de una por lo que puede ser bool
    boolean EstaHerido;
    boolean PlayerAccion = false;
    
    public player (int pid, String pnombre, String pposicion, int pskilloff, int pskilldri, int pskilldef, int pskilldes, int pskillpor) {
        // aqui se setean los valores iniciales, es el constructor
        id=pid;
        posicion = pposicion;
        skilloff = pskilloff;
        skilldri= pskilldri;
        skilldef = pskilldef;
        skilldes = pskilldes;
        skillpor = pskillpor;
        
            
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
        jugadores.add(new player(2,"mauro","noC",0,0,0,0,0));
        
    }
    public player hasball() {
        return null;
    } 
    // me va a retorna que jugador del equipo (o la lista de arriba) tiene la pelota
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
