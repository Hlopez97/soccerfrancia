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
        
        dos.Jugadores.add(new player(1,"zlucas","delantero",70,50,20,0));     
        dos.Jugadores.add(new player(3,"zlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(4,"zlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(9,"zlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(17,"zlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(5,"zlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(6,"zlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(7,"zlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(8,"zlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(2,"zlucas","portero",70,50,20,90));
        dos.Jugadores.add(new player(10,"zlucas","portero",70,50,20,80));
        dos.Jugadores.add(new player(11,"zlucas","portero",70,50,20,80));
        dos.Jugadores.add(new player(12,"zlucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(13,"zlucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(14,"zlucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(15,"zlucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(16,"zlucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(20,"zlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(18,"zlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(19,"zlucas","delantero",70,50,20,0));
        
    } // crea los 20 jugadores por equipo
    
    public void recorrido(equipo ball, equipo noball) {
        if (ball.HasBall() != null) {
            action(ball,noball);
        }
        else if (noball.HasBall() != null) { 
            action(noball,ball);
        }
        else {System.out.println("esto nunca deberia ocurrir");}
    } // Metodo que dice que hacer

    public void action(equipo ball, equipo noball)  {
        
        player PlayerConPelota = ball.HasBall();
        String posicion = PlayerConPelota.posicion;
        
        
        int act = 0;
       
        if (posicion.equals("delantero"))  { act = 1; }
        if (posicion.equals("centro"))  { act = 2; }
        if (posicion.equals("defensa"))  { act = 3; }
        if (posicion.equals("portero"))  { act = 4; }
        
            switch(act) {
                case 1:
                    player portero = JugadorContrario(ball,noball,4);
                    // probabilidad de que tire 80
                    if (Probabilidad(100))
                    {
                        
                        // probabilidad de malla PlayerConPelota.skilloff-40
                        if (Probabilidad(0)) // si es 100 seria 60
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
                        // sino no malla y  si palo 5
                        else if (Probabilidad(0))
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
                                        ball.CambioJugador(PlayerConPelota);
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
                    
                    // probabilidad que un centro le de pase a un delantero 85
                    if (Probabilidad(100))
                    {
                        PlayerConPelota.HasBall = false;
                        player del = ball.JugadorEquipo("delantero");
                        del.HasBall = true;
                        System.out.println(PlayerConPelota.id + " "  + PlayerConPelota.nombre);
                        System.out.println(del.id + " " + del.nombre);
                        ball.Reemplazoplayer(del);
                        ball.Reemplazoplayer(PlayerConPelota);
                        info.AddLog(StrParaLog(PlayerConPelota,del,102));
                        
                    }
                    // probabilidad de que centro pase a centro
                    else if (Probabilidad(15)) 
                    {
                        PlayerConPelota.HasBall = false;
                        player cen = ball.JugadorEquipo("centro");
                        cen.HasBall = true;
                        
                        ball.Reemplazoplayer(cen);
                        ball.Reemplazoplayer(PlayerConPelota);
                        info.AddLog(StrParaLog(PlayerConPelota,cen,2));
                        
                    }
                    // que le quiten la pelota
                    else 
                    {
                        player boo = JugadorContrario(ball,noball,2);
                        // aqui iria la prob de falta
                        boo.HasBall= true;
                        PlayerConPelota.HasBall = false;
                        ball.Reemplazoplayer(PlayerConPelota);
                        noball.Reemplazoplayer(boo);
                        info.AddLog(StrParaLog(boo,PlayerConPelota,25));
                        
                    }
                    
                    
                    break;
                case 3:
                    
                    // probabilidad que un def le de pase a un centro
                    if (Probabilidad(85))
                    {
                        
                        PlayerConPelota.HasBall = false;
                        player cen = ball.JugadorEquipo("centro");
                        cen.HasBall = true;
                        ball.Reemplazoplayer(cen);
                        ball.Reemplazoplayer(PlayerConPelota);
                        info.AddLog(StrParaLog(PlayerConPelota,cen,2));
                        
                    }
                    // probabilidad de que def pase a def
                    else
                    {  
                        PlayerConPelota.HasBall = false;
                        player cen = ball.JugadorEquipo("defensa");
                        cen.HasBall = true;
                        
                        ball.Reemplazoplayer(cen);
                        ball.Reemplazoplayer(PlayerConPelota);
                        info.AddLog(StrParaLog(PlayerConPelota,cen,2));
                    }
                    
                    
                    
                    
                    break;
                case 4:    
                    PlayerConPelota.HasBall = false;
                    player cen = ball.JugadorEquipo("defensa");
                    cen.HasBall = true;
                    System.out.println(PlayerConPelota.id + " "  + PlayerConPelota.nombre);
                    System.out.println(cen.id + " " + cen.nombre);      
                    ball.Reemplazoplayer(cen);
                    ball.Reemplazoplayer(PlayerConPelota);
                    info.AddLog(StrParaLog(PlayerConPelota,cen,2));
                    // portero le da la pelota a un def                     
                    break;
                              
        }     
       
        
        
    } // una accion (pase, tiro etc)
    

    public void action1() {
        
        // determinar cual es el id del jugador con la pelota
        int id = 0;
        for (int a = 0; a < PrimerEquipo.JugadoresActivos.size(); a++)
        {
            if (PrimerEquipo.JugadoresActivos.get(a).HasBall = true)
            {
                id = a;
            }
        }
        
        // ahora determinar su rol
        
        int cases = 0;
        if (id == 0){System.out.println("RIP, esto nunca deberia ocurrir");}
        else if (PrimerEquipo.JugadoresActivos.get(id).posicion.equals("delantero"))
        {
            cases = 1;
        }
        else if (PrimerEquipo.JugadoresActivos.get(id).posicion.equals("centro"))
        {
            cases = 2;
        }
        else if (PrimerEquipo.JugadoresActivos.get(id).posicion.equals("defensa"))
        {
            cases = 3;
        }
        else if (PrimerEquipo.JugadoresActivos.get(id).posicion.equals("portero"))
        {
            cases = 4;
        }
        
        // ahora empieza la accion, usando su rol en switch
        
        /* if (Probabilidad(0)) {}  */ 
        /* PrimerEquipo.JugadoresActivos.get(id)    */ 
        
        switch(cases)
        {
            case 0:
                System.out.println("RIP esto nunca deberia ocurrir");
                break;
                
             // delantero   
            case 1:
                // Probabilidad de que tire
                if (Probabilidad(80))
                {
                    // probabilidad de malla
                    if (Probabilidad(PrimerEquipo.JugadoresActivos.get(id).skilloff-40)) 
                    {
                        // probabilidad de gol
                        if (Probabilidad(0)) {}
                        else {}
                        
                    }
                    // probabilidad de palo
                    else if (Probabilidad(5))
                    {
                        // rebota y jugador recibe la pelota denuevo
                        if (Probabilidad(30))
                        {
                            
                        }
                        // sale del campo
                        else if (Probabilidad(65)) 
                        {
                            
                        } 
                        // gol de palo
                        else 
                        {
                            
                        }                         
                    }
                    
                    // no malla ni palo, saque de portero
                    else 
                    {
                        
                    }   
                }
                // pasa (deberia ser else if( 70%) con un else de falta)
                else 
                {
                    // si el pase fue bueno
                    if (Probabilidad(50)) 
                    {
                        
                    }
                    // si fue fuera de campo
                    else 
                    {
                        
                    }
                }
                
                break;  
                
            // centro
            case 2: 
                // probabilidad de pase hacia un delantero
                if (Probabilidad(85)) 
                {
                    
                }
                // probablidad que le quiten la pelota             
                else if (Probabilidad(50)) 
                {
                    // aqui va probabilidad de falta
                    
                    
                }
                // proabilidad que de un pase a un centro
                else
                {
                    
                }
                break;  
                
             // defensa   
            case 3: 
                // probabilidad de pase hacia un centro
                if (Probabilidad(85)) 
                {
                    
                }                
                // proabilidad que de un pase a un defensa
                else
                {
                    
                }
                
                
                break;
                
            // potero    
            case 4: 
                // da pase a defensa
                break;
            
                       
        }
        
        
        
        
        
    } // accion de equipo 1
    public void action2() {
        
        // determinar cual es el id del jugador con la pelota
        int id = 0;
        for (int a = 0; a < SegundoEquipo.JugadoresActivos.size(); a++)
        {
            if (SegundoEquipo.JugadoresActivos.get(a).HasBall = true)
            {
                id = a;
            }
        }
        
        // ahora determinar su rol
        
        int cases = 0;
        if (id == 0){System.out.println("RIP, esto nunca deberia ocurrir");}
        else if (SegundoEquipo.JugadoresActivos.get(id).posicion.equals("delantero"))
        {
            cases = 1;
        }
        else if (SegundoEquipo.JugadoresActivos.get(id).posicion.equals("centro"))
        {
            cases = 2;
        }
        else if (SegundoEquipo.JugadoresActivos.get(id).posicion.equals("defensa"))
        {
            cases = 3;
        }
        else if (SegundoEquipo.JugadoresActivos.get(id).posicion.equals("portero"))
        {
            cases = 4;
        }
        
        
        
        
        // ahora empieza la accion, usando su rol en switch
        
        /* if (Probabilidad(0)) {}  */ 
        /* SegundoEquipo.JugadoresActivos.get(id)    */ 
        
        switch(cases)
        {
            case 0:
                System.out.println("RIP esto nunca deberia ocurrir");
                break;
                
             // delantero   
            case 1:
                // Probabilidad de que tire
                if (Probabilidad(80))
                {
                    // probabilidad de malla
                    if (Probabilidad(SegundoEquipo.JugadoresActivos.get(id).skilloff-40)) 
                    {
                        
                        int pro = SegundoEquipo.JugadoresActivos.get(id).skilloff - 
                                (PrimerEquipo.JugadorEquipo("portero").skillpor-70);
                        // probabilidad de gol
                        if (Probabilidad(pro)) 
                        {
                            SegundoEquipo.Puntuacion++;
                            info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(id),null,0));
                            SegundoEquipo.JugadoresActivos.get(id).HasBall = false;
                            PrimerEquipo.JugadorEquipo("portero").HasBall = true;
                        }
                        // lo agarro el portero
                        else 
                        {
                            
                        }
                        
                    }
                    // probabilidad de palo
                    else if (Probabilidad(5))
                    {
                        // rebota y jugador recibe la pelota denuevo
                        if (Probabilidad(30))
                        {
                            
                        }
                        // sale del campo
                        else if (Probabilidad(65)) 
                        {
                            
                        } 
                        // gol de palo
                        else 
                        {
                            
                        }                         
                    }
                    
                    // no malla ni palo, saque de portero
                    else 
                    {
                        
                    }   
                }
                // pasa (deberia ser else if( 70%) con un else de falta)
                else 
                {
                    // si el pase fue bueno
                    if (Probabilidad(50)) 
                    {
                        
                    }
                    // si fue fuera de campo
                    else 
                    {
                        
                    }
                }
                
                break;  
                
            // centro
            case 2: 
                // probabilidad de pase hacia un delantero
                if (Probabilidad(85)) 
                {
                    
                }
                // probablidad que le quiten la pelota             
                else if (Probabilidad(50)) 
                {
                    // aqui va probabilidad de falta
                    
                    
                }
                // proabilidad que de un pase a un centro
                else
                {
                    
                }
                break;  
                
             // defensa   
            case 3: 
                // probabilidad de pase hacia un centro
                if (Probabilidad(85)) 
                {
                    
                }                
                // proabilidad que de un pase a un defensa
                else
                {
                    
                }
                
                
                break;
                
            // potero    
            case 4: 
                // da pase a defensa
                break;
            
                       
        }
        
        
        
        
        
    } // accion de equipo 2
   
    public String StrParaLog(player uno, player dos, int x) {
        /*
        x = 0   gol (1)
        
       
        */
        switch (x)
        {
            
            case 0:
                String re = uno.nombre + "recibe la pelota, tira, y.... GOOOOL!!!";
                return re;
            case 1:
            case 2:
            case 3: 
            case 4:
            case 5: 
            case 6:
            case 7: 
            case 8: 
                
        }
        
        
        
        return uno.nombre + " " + x;
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
    
    public player JugadorEquipoConPelota (equipo equipo1, equipo equipo2, int x) {
        
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
    } // Metodo que devuelve un jugador del equipo tiene la pelota
    
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
                        info.AddLog("Comienza la partida!");
                        inicio = false;
                        inicio();  
                    }
                    else if (!gg)
                    {
                    recorrido(PrimerEquipo, SegundoEquipo);
                    }
                    else {System.out.println("se acabo el juego!");}
                }
              
                DelaySegundo();
            }
        }
        info.minActual = 90;
        info.segActual = 00;
        System.out.println("se acabo el juego!");
        System.out.println("puntuacion:" + PrimerEquipo.Puntuacion +" "+SegundoEquipo.Puntuacion);
        info.log.close();
    } // Metodo timer que lleva el tiempo del juego
    
    public void inicio(){
    
        // si equipo 1 recibe la pelota
        if (Probabilidad(50))
        {
            
            player s = PrimerEquipo.JugadorEquipo("centro");
            info.AddLog(StrParaLog(s,null,19));
            s.HasBall = true;
            PrimerEquipo.Reemplazoplayer(s);           
            info.AddLog(StrParaLog(s,null,6));
        }
        else 
        {
            player s = SegundoEquipo.JugadorEquipo("centro");
            info.AddLog(StrParaLog(s,null,19));
            s.HasBall = true;
            SegundoEquipo.Reemplazoplayer(s);            
            info.AddLog(StrParaLog(s,null,6));
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
        nombre = pnombre;
        skillpor = pskillpor;
        
    } // Metodo constructor de player
    
}

//clase equipo con 20 instancia de clase player
class equipo {
    
    int Localid;
    int Puntuacion = 0;
    List<player> Jugadores = new ArrayList(); // lista de 20 jugadores
    List<player> JugadoresActivos = new ArrayList(); // jugadores activos (11 jugadores)
    List<player> JugadoresBanca = new ArrayList(); // jugadores en banca (9 jugadores)
    int cambios = 0;
    
    public equipo (int id) {
        Localid = id;
    }
    
    public void start() {
        CrearEquipoActivo(Localid);  
    }
    
    public player JugadorEquipo (String posicion){
          List<player> sss = JugadoresActivos;
          Collections.shuffle(sss);
        for (int s = 0; s< sss.size(); s++)
        {
            if (sss.get(s).posicion.equals(posicion))
            {
                return sss.get(s);
            }
            
        
        }
        System.out.println("RIP");
        return sss.get(3);
    
    } // me devuelve un jugador de la posicion de jugadoresactivos (INCOMPLETO)
    
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
    
    public void CrearBanca() {
        
        player x;
        int j = 0;
        while (j < 20)
        {
            x = Jugadores.get(j);
            if (JugadoresActivos.contains(x))
            {
            }
            else
            {
                JugadoresBanca.add(x);
            }
         j++;   
        }
    } // Metodo que crea la lista con los jugadores de banca
    
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
    
    public player CambioJugador (player x) {
    
        for (int i = 0; i < JugadoresActivos.size(); i++)
        {
            player k = JugadoresActivos.get(i);
            if (k.id == x.id)
            {
                for (int j = 0; j < JugadoresBanca.size(); j++)
                {
                    player l = JugadoresBanca.get(j);
                    if (x.posicion.equals(l.posicion))
                    {
                        int s = JugadoresActivos.indexOf(x);
                        int d = JugadoresBanca.indexOf(l);
                        JugadoresActivos.remove(k);
                        JugadoresBanca.remove(l);
                        JugadoresActivos.add(s, l);
                        JugadoresBanca.add(d, k);
                        return l;
                    }
                    else
                    {
                    }
                }
            }
            else
            {
            }    
        }
    	return null;  
    } // Metodo que cambia el jugador por uno de la banca
    
    public int JugadorEquipo2 (String posicion, int id) {
        
        
        List<player> sss = JugadoresActivos;
        Collections.shuffle(sss);
        for (int s = 0; s< sss.size(); s++)
        {
            if (sss.get(s).posicion.equals(posicion))
            {
                if (sss.get(s).id != id)
                {
                    return sss.get(s).id;
                }
            }
            
        
        }
        System.out.println("RIP");
        
        return 1;
        
    } // me devuelve el id del jugador del equipo con la posicion y tomando en cuenta que no es el mismo del id otorgado
   
    public int IndexDeJugador (int id)
    {
        for (int i = 0; i < JugadoresActivos.size(); i++)
        {
            if (JugadoresActivos)
         
            
            
            
        }
     
        
        return 3;
            
    
    
}



// clase info
class informacion {
    int kk;
    int minActual;
    int segActual;
    PrintWriter log = new PrintWriter("log.txt");
    
    
    public informacion (int id) throws IOException {
        kk=id;
        log.println("HEY SUP BITCHES");
        
        
 
    }
    
    public void AddLog(String accion) {
        System.out.println("["+minActual+":"+segActual+ "] -> " + accion);
        log.println("["+minActual+":"+segActual+ "] -> " + accion);
        // 
    }
}
