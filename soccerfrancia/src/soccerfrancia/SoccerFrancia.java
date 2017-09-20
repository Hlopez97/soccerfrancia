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
    boolean gg = false;
    boolean inicio = true;

    public juego(int id) throws IOException {
        info = new informacion(1);
        kk = id;
        PrimerEquipo = new equipo(1);
        SegundoEquipo = new equipo(2);   
        setplayers(PrimerEquipo, SegundoEquipo);
        PrimerEquipo.start();
        SegundoEquipo.start();
        
    } // Metodo constructor
    
    public void start() {
        
        Timer();
    }
    
    public void setplayers(equipo uno, equipo dos) {
        uno.Jugadores.add(new player(1,"lucas","delantero",70,50,20,0));     
        uno.Jugadores.add(new player(3,"lucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(4,"lucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(9,"lucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(17,"lucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(5,"lucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(6,"lucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(7,"lucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(8,"lucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(2,"lucas","portero",70,50,20,90));
        uno.Jugadores.add(new player(10,"lucas","portero",70,50,20,0));
        uno.Jugadores.add(new player(11,"lucas","portero",70,50,20,0));
        uno.Jugadores.add(new player(12,"lucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(13,"lucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(14,"lucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(15,"lucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(16,"lucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(20,"lucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(18,"lucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(19,"lucas","delantero",70,50,20,0));
        
        // dos
        
        dos.Jugadores.add(new player(1,"lucas","delantero",70,50,20,0));     
        dos.Jugadores.add(new player(3,"lucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(4,"lucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(9,"lucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(17,"lucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(5,"lucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(6,"lucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(7,"lucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(8,"lucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(2,"lucas","portero",70,50,20,90));
        dos.Jugadores.add(new player(10,"lucas","portero",70,50,20,0));
        dos.Jugadores.add(new player(11,"lucas","portero",70,50,20,0));
        dos.Jugadores.add(new player(12,"lucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(13,"lucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(14,"lucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(15,"lucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(16,"lucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(20,"lucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(18,"lucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(19,"lucas","delantero",70,50,20,0));
        
    } // crea los 20 jugadores por equipo
    
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
                    if (Probabilidad(80))
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
                        // sino malla ni palo, osea el fallo, saque de portero
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
                        // si le hacen falta
                        if (Probabilidad(40))
                        {
                            player def = JugadorContrario(ball,noball,3);
                            // falta leve
                            if (Probabilidad(80))
                            {
                                def.FaltasLeve++;
                                // agregar amarilla si necesario
                                if (def.FaltasLeve >= 4)
                                {
                                    def.FaltasLeve = 0;
                                    def.TarjetaAmarilla++;
                                    // si 2 amarilla, crea una roja
                                    if (def.TarjetaAmarilla > 1)
                                    {
                                        def.TarjetaAmarilla = 0;
                                        noball.QuitarPlayer(def);
                                        info.AddLog(StrParaLog(def,portero,15));
                                        
                                        // si 5 roja 
                                        if (noball.JugadoresActivos.size() < 7)
                                        {
                                            gg = true;
                                            info.AddLog(StrParaLog(def,portero,17));
                                        }
                                        
                                    }
                                    
                                }
                                if (!gg)
                                {
                                    player n = ball.JugadorEquipo("centro");
                                    n.HasBall = true;
                                    PlayerConPelota.HasBall = false;
                                    ball.Reemplazoplayer(n);
                                    ball.Reemplazoplayer(PlayerConPelota);  
                                    info.AddLog(StrParaLog(PlayerConPelota,n,15));
                                }   
                            }
                            // falta grave
                            else 
                            {
                                // si causa daño
                                if (Probabilidad(25))
                                {
                                    // si se le acabo los cambios
                                    if (ball.cambios > 3)
                                    {
                                        ball.QuitarPlayer(PlayerConPelota);
                                        info.AddLog(StrParaLog(PlayerConPelota,null,20));
                                        
                                        if (ball.JugadoresActivos.size() < 7)
                                        {
                                            gg = true;
                                            info.AddLog(StrParaLog(null,null,17));
                                        }
                                        
                                    }
                                    else 
                                    {
                                        info.AddLog(StrParaLog(PlayerConPelota,null,21));
                                        ball.SubstitucionDePlayer(PlayerConPelota);
                                        ball.cambios++;
                                    }
                                    
                                }
                                // ahora hay que sacar al que hizo la falta
                                noball.QuitarPlayer(def);
                                info.AddLog(StrParaLog(def,null,24));
                                
                            }
                            
                        }
                        // sino le hacen falta, aka no hacer nada este minuto
                        else {info.AddLog(StrParaLog(PlayerConPelota,null,23));}
                        
                    }
                    
                    break;
                    
                case 2:
                    
                    // probabilidad que un centro le de pase a un delantero
                    if (Probabilidad(85))
                    {
                        
                    }
                    // probabilidad de que centro pase a centro
                    else if (Probabilidad(15)) {}
                    
                    
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
        * x = 15 eliminacion de jugador del campo por tarjeta roja (1)
        * x = 16 no hizo nada
        * x = 17 gg (0)
        * x = 18 inicio
        * x = 19 recibe la pelota (despues de inicio)
        * x = 20 sale el jugador por ser herido (1)
        * x = 21 se cambia un jugador por otro (1) // ej: sale jose por herida y es reemplazado!
        * x = 22 le hicieron falta y ahora saca un centro   // ej: le dieron a jose y ahora saca el centro mauro
        * x = 23 literalmente no hacer nada (1) // ej. el esta dribleando y mantiene la pelota
        * x = 24 sale jugador por tarjeta roja
        */
        
        
        
        return "accion";
    } // me tira el string que dice "el player 1 hizo algo player 2
    
    public boolean Probabilidad(int porcentaje) {
    int randomNum = ThreadLocalRandom.current().nextInt(0,100); // es de 0 a 99 incluyendo 99
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
                    if (inicio)
                    {
                        info.AddLog(StrParaLog(null,null,18));
                        inicio();  
                    }
                    else if (!gg)
                    {
                    recorrido(PrimerEquipo, SegundoEquipo);
                    System.out.println(seg);
                    }
                    else {System.out.println("se acabo el juego!");}
                }
              
                DelaySegundo();
            }
        }
        info.minActual = 90;
        info.segActual = 00;
        System.out.println("se acabo el juego!");
    } // Metodo timer que lleva el tiempo del juego
    
    public void inicio(){
    
        // si equipo 1 recibe la pelota
        if (Probabilidad(50))
        {
            
            player s = PrimerEquipo.JugadorEquipo("centro");
            info.AddLog(StrParaLog(s,null,19));
            s.HasBall = true;
            PrimerEquipo.Reemplazoplayer(s);
        }
        else 
        {
            player s = SegundoEquipo.JugadorEquipo("centro");
            info.AddLog(StrParaLog(s,null,19));
            s.HasBall = true;
            SegundoEquipo.Reemplazoplayer(s);
        }
    } // el primer saque
        
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
    int skilloff; int skilldri; int skilldef;  int skillpor;
    boolean HasBall = false; // false hasta que empieza el juego
    int FaltasLeve; int TarjetaAmarilla;
    boolean FaltaGrave;  // si tiene falta grave es lo mismo que tarjeta roja y es out, no hay mas de una por lo que puede ser bool
    boolean EstaHerido;
    boolean PlayerAccion = false;
    
    public player (int pid, String pnombre, String pposicion, int pskilloff, int pskilldri, int pskilldef, int pskillpor) {
        // aqui se setean los valores iniciales, es el constructor
        id = pid;
        posicion = pposicion;
        skilloff = pskilloff;
        skilldri= pskilldri;
        skilldef = pskilldef;
        
        skillpor = pskillpor;
        
    } // Metodo constructor de player
    
}

//clase equipo con 20 instancia de clase player
class equipo {
    
    int Localid;
    int Puntuacion = 0;
    List<player> Jugadores = new ArrayList(); // lista de 20 jugadores
    List<player> JugadoresActivos = new ArrayList(); // jugadores activos (11 jugadores)
    int cambios = 0;
    
    public equipo (int id) {
        Localid = id;
    }
    
    public void start() {
        CrearEquipoActivo(Localid);  
    }
    
    public player JugadorEquipo (String posicion){return null;} // me devuelve un jugador de la posicion de jugadoresactivos
    public player JugadorBanca (String posicion){return null;} // me devuelve un jugador de la posicion de jugadores
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
    
    public void SubstitucionDePlayer(player rip) {
        for (int a = 0; a< JugadoresActivos.size(); a++)
        {
            if (JugadoresActivos.get(a).id == rip.id) 
            {
                JugadoresActivos.remove(a);
                player add = JugadorBanca(rip.posicion);
                JugadoresActivos.add(add);
            }
        }
    } // me cambia a el player de jugadores activo por uno de jugadoresbanca
}



// clase info
class informacion {
    int kk;
    int minActual;
    int segActual;
    PrintWriter log;
    
    public informacion (int id) throws IOException {
        kk=id;
        String dir1 = "C:\\Users\\Hector Lopez\\Desktop\\s\\log.txt";
        FileWriter fw1 = new FileWriter(dir1, true);
        BufferedWriter bw1 = new BufferedWriter(fw1);
        log = new PrintWriter(bw1); // log de eventos
 
    }
    
    public void AddLog(String accion) {
        log.println("["+minActual+":"+segActual+ "] -> " + accion);
        // 
    }
}
