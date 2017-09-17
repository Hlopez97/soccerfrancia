/*
RIP
 */

package soccerfrancia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
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
 * @author Hector Lopez
 * @author Mauro Sosa
 * @author Lucas Pradel
 * @author William Diaz
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

class juego {
    int kk;
    informacion info;
    public juego(int id) throws IOException {
        info = new informacion(1);
        kk=id;   
    }
    
    public void recorrido(equipo ball, equipo noball) {
        if (ball.HasBall() != null) {
            action(ball,noball);
        }
        else { 
            action(noball,ball);
        }
    } // me dice que hacer
    public void action(equipo ball, equipo noball)  {
        String posicion = "";
        player PlayerConPelota = ball.HasBall();
        if (PlayerConPelota == null)
        {
            player PlayerAccion = noball.HasAction();
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
                        
                        // probabilidad de malla (incompleto)
                        if (probabilidad(7))
                        {
                            System.out.println("y el jugador " +PlayerConPelota.nombre + "tira......");
                            // gol
                            if (probabilidad(9))
                            {
                                System.out.println("GOOOOL");
                            }
                            
                            
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
        
        
    } // una accion (pase, tiro etc)
    public boolean probabilidad(int porcentaje) {
    int randomNum = ThreadLocalRandom.current().nextInt(0,100); // es de 0 a 9 incluyendo 9
        //  || hay 100 numeros
        return randomNum < porcentaje;
    } // probabilidad de que algo suceda
    

}


// clase player
class player {
    // declaracion de variables iniciales
    
    
    
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
    int Localid;
    List<player> Jugadores = new ArrayList(); // lista de 20 jugadores
    List<player> JugadoresActivos = new ArrayList(); // jugadores activos (11 jugadores)
    
    public equipo (int id) {
        Localid=id;
    }
    
    public void temp() {
        System.out.println();
    }
    
    public void start() {
     setplayers();  
    }
    public void SetActivePlayers() {
        
        List<player> RandomList = Jugadores;
        Collections.shuffle(RandomList);
        int temp = Jugadores.size(); // Cantidad de jugadores de un equipo
        int tamano = JugadoresActivos.size(); // Cantidad de jugadores en una partida
        int i = 0;
        player rol;
        int cantPortero = 1;
        int cantDefensa = 4;
        int cantCentro = 3; 
        int cantDelantero = 3;
        while (i < 20) {
            
            rol = Jugadores.get(i); 
            if ((rol.posicion.equals("portero")) && (cantPortero != 0)) {
                
                JugadoresActivos.add(rol);
                cantPortero--;
            }
            if ((rol.posicion.equals("defensa")) && (cantDefensa != 0)){
            
                JugadoresActivos.add(rol);
                cantDefensa--;
            }
            if ((rol.posicion.equals("centro")) && (cantCentro != 0)){
            
                JugadoresActivos.add(rol);
                cantCentro--;
            }
            if ((rol.posicion.equals("delantero")) && (cantDelantero != 0)){
            
                JugadoresActivos.add(rol);
                cantDelantero--;
            }
            if (tamano == 11){
            
                return;
            }
            i++;
        }
        
         
        
    } // Metodo que forma los grupos de jugadores que van a participar a partir de su equipo
    
    public void setplayers() {
        // asi se crean jugadores nuevos dentro del equipo 
        Jugadores.add(new player(1,"ronaldoElDios","delantero",100,50,0,100,0));
        Jugadores.add(new player(2,"lucas","noC",50,30,20,-5,0));
        Jugadores.add(new player(2,"mauro","noC",0,0,0,0,0));
        
    }
 
    public player HasBall() {
        int temp = JugadoresActivos.size();
        int x = 0;
        player nombre;
        while (x < temp) {
            nombre = JugadoresActivos.get(x);
            
            if (nombre.HasBall) {
                
                return nombre;
            }
            x++;
        }
        return null;
    } // Metodo que retorna el jugador que tiene la pelota
   
    public player HasAction () {
        int temp = JugadoresActivos.size();
        int x = 0;
        player nombre;
        while (x < temp) {
            nombre = JugadoresActivos.get(x);
            
            if (nombre.PlayerAccion) {
                
                return nombre;
            }
            x++;
        }
        return null;
    } // Metodo que devuelve el jugador que va a hacer una accion
}



// clase info
class informacion {
    int kk;
    int TiempoActual;
    PrintWriter log;
    String accion = "";
 
    public informacion (int id) throws IOException {
        kk=id;
        String dir1 = "C:\\Users\\Hector Lopez\\Documents\\GitHub\\soccerfrancia\\log.txt";
        FileWriter fw1 = new FileWriter(dir1, true);
        BufferedWriter bw1 = new BufferedWriter(fw1);
        log = new PrintWriter(bw1); // log de eventos
 
    }
    
    public void AddLog() {
        log.println("min"+TiempoActual+":"+" "+accion);
        // 
    }
}
