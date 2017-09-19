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

    public static void main(String[] args) throws IOException {
        launch(args); // esto corre el metodo start
        
        // cualquier cosa aqui lo hace despues de correr el metodo start
        System.out.println("peanuts");
        juego prueba = new juego(1);
        prueba.start();
 
    } 
}

class juego {
    
    int kk;
    informacion info;
    equipo PrimerEquipo;
    equipo SegundoEquipo;

    public juego(int id) throws IOException {
        info = new informacion(1);
        kk = id;
        PrimerEquipo = new equipo(1);
        PrimerEquipo.start();
        SegundoEquipo = new equipo(2);   
        SegundoEquipo.start();
    } // Metodo constructor
    
    public void start() {
        
        Timer();
    }
    
    public void recorrido(equipo ball, equipo noball) {
        if (ball.HasBall() != null) {
            action(ball,noball);
        }
        else { 
            action(noball,ball);
        }
    } // Metodo que dice que hacer

    
    public void action(equipo ball, equipo noball)  {
        
        player PlayerConPelota = ball.HasBall();
        String posicion = PlayerConPelota.posicion;
        
        int act = 0;
       
        if (posicion.equals("delantero"))  { act = 1; }
        if (posicion.equals("centro"))  { act = 2; }
        if (posicion.equals("defensa"))  { act = 3; }
        if (posicion.equals("portero"))  { act = 4; }
        // si tiene la pelota    
            switch(act) {
                case 1:
                    player portero = JugadorContrario(ball,noball,4);
                    // probabilidad de que tire
                    if (Probabilidad(50))
                    {
                        
                        // probabilidad de malla
                        if (Probabilidad(PlayerConPelota.skilloff-40)) // si es 100 seria 60
                        {
                            
                            // probabilidad de gol
                            if (Probabilidad(PlayerConPelota.skilloff-(portero.skillpor-70)))
                            {
                                player centro = JugadorContrario(ball, noball, 2);
                                centro.HasBall = true;
                                ball.Puntuacion++;
                                info.AddLog(StrParaLog(PlayerConPelota,portero,1)); // pconpelota metio gol a portero
                                info.AddLog(StrParaLog(centro,portero,6));  // centro recibe la pelota de saque del medio
                                PlayerConPelota.HasBall = false;
                                ball.Reemplazoplayer(centro);
                                ball.Reemplazoplayer(PlayerConPelota); 
                            }
                            // fallo el gol (el portero lo atrapa)
                            else 
                            {
                                PlayerConPelota.HasBall = false;
                                info.AddLog(StrParaLog(PlayerConPelota,portero,8));
                                ball.Reemplazoplayer(PlayerConPelota);
                                portero.HasBall = true;
                                ball.Reemplazoplayer(portero);
                            }     
                        
                        }
                        // sino no malla y  si palo
                        else if (Probabilidad(5))
                        {
                            // tira denuevo
                            if (Probabilidad(30))
                            {
                                info.AddLog(StrParaLog(PlayerConPelota,portero,11));
                            }
                            // palo y sale del campo, es saque de portero
                            else if(Probabilidad(65))
                            {
                                PlayerConPelota.HasBall = false;
                                info.AddLog(StrParaLog(PlayerConPelota,portero,12));
                                ball.Reemplazoplayer(PlayerConPelota);
                                portero.HasBall = true;
                                ball.Reemplazoplayer(portero);
                            }
                            // gol de palo
                            else 
                            {
                                ball.Puntuacion++;
                                info.AddLog(StrParaLog(PlayerConPelota,portero,13));
                                player centro = JugadorContrario(ball, noball, 2);
                                centro.HasBall = true;
                                PlayerConPelota.HasBall = false;
                                ball.Reemplazoplayer(centro);
                                ball.Reemplazoplayer(PlayerConPelota); 
                                
                            }
                            
                        
                        
                        }
                        // sino malla ni palo, fallo, saque de portero
                        else
                        {
                            PlayerConPelota.HasBall = false;
                            info.AddLog(StrParaLog(PlayerConPelota,portero,14));
                            ball.Reemplazoplayer(PlayerConPelota);
                            portero.HasBall = true;
                            ball.Reemplazoplayer(portero);
                        }
                        
                    }
                    // sino tira
                    else 
                    {
                        // si hace falta
                        if (Probabilidad(50))
                        {
                            player def = JugadorContrario(ball,noball,3);
                            // falta leve
                            if (Probabilidad(80))
                            {
                                def.FaltasLeve++;
                                // agregar amarilla
                                if (def.FaltasLeve >= 4)
                                {
                                    def.FaltasLeve = 0;
                                    def.TarjetaAmarilla++;
                                    // si 2 amarilla, roja
                                    if (def.TarjetaAmarilla > 1)
                                    {
                                        def.TarjetaAmarilla = 0;
                                        
                                    }
                                    
                                }
                                
                            }
                            // falta grave
                            else 
                            {
                                
                            }
                            
                        }
                        else if (Probabilidad(50)){}
                        
                    }
                    
                    break;
                    
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                              
        }     
       
        
        
    } // una accion (pase, tiro etc)
   
    public String StrParaLog(player uno, player dos, int x) {
        /*
        * x = 1 gol
        * x = 2 pase
        * x = 3 falta leve
        * x = 4 falta grave (tarjeta roja)
        * x = 5 corner
        * x = 6 saque (de medio)
        * x = 7 inicio
        * x = 8 lo atrapo potero
        * x = 9 fallo el gol
        * x = 10 corner
        * x = 11 palo y recupera la pelota el tirador
        * x = 12 palo y sale para afuera (saque de portero)
        * x = 13 palo y gol
        * x = 14 tira y sale de campo
        */
        
        
        return "";
    } // me tira el string que dice "el player 1 hizo algo player 2
    
    public boolean Probabilidad(int porcentaje) {
    int randomNum = ThreadLocalRandom.current().nextInt(0,100); // es de 0 a 9 incluyendo 9
        //  || hay 100 numeros
        return randomNum < porcentaje;
    } // probabilidad de que algo suceda
    
    public player JugadorContrario (equipo equipo1, equipo equipo2, int x) {
        
        player rol;
        if (equipo1.HasBall() == null)
        {
            List<player> temporal = equipo1.JugadoresActivos;
            Collections.shuffle(temporal);
            
            switch(x)
            {
                case 1:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("delantero")) 
                        {
                            return rol;
                        }
                    }
                    break;
                case 2:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("centro")) 
                        {
                            return rol;
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("defensa")) 
                        {
                            return rol;
                        }
                    }
                    break;
                case 4:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("portero")) 
                        {
                            return rol;
                        }
                    }
                    break;
            }
            
        }
        else
        {
            List<player> temporal = equipo2.JugadoresActivos;
            Collections.shuffle(temporal);
            switch(x)
            {
                case 1:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("delantero")) 
                        {
                            return rol;
                        }
                    }
                    break;
                case 2:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("centro")) 
                        {
                            return rol;
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("defensa")) 
                        {
                            return rol;
                        }
                    }
                    break;
                case 4:
                    for(int i = 0; i <= temporal.size();i++)
                    {
                        rol = temporal.get(i);
                        if (rol.posicion.equals("portero")) 
                        {
                            return rol;
                        }
                    }
                    break;
            }
        }
 
        return null;
    } // Metodo que devuelve un jugador del equipo qu no tiene la pelota
    
    public void Timer() {
        
        int min; int seg;
        for (min = 0; min <= 89; min++) 
        {
            for (seg = 0; seg <= 59; seg++)
            {
                info.minActual = min;
                info.segActual = seg;
                
                if ((min == 45) && (seg == 0))
                {
                    info.AddLog("Medio termino");
                }
                else
                { 
                    recorrido(PrimerEquipo, SegundoEquipo);
                    System.out.println(seg);
                }
              
                DelaySegundo();
            }
        }
        info.minActual = 90;
        info.segActual = 00;
        
    } // Metodo timer que lleva el tiempo del juego
        
    public void DelaySegundo() {
        
        try {   
            Thread.sleep(1000);    
        } catch(InterruptedException e){}
    } // Metodo que simula un seg de la vida real
    
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
        id = pid;
        posicion = pposicion;
        skilloff = pskilloff;
        skilldri= pskilldri;
        skilldef = pskilldef;
        skilldes = pskilldes;
        skillpor = pskillpor;
        
    } // Metodo constructor de player
    
}

//clase equipo con 20 instancia de clase player
class equipo {
    
    int Localid;
    int Puntuacion = 0;
    List<player> Jugadores = new ArrayList(); // lista de 20 jugadores
    List<player> JugadoresActivos = new ArrayList(); // jugadores activos (11 jugadores)
    
    public equipo (int id) {
        Localid = id;
    }
    
    public void start() {
        CrearEquipoActivo(Localid);  
    }
    
    public void CrearEquipoActivo(int x) {
        
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
            else if ((rol.posicion.equals("defensa")) && (cantDefensa != 0)){
            
                JugadoresActivos.add(rol);
                cantDefensa--;
            }
            else if ((rol.posicion.equals("centro")) && (cantCentro != 0)){
            
                JugadoresActivos.add(rol);
                cantCentro--;
            }
            else if ((rol.posicion.equals("delantero")) && (cantDelantero != 0)){
            
                JugadoresActivos.add(rol);
                cantDelantero--;
            }
            else if (tamano == 11){
            
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
        
    } // 
 
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
    
    public void Reemplazoplayer(player p){
        
        for (int a = 0; a< JugadoresActivos.size(); a++)
        {
            if (JugadoresActivos.get(a).id == p.id) 
            {
                JugadoresActivos.remove(a);
                JugadoresActivos.add(a, p);
            }
        }
        
        
        
    } // despues de cada accion por obligacion hay que reemplazar al player
    
    public void QuitarPlayer (player rip){
    for (int a = 0; a< JugadoresActivos.size(); a++)
        {
            if (JugadoresActivos.get(a).id == rip.id) 
            {
                JugadoresActivos.remove(a);
            }
        }
    } // quita un jugador por falta
}



// clase info
class informacion {
    int kk;
    int minActual;
    int segActual;
    PrintWriter log;
    
    public informacion (int id) throws IOException {
        kk=id;
        String dir1 = "C:\\Users\\HectorLopez\\Documents\\GitHub\\soccerfrancia\\loga.txt";
        FileWriter fw1 = new FileWriter(dir1, true);
        BufferedWriter bw1 = new BufferedWriter(fw1);
        log = new PrintWriter(bw1); // log de eventos
 
    }
    
    public void AddLog(String accion) {
        log.println("["+minActual+":"+segActual+ "] -> " + accion);
        // 
    }
}
