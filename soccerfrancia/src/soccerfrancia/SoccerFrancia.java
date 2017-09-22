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
import javax.sound.sampled.Port;
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
class juego 
{
    int kk;
    informacion info;
    equipo PrimerEquipo;
    equipo SegundoEquipo;
    boolean gg = false;
    
    public juego(int id) throws IOException {
        info = new informacion(1);
        kk = id;
        PrimerEquipo = new equipo(1, "equipo1");
        SegundoEquipo = new equipo(2, "equipo2");   
        setplayers(PrimerEquipo, SegundoEquipo);
        PrimerEquipo.start();
        SegundoEquipo.start();
        
    } // Metodo constructor
     
    public void start() {
        
        Timer();
    }
    
    public static void setplayers(equipo uno, equipo dos) {
        uno.Jugadores.add(new player(1,"Alucas","delantero",70,50,20,0));     
        uno.Jugadores.add(new player(2,"Alucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(3,"Alucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(4,"Alucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(5,"Alucas","delantero",70,50,20,0));
        uno.Jugadores.add(new player(6,"Alucas","delantero",70,50,20,0));
        
        uno.Jugadores.add(new player(7,"Blucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(8,"Blucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(9,"Blucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(10,"Blucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(11,"Blucas","centro",70,50,20,0));
        uno.Jugadores.add(new player(12,"Blucas","centro",70,50,20,0));
        
        uno.Jugadores.add(new player(13,"Dlucas","portero",70,50,20,90));
        uno.Jugadores.add(new player(14,"Dlucas","portero",70,50,20,0));
        uno.Jugadores.add(new player(15,"Dlucas","portero",70,50,20,0));
        
        uno.Jugadores.add(new player(16,"Clucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(17,"Clucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(18,"Clucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(19,"Clucas","defensa",70,50,20,0));
        uno.Jugadores.add(new player(20,"Clucas","defensa",70,50,20,0));
        
        
        
        // dos
        
        dos.Jugadores.add(new player(1,"zAlucas","delantero",70,50,20,0));     
        dos.Jugadores.add(new player(2,"zAlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(3,"zAlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(4,"zAlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(5,"zAlucas","delantero",70,50,20,0));
        dos.Jugadores.add(new player(6,"zAlucas","delantero",70,50,20,0));
        
        dos.Jugadores.add(new player(7,"zBlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(8,"zBlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(9,"zBlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(10,"zBlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(11,"zBlucas","centro",70,50,20,0));
        dos.Jugadores.add(new player(12,"zBlucas","centro",70,50,20,0));
        
        dos.Jugadores.add(new player(13,"zDlucas","portero",70,50,20,90));
        dos.Jugadores.add(new player(14,"zDlucas","portero",70,50,20,80));
        dos.Jugadores.add(new player(15,"zDlucas","portero",70,50,20,80));
        
        dos.Jugadores.add(new player(16,"zClucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(17,"zClucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(18,"zClucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(19,"zClucas","defensa",70,50,20,0));
        dos.Jugadores.add(new player(20,"zClucas","defensa",70,50,20,0));
        
        
        
    } // crea los 20 jugadores por equipo
    
    public void Timer() {
        
        int min; int seg;
        for (min = 0; min <= 89; min++) 
        {
            for (seg = 0; seg <= 59; seg++)
            {
                info.minActual = min;
                info.segActual = seg;
                recorrido();
                DelaySegundo();
                if (gg) {break;}
                
            }
            if (gg) {break;}
        }
        if (!gg)
        {
        info.minActual = 90;
        info.segActual = 00;
        recorrido();
        }
        info.log.close();
    } // Metodo timer que lleva el tiempo del juego
    
    public void DelaySegundo() {
        
        try {   
            Thread.sleep(1);    
        } catch(InterruptedException e){}
    } // Metodo que simula un seg de la vida real
    
    public void recorrido() {
        if (info.minActual == 0 && info.segActual == 0)
        {
            inicio();
        }
        else if (info.minActual == 45 && info.segActual == 0)
        {
            info.AddLog("Medio Termino");
        }
        else if (info.minActual == 90 && info.segActual == 0)
        {
            info.AddLog("Se acabo el juego!");
            info.AddLog("la puntuacion final es " + PrimerEquipo.Puntuacion + " a " + SegundoEquipo.Puntuacion);
            if (PrimerEquipo.Puntuacion > SegundoEquipo.Puntuacion)
            {
                info.AddLog("Gano " + PrimerEquipo.enombre);
            }
            else 
            {
                info.AddLog("Gano " + SegundoEquipo.enombre);
            }
        }
        else if (!gg)
        {
            if (PrimerEquipo.HasBall())
            {
                action(PrimerEquipo,SegundoEquipo);
            }
            else 
            {
                action(SegundoEquipo,PrimerEquipo);
            }
        }
        else 
        {
        info.AddLog("se acabo el juego... que tragedia");
        // meter aqui quien causo el fallo y por lo tanto declarar al otro equipo ganador
        }
       
    } // Metodo que dice que hacer
    
    public void action1() {
        
        // determinar cual es el id del jugador con la pelota
        int index = 0;
        for (int a = 0; a < PrimerEquipo.JugadoresActivos.size(); a++)
        {
            if (PrimerEquipo.JugadoresActivos.get(a).HasBall)
            {
                index = a;
            }
        }
        
        //
        int idd = PrimerEquipo.JugadoresActivos.get(index).id;
        int cases = 0;
        if (idd == 0){System.out.println("RIP, esto nunca deberia ocurrir");}
        else if (PrimerEquipo.JugadoresActivos.get(index).posicion.equals("delantero"))
        {
            cases = 1;
        }
        else if (PrimerEquipo.JugadoresActivos.get(index).posicion.equals("centro"))
        {
            cases = 2;
        }
        else if (PrimerEquipo.JugadoresActivos.get(index).posicion.equals("defensa"))
        {
            cases = 3;
        }
        else if (PrimerEquipo.JugadoresActivos.get(index).posicion.equals("portero"))
        {
            cases = 4;
        }
        
        // ahora empieza la accion, usando su rol en switch
        /* PrimerEquipo      */ 
        /* SegundoEquipo   */ 
        
        switch(cases)
        {
            case 0:
                System.out.println("RIP esto nunca deberia ocurrir");
                break;
                
             // delantero   
            case 1:
               // System.out.println(PrimerEquipo.JugadoresActivos.get(sd).id + " delantero id");
                // Probabilidad de que tire 80
                if (Probabilidad(0))
                {
                    // probabilidad de malla
                    if (Probabilidad(PrimerEquipo.JugadoresActivos.get(index).skilloff-40)) 
                    {
                        int s = SegundoEquipo.JugadorEquipo("portero");
                        int sdd = SegundoEquipo.IndexDeJugador(s);
                        int por = SegundoEquipo.JugadoresActivos.get(sdd).skillpor-70;
                        if (por < 0)
                        {
                            por = 0;
                        }
                        
                        int pro = PrimerEquipo.JugadoresActivos.get(index).skilloff - por;
                        // probabilidad de gol
                        if (Probabilidad(pro)) 
                        {
                           PrimerEquipo.Puntuacion++;
                           int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("portero")); 
                           index = PrimerEquipo.IndexDeJugador(idd);
                           PrimerEquipo.JugadoresActivos.get(index).HasBall = false;                            
                           // averiguar si despues de gol es saque de centro o portero                                                     
                           SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                            
                           info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),null,0));
                        }
                        // lo agarro el portero
                        else 
                        {
                          int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("portero"));  
                          index = PrimerEquipo.IndexDeJugador(idd);
                          PrimerEquipo.JugadoresActivos.get(index).HasBall = false;                             
                          SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;                  
                          
                          info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),null,1));  
                        }
                        
                    }
                    // probabilidad de palo
                    else if (Probabilidad(5))
                    {
                        // sale del campo
                        if (Probabilidad(65)) 
                        {
                          int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("portero"));                 
                          index = PrimerEquipo.IndexDeJugador(idd);
                          PrimerEquipo.JugadoresActivos.get(index).HasBall = false;                           
                          SegundoEquipo.JugadoresActivos.get(sd).HasBall = true; 
                          
                          info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),null,2));  
                        } 
                        // gol de palo
                        else 
                        {
                            PrimerEquipo.Puntuacion++;
                            int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("portero"));        
                            index = PrimerEquipo.IndexDeJugador(idd);
                            PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                            // averiguar si despues de gol es saque de centro o portero 
                            SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                            
                            info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),null,3));
                        }                                             
                    }
                    
                    // no malla ni palo, saque de portero
                    else 
                    {   int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("portero"));   
                        index = PrimerEquipo.IndexDeJugador(idd);
                        PrimerEquipo.JugadoresActivos.get(index).HasBall = false;                          
                        SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;    
                        
                        info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),null,4));
                    }   
                }
                // pasa (deberia ser else if( 70%) con un else de falta)
                else 
                {
                    // si el pase fue bueno 50
                    if (Probabilidad(50)) 
                    {
                        int sd = PrimerEquipo.JugadorEquipo2("delantero",idd);
                        index = PrimerEquipo.IndexDeJugador(idd);
                        PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                        PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                        
                        info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                                PrimerEquipo.JugadoresActivos.get(sd),5));

                    }
                    // si fue fuera de campo
                    else 
                    {
                        int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("defensa"));
                        index = PrimerEquipo.IndexDeJugador(idd);
                        PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                        SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                         
                        info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                               SegundoEquipo.JugadoresActivos.get(sd),6));
                    }
                }
                
                break;  
                
            // centro
            case 2: 
                // probabilidad de pase hacia un delantero 85
                if (Probabilidad(100)) 
                {
                    
                    int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("delantero"));           
                    index = PrimerEquipo.IndexDeJugador(idd);
                    PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                    PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                    info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                                PrimerEquipo.JugadoresActivos.get(sd),5));
                    
                }
                // probablidad que le quiten la pelota             
                else if (Probabilidad(50)) 
                {
                    int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("delantero"));
                    index = PrimerEquipo.IndexDeJugador(idd);
                    PrimerEquipo.JugadoresActivos.get(index).HasBall = false;     
                    SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                                SegundoEquipo.JugadoresActivos.get(sd),6));
                    
                    // aqui va probabilidad de falta
                    
                    
                }
                // proabilidad que de un pase a un centro
                else
                {
                    int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("centro"));
                    index = PrimerEquipo.IndexDeJugador(idd);
                    PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                    PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                                PrimerEquipo.JugadoresActivos.get(sd),5));
                }
                break;  
                
             // defensa   
            case 3: 
                // probabilidad de pase hacia un centro
                if (Probabilidad(85)) 
                {
                    int sd = PrimerEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("centro"));
                    index = PrimerEquipo.IndexDeJugador(idd);
                    PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                    PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                                PrimerEquipo.JugadoresActivos.get(sd),5));
                    
                }                
                // proabilidad que de un pase a un defensa
                else
                {    
                    int sd = PrimerEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("defensa"));
                    index = PrimerEquipo.IndexDeJugador(idd);
                    PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                    PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                                PrimerEquipo.JugadoresActivos.get(sd),5));                    
                }  
                break;
                
            // potero    
            case 4:                
                // da pase a defensa
                int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("defensa"));
                index = PrimerEquipo.IndexDeJugador(idd);                
                PrimerEquipo.JugadoresActivos.get(index).HasBall = false;
                PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(index),
                        PrimerEquipo.JugadoresActivos.get(sd),5));
                break;
            
                       
        }
        
        
        
        
        
    } // accion de equipo 1
    
    public void action2() {
        
        // determinar cual es el index del jugador con la pelota
        int index = 0;
        for (int a = 0; a < SegundoEquipo.JugadoresActivos.size(); a++)
        {
            if (SegundoEquipo.JugadoresActivos.get(a).HasBall)
            {
                index = a;
            }
        }
        
        // ahora determinar su rol
        String pos = SegundoEquipo.JugadoresActivos.get(index).posicion;
        /*
        
        System.out.println(SegundoEquipo.JugadoresActivos.get(index).id + " id");
        System.out.println("");
       
        
        
        System.out.println(SegundoEquipo.JugadoresActivos.get(index).posicion);
        System.out.println("");
        */
        int idd = SegundoEquipo.JugadoresActivos.get(index).id;
        int cases = 0;
        if (idd == 0){System.out.println("RIP, esto nunca deberia ocurrir");}
        else if (pos.equals("delantero"))
        {
            cases = 1;
        }
        else if (pos.equals("centro"))
        {
            cases = 2;
        }
        else if (pos.equals("defensa"))
        {
            cases = 3;
        }
        else if (pos.equals("portero"))
        {
            cases = 4;
        }
        /*System.out.println(cases+ " cases");
        System.out.println("");*/
        
        
        
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
                    if (Probabilidad(SegundoEquipo.JugadoresActivos.get(index).skilloff-40)) 
                    {
                        int s = PrimerEquipo.JugadorEquipo("portero");
                        int sdd = PrimerEquipo.IndexDeJugador(s);
                        int por = PrimerEquipo.JugadoresActivos.get(sdd).skillpor-70;
                        if (por < 0)
                        {
                            por = 0;
                        }
                        
                        int pro = SegundoEquipo.JugadoresActivos.get(index).skilloff - por;
                        // probabilidad de gol
                        if (Probabilidad(pro)) 
                        {
                            SegundoEquipo.Puntuacion++;
                            int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("portero")); 
                            SegundoEquipo.JugadoresActivos.get(index).HasBall = false;                            
                            // averiguar si despues de gol es saque de centro o portero                                                     
                            PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                            
                            info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),null,0));
                        }
                        // lo agarro el portero
                        else 
                        {
                          int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("portero"));  
                          SegundoEquipo.JugadoresActivos.get(index).HasBall = false;                             
                          PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;                  
                          
                          info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),null,1));  
                        }
                        
                    }
                    // probabilidad de palo
                    else if (Probabilidad(5))
                    {
                        // sale del campo
                        if (Probabilidad(65)) 
                        {
                          int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("portero"));                         
                          SegundoEquipo.JugadoresActivos.get(index).HasBall = false;                           
                          PrimerEquipo.JugadoresActivos.get(sd).HasBall = true; 
                          
                          info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),null,2));  
                        } 
                        // gol de palo
                        else 
                        {
                            SegundoEquipo.Puntuacion++;
                            int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("portero"));                           
                            SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                            // averiguar si despues de gol es saque de centro o portero 
                            PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                            
                            info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),null,3));
                        }                                             
                    }
                    
                    // no malla ni palo, saque de portero
                    else 
                    {   int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("portero"));   
                        SegundoEquipo.JugadoresActivos.get(index).HasBall = false;                          
                        PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;    
                        
                        info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),null,4));
                    }   
                }
                // pasa (deberia ser else if( 70%) con un else de falta)
                else 
                {
                    // si el pase fue bueno
                    if (Probabilidad(50)) 
                    {
                        int sd = SegundoEquipo.JugadorEquipo2("delantero",index);
                        SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                        SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                        
                        info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                                SegundoEquipo.JugadoresActivos.get(sd),5));

                    }
                    // si fue fuera de campo
                    else 
                    {
                         int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("defensa"));
                         SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                         PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                         
                         info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                                PrimerEquipo.JugadoresActivos.get(sd),6));
                    }
                }
                
                break;  
                
            // centro
            case 2: 
                // probabilidad de pase hacia un delantero 85
                if (Probabilidad(85)) 
                {
                    int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("delantero")); // index de otro jugador
                    //
                    int sdd = SegundoEquipo.JugadoresActivos.get(sd).id;
                   /* System.out.println(sdd  + " sdd");
                    System.out.println("index " + idd); 
                    System.out.println("");               */ 
                    //
                    SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                    SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                    info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                                SegundoEquipo.JugadoresActivos.get(sd),5));
                    
                }
                // probablidad que le quiten la pelota             
                else if (Probabilidad(50)) 
                {
                    int sd = PrimerEquipo.IndexDeJugador(PrimerEquipo.JugadorEquipo("delantero"));
                    
                    SegundoEquipo.JugadoresActivos.get(index).HasBall = false;     
                    PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                                PrimerEquipo.JugadoresActivos.get(sd),6));
                    
                    // aqui va probabilidad de falta
                    
                    
                }
                // proabilidad que de un pase a un centro
                else
                {
                    int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("centro"));
                    SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                    SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                                SegundoEquipo.JugadoresActivos.get(sd),5));
                }
                break;  
                
             // defensa   
            case 3: 
                // probabilidad de pase hacia un centro
                if (Probabilidad(85)) 
                {
                    int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("centro"));
                    SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                    SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                                SegundoEquipo.JugadoresActivos.get(sd),5));
                    
                }                
                // proabilidad que de un pase a un defensa
                else
                {    
                    int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("defensa"));
                    SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                    SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                    info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                                SegundoEquipo.JugadoresActivos.get(sd),5));
                    
                }
                
                
                break;
                
            // potero    
            case 4:                
                // da pase a defensa
                int sd = SegundoEquipo.IndexDeJugador(SegundoEquipo.JugadorEquipo("defensa"));
                SegundoEquipo.JugadoresActivos.get(index).HasBall = false;
                SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;
                    
                info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(index),
                        SegundoEquipo.JugadoresActivos.get(sd),5));
                break;
            
                       
        }
        
        
        
        
        
    } // accion de equipo 2
    
    public void action(equipo A, equipo B) {
        // determinar cual es el id del jugador con la pelota
        int index = 0;
        for (int a = 0; a < A.JugadoresActivos.size(); a++)
        {
            if (A.JugadoresActivos.get(a).HasBall)
            {
                index = a;
            }
        }
        
        //
        int idd = A.JugadoresActivos.get(index).id;
        int cases = 0;
        if (idd == 0){System.out.println("RIP, esto nunca deberia ocurrir");}
        else if (A.JugadoresActivos.get(index).posicion.equals("delantero"))
        {
            cases = 1;
        }
        else if (A.JugadoresActivos.get(index).posicion.equals("centro"))
        {
            cases = 2;
        }
        else if (A.JugadoresActivos.get(index).posicion.equals("defensa"))
        {
            cases = 3;
        }
        else if (A.JugadoresActivos.get(index).posicion.equals("portero"))
        {
            cases = 4;
        }
        
        // ahora empieza la accion, usando su rol en switch
        /* PrimerEquipo      */ 
        /* SegundoEquipo   */ 
        
        index = A.IndexDeJugador(idd);
        switch(cases)
        {
            case 0:
                System.out.println("RIP esto nunca deberia ocurrir");
                break;
        
            // delantero   
            case 1:

                // Probabilidad de que tire 80
                if (Probabilidad(80))
                {
                    // probabilidad de malla
                    if (Probabilidad(A.JugadoresActivos.get(index).skilloff-40)) 
                    {
                        int s = B.JugadorEquipo("portero");
                        int sdd = B.IndexDeJugador(s);
                        int por = B.JugadoresActivos.get(sdd).skillpor-70;
                        if (por < 0 ){  por = 0; }
                        int pro = A.JugadoresActivos.get(index).skilloff - por;
                        
                        //Probabilidad de gol
                        if (Probabilidad(pro))
                        {
                            A.Puntuacion++;
                            int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                            index = A.IndexDeJugador(idd);
                            A.JugadoresActivos.get(index).HasBall = false;
                            B.JugadoresActivos.get(indez).HasBall = true;
                            index = A.IndexDeJugador(idd);
                            info.AddLog(StrParaLog(A.JugadoresActivos.get(index),null,0));
                        }
                        // lo agarro el portero
                        else 
                        {
                            int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                            index = A.IndexDeJugador(idd);
                            A.JugadoresActivos.get(index).HasBall = false;
                            B.JugadoresActivos.get(indez).HasBall = true;
                            info.AddLog(StrParaLog(A.JugadoresActivos.get(index),B.JugadoresActivos.get(indez),9));
                        }
                        
                        
                    }
                    // probabilidad de palo
                    else if (Probabilidad(15))
                    {
                        // sale del campo
                        if (Probabilidad(65)) 
                        {
                            int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                            index = A.IndexDeJugador(idd);
                            A.JugadoresActivos.get(index).HasBall = false;                           
                            B.JugadoresActivos.get(indez).HasBall = true;                           
                            info.AddLog(StrParaLog(A.JugadoresActivos.get(index),null,2));                              
                        }
                        // gol de palo
                        else 
                        {
                            A.Puntuacion++;
                            int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                            index = A.IndexDeJugador(idd);
                            A.JugadoresActivos.get(index).HasBall = false;
                            // averiguar si despues de gol es saque de centro o portero 
                            B.JugadoresActivos.get(indez).HasBall = true;                           
                            info.AddLog(StrParaLog(A.JugadoresActivos.get(index),null,3));
                            
                        }
                        
                    }
                    // no malla ni palo
                    else 
                    { 
                        int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                        index = A.IndexDeJugador(idd);
                        A.JugadoresActivos.get(index).HasBall = false;                          
                        B.JugadoresActivos.get(indez).HasBall = true;                            
                        info.AddLog(StrParaLog(A.JugadoresActivos.get(index),null,4));                        
                    }
                }
                //sino tira pasa, deberia ser else if con prob de falta
                else 
                {
                    // si el pase fue bueno 50
                    if (Probabilidad(50)) 
                    {
                        int indec = A.IndexDeJugador(A.JugadorEquipo2("delantero",idd));
                        index = A.IndexDeJugador(idd);
                        A.JugadoresActivos.get(index).HasBall = false;
                        A.JugadoresActivos.get(indec).HasBall = true;
                        
                        info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                                A.JugadoresActivos.get(indec),5));

                    }
                    // si fue fuera de campo
                    else 
                    {
                       int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                       index = A.IndexDeJugador(idd);
                       A.JugadoresActivos.get(index).HasBall = false;                          
                       B.JugadoresActivos.get(indez).HasBall = true;                            
                       info.AddLog(StrParaLog(A.JugadoresActivos.get(index),B.JugadoresActivos.get(indez),6)); 
                    }
                }
                break;               
            // centro    
            case 2: 
                // probablidad que le quiten la pelota             
                if (Probabilidad(50)) 
                {
                    int indez = B.IndexDeJugador(B.JugadorEquipo("centro"));
                    index = A.IndexDeJugador(idd);
                    A.JugadoresActivos.get(index).HasBall = false;     
                    B.JugadoresActivos.get(indez).HasBall = true;
                    
                    info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                                B.JugadoresActivos.get(indez),8));
                    
                    // aqui va probabilidad de falta 
                }
                // probabilidad de pase hacia un delantero
                else if (Probabilidad(85)) 
                {
                    
                    int indec = A.IndexDeJugador(A.JugadorEquipo2("delantero",idd));
                    index = A.IndexDeJugador(idd);
                    A.JugadoresActivos.get(index).HasBall = false;
                    A.JugadoresActivos.get(indec).HasBall = true;
                    info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                                A.JugadoresActivos.get(indec),5));
                    
                }
                // proabilidad que de un pase a un centro
                else
                {
                    int indec = A.IndexDeJugador(A.JugadorEquipo2("centro",idd));
                    index = A.IndexDeJugador(idd);
                    A.JugadoresActivos.get(index).HasBall = false;
                    A.JugadoresActivos.get(indec).HasBall = true;
                    info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                                A.JugadoresActivos.get(indec),5));
                }
                break;
            //defensa    
            case 3: 
                // prob de pasar a un centro
                if (Probabilidad(85)) 
                {
                    
                    int indec = A.IndexDeJugador(A.JugadorEquipo("centro"));
                    index = A.IndexDeJugador(idd);
                    A.JugadoresActivos.get(index).HasBall = false;
                    A.JugadoresActivos.get(indec).HasBall = true;
                    info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                                A.JugadoresActivos.get(indec),5));                  
                }
                // prob de pasar a un def
                else
                {
                    int indec = A.IndexDeJugador(A.JugadorEquipo2("defensa",idd));
                    index = A.IndexDeJugador(idd);
                    A.JugadoresActivos.get(index).HasBall = false;
                    A.JugadoresActivos.get(indec).HasBall = true;
                    info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                                A.JugadoresActivos.get(indec),5));
                    
                }
                break;
            // portero    
            case 4: 
                int indec = A.IndexDeJugador(A.JugadorEquipo2("defensa",idd));
                    index = A.IndexDeJugador(idd);
                    A.JugadoresActivos.get(index).HasBall = false;
                    A.JugadoresActivos.get(indec).HasBall = true;
                    info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                                A.JugadoresActivos.get(indec),5));
                break;               
        }  
    }
    
    public void inicio(){
    
        // si equipo 1 recibe la pelota 
        if (Probabilidad(100))
        {
            int sss = PrimerEquipo.JugadorEquipo("centro");
            int sd = PrimerEquipo.IndexDeJugador(sss);
            PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
            info.AddLog("El juego comienza hoy, un dia excelente y gracias a suerte en un tose de moneda " + PrimerEquipo.enombre + " le toca sacar.");
            info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(sd),null,7));
            
           
        }
        else 
        {
            // sd es index, sss es id
            int sss = SegundoEquipo.JugadorEquipo("centro");
            int sd = SegundoEquipo.IndexDeJugador(sss);
            SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;;
            info.AddLog("El juego comienza hoy, un dia excelente y gracias a suerte en un tose de moneda " + SegundoEquipo.enombre + " le toca sacar.");
            info.AddLog(StrParaLog(SegundoEquipo.JugadoresActivos.get(sd),null,7));
            
        }
    } // el primer saque
    
    public boolean Probabilidad(int porcentaje) {
    int randomNum = ThreadLocalRandom.current().nextInt(0,100); // es de 0 a 99 incluyendo 99
        //  || hay 100 numeros
        return randomNum < porcentaje;
    } // probabilidad de que algo suceda
    
    public String StrParaLog(player uno, player dos, int x) {
        /*
        x = 0 gol (1)
        x = 1 lo agarro el portero (1)
        x = 2 choca con palo y sale hacia afuera (1)
        x = 3 gol de palo (1)
        x = 4 tira, pero no entra a malla (1)
        
        x = 5 pase 
        x = 6 fuera de campo       
        x = 7 el primer saque
        x = 8 pasa, pero le quitaron la pelota
        
        x = 9 tira pero el portero lo agarra
        */
        String re;
        switch (x)
        {
            
            case 0:
                re = uno.nombre + " recibe la pelota, tira, y.... GOOOOL!!!";
                return re;
            case 1:
                re = uno.nombre + " recibe la pelota, tira... pero el portero contrario lo agarra!";
                return re;
            case 2:
                re = uno.nombre + " recibe la pelota, tira y... choca con el palo!... pero sale hacia afuera. ";
                return re;
            case 3: 
                re = uno.nombre + " recibe la pelota, tira y... choca con el palo!... y... GOOOOL!!! ";
                return re;
            case 4:
                re = uno.nombre + " recibe la pelota, tira... pero no entro a malla.";
                return re;
            case 5:
                re = uno.nombre +  " da un pase a " + dos.nombre;
                return re;
            case 6:
                re = uno.nombre + " pasa pero... es fuera de campo! ahora a " + dos.nombre +
                        " del otro equipo le toca sacar.";
                return re;
            case 7:
                re = uno.nombre + " recibe la pelota.";
                return re;                    
            case 8:
                re = uno.nombre + " da un pase, pero " + dos.nombre + " le quita la pelota.";
                return re;
            case 9:
                re = uno.nombre+  " recibe la pelota, tira y...." + dos.nombre + " lo agarra.";
                return re;
            default: return "rip nunca deberia ocurrir";
                
        }
        
    } // me tira el string que dice "el player 1 hizo algo player 2
    
    
}
//


//
class player
{
    int id;
    String nombre;
    String posicion;
    int skilloff; int skilldri; int skilldef;  int skillpor;
    boolean HasBall = false; // false hasta que empieza el juego
    
    public player (int pid, String pnombre, String pposicion, int pskilloff, int pskilldri, int pskilldef, int pskillpor) {
        // aqui se setean los valores iniciales, es el constructor
        id = pid;
        posicion = pposicion;
        skilloff = pskilloff;
        skilldri= pskilldri;
        skilldef = pskilldef;
        nombre = pnombre;
        skillpor = pskillpor;}
    
}
//


//
class equipo 
{
    int Localid;
    int Puntuacion = 0;
    List<player> Jugadores = new ArrayList(); // lista de 20 jugadores
    List<player> JugadoresActivos = new ArrayList(); // jugadores activos (11 jugadores)
    List<player> JugadoresBanca = new ArrayList(); // jugadores en banca (9 jugadores)
    int cambios = 0;
    String enombre;
    
    public equipo (int id, String nombre) {
        Localid = id;
        enombre = nombre;
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
   
    public boolean HasBall() {
        for (int a = 0; a< JugadoresActivos.size(); a++)
        {
            if (JugadoresActivos.get(a).HasBall)
            {
                return true;
            }
        }
        return false;
    } // me dice si el equipo tiene la pelota
    
    public int IndexDeJugador (int id) {
        for (int i = 0; i < JugadoresActivos.size(); i++)
        {
            if (JugadoresActivos.get(i).id == id)
            {
                return i;
            }   
        }

        return 3;
    } // dado el id me da el index de su ubicacion en la lista
    
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
        
    } 
    // me devuelve el id del jugador del equipo con la posicion y tomando en cuenta que no es el mismo del id otorgado
    
    public int JugadorEquipo (String posicion){
          List<player> sss = JugadoresActivos;
          Collections.shuffle(sss);
        for (int s = 0; s< sss.size(); s++)
        {
            if (sss.get(s).posicion.equals(posicion))
            {
                return sss.get(s).id;
            }      
        }
        System.out.println("RIP");
        return 1;
    
    } // me devuelve el id del jugador de la posicion como parametro (INCOMPLETO)
}
//


//
class informacion
{
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



