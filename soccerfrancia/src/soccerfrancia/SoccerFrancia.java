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
        /*Button btn = new Button();
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
        primaryStage.show();*/
    }

    public static void main(String[] args) throws IOException {
        // esto empieza el programa
        juego prueba = new juego(1);
        prueba.boton();
        
        
 
    } 
}

//clase central donde se realiza el juego
class juego 
{
    //Variales publicas de la clase juego
    int kk;
    informacion info;
    equipo PrimerEquipo;
    equipo SegundoEquipo;
    boolean gg = false;
    Grafica zzz = new Grafica();
    String actualtiempo;
    String actualmarcador;

    
    public juego(int id) throws IOException {
        info = new informacion(1);
        kk = id;
        PrimerEquipo = new equipo(1, "Juventus");
        SegundoEquipo = new equipo(2, "Barcelona");   
        setplayers(PrimerEquipo, SegundoEquipo);
        PrimerEquipo.start();
        SegundoEquipo.start();
        zzz.setVisible(true);
        
        
        
    } // Metodo constructor     
    public void start() {
        
        Timer();
    }
    
    //Empieza el juego cuando se presiona start
    public void boton()
    {
       while (!zzz.pressed)
       {
           System.out.print("");
           if (zzz.pressed){
               
           break;}
       }
       start();
    };
    
    //Reinicia ciclo cuando se presiona restart
    public void reset()
    {
       while (!zzz.pressedrst)
       {
           System.out.print("");
           if (zzz.pressedrst){
               
           break;}
       }
       boton();
    };
    
    //Metodo donde se encuentran las info de los jugadores
    public static void setplayers(equipo uno, equipo dos) {
        uno.Jugadores.add(new player(1,"Cuadrado","delantero",70,50,20,0,15));     
        uno.Jugadores.add(new player(2,"Dybala","delantero",70,50,20,0,15));
        uno.Jugadores.add(new player(3,"Higuain","delantero",70,50,20,0,15));
        uno.Jugadores.add(new player(4,"Dybala","delantero",70,50,20,0,15));
        uno.Jugadores.add(new player(5,"Douglas Costa","delantero",70,50,20,0,15));
        uno.Jugadores.add(new player(6,"Pjaca","delantero",70,50,20,0,15));
        
        uno.Jugadores.add(new player(7,"Miralem Pjanic","centro",70,50,20,0,15));
        uno.Jugadores.add(new player(8,"Sami Khedira","centro",70,50,20,0,15));
        uno.Jugadores.add(new player(9,"Claudio Marchiso","centro",70,50,20,0,15));
        uno.Jugadores.add(new player(10,"Blaise Matuidi","centro",70,50,20,0,15));
        uno.Jugadores.add(new player(11,"Stefano Sturaro","centro",70,50,20,0,15));
        uno.Jugadores.add(new player(12,"Asamoah","centro",70,50,20,0,15));
        
        uno.Jugadores.add(new player(13,"Gigi Buffon","portero",70,50,20,90,15));
        uno.Jugadores.add(new player(14,"Carlo Pinsoglio","portero",70,50,20,0,15));
        uno.Jugadores.add(new player(15,"Wojciech Szczesny","portero",70,50,20,0,15));
        
        uno.Jugadores.add(new player(16,"Mattia De Sciglio","defensa",70,50,20,0,15));
        uno.Jugadores.add(new player(17,"Giorgio Chiellieni","defensa",70,50,20,0,15));
        uno.Jugadores.add(new player(18,"Medhi Benatia","defensa",70,50,20,0,15));
        uno.Jugadores.add(new player(19,"Alex Sandro","defensa",70,50,20,0,15));
        uno.Jugadores.add(new player(20,"Andrea Barzagli","defensa",70,50,20,0,15));
        
        
        
        // dos
        
        dos.Jugadores.add(new player(1,"Leo Messi","delantero",70,50,20,0,15));     
        dos.Jugadores.add(new player(2,"Dembele","delantero",70,50,20,0,15));
        dos.Jugadores.add(new player(3,"Luis Suarez","delantero",70,50,20,0,15));
        dos.Jugadores.add(new player(4,"Paco Alcazer","delantero",70,50,20,0,15));
        dos.Jugadores.add(new player(5,"Deulofeu","delantero",70,50,20,0,15));
        dos.Jugadores.add(new player(6,"Turan","delantero",70,50,20,0,15));
        
        dos.Jugadores.add(new player(7,"Iniesta","centro",70,50,20,0,15));
        dos.Jugadores.add(new player(8,"Busquets","centro",70,50,20,0,15));
        dos.Jugadores.add(new player(9,"Rakitic","centro",70,50,20,0,15));
        dos.Jugadores.add(new player(10,"Paulinho","centro",70,50,20,0,15));
        dos.Jugadores.add(new player(11,"Sergio Roberto","centro",70,50,20,0,15));
        dos.Jugadores.add(new player(12,"Rafinha","centro",70,50,20,0,15));
        
        dos.Jugadores.add(new player(13,"Ter Stegen","portero",70,50,20,90,15));
        dos.Jugadores.add(new player(14,"Cillissen","portero",70,50,20,80,15));
        dos.Jugadores.add(new player(15,"Omandi","portero",70,50,20,80,15));
        
        dos.Jugadores.add(new player(16,"Umtiti","defensa",70,50,20,0,15));
        dos.Jugadores.add(new player(17,"Pique","defensa",70,50,20,0,15));
        dos.Jugadores.add(new player(18,"Vermaleen","defensa",70,50,20,0,15));
        dos.Jugadores.add(new player(19,"Alba","defensa",70,50,20,0,15));
        dos.Jugadores.add(new player(20,"Semedo","defensa",70,50,20,0,15));
        
        
        
    } // crea los 20 jugadores por equipo
    //Tiempo en ue transcurre el juego
    public void Timer() {
         
        
         //ciclo de minutos
        int min; int seg;
        for (min = 0; min <= 89; min++) 
        {
            
            //ciclo de segundos
            for (seg = 0; seg <= 59; seg++)
            {
                info.minActual = min;                
                info.segActual = seg;
                String mintxt = String.format("%02d", min);
                String segtxt = String.format("%02d", seg);
                actualtiempo = mintxt+" : "+segtxt;
                String mar1txt = String.format("%02d", PrimerEquipo.Puntuacion);
                String mar2txt = String.format("%02d", SegundoEquipo.Puntuacion);
                actualmarcador = mar1txt+" || "+mar2txt;
                
                recorrido();
                DelaySegundo();  
                
                if (gg) {break;}
                
            }
            if (gg) {break;}           
        }
        String mintxt = String.format("%02d", 90);
        String segtxt = String.format("%02d", 0);
        actualtiempo = mintxt+" : "+segtxt;
        
        if (!gg)
        {
        info.minActual = 90;
        info.segActual = 00;
        recorrido();
        
        }
        
        PrimerEquipo.Puntuacion = 0;
        SegundoEquipo.Puntuacion = 0;
        zzz.pressed = false;
        zzz.pressedrst = false;
        zzz.juju();
        info.log.close();
        reset();
    } // Metodo timer que lleva el tiempo del juego
    
    //Hace delay al tiempo transcurrido en el tiempo
    public void DelaySegundo() {
        
        try {   
            Thread.sleep(1);    
        } catch(InterruptedException e){}
    } // Metodo que simula un seg de la vida real
    
    //Realiza los comentarios del log en base a probabilidades
    public void recorrido() {
        
        if (info.minActual == 0 && info.segActual == 0)
        {
            inicio();
        }
        else if (info.minActual == 45 && info.segActual == 0)
        {
            
            info.AddLog("-----MEDIO TIEMPO-----");
        }
        else if (info.minActual == 90 && info.segActual == 0)
        {
            
            info.AddLog("Se acabo el juego!");
            
            
            
            
            info.AddLog("El marcador final es: " + PrimerEquipo.Puntuacion + " a " + SegundoEquipo.Puntuacion);
            if (PrimerEquipo.Puntuacion > SegundoEquipo.Puntuacion)
            {
                
                
                info.AddLog("Gano " + PrimerEquipo.enombre);
            }
            else if (PrimerEquipo.Puntuacion < SegundoEquipo.Puntuacion)
            {
                
                info.AddLog("Gano " + SegundoEquipo.enombre);
            }
            else 
            {
                info.AddLog("Empate!");
            }
        }
        else if (!gg)
        {
            if (info.segActual == 0)
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
            
        }
        else 
        {
            info.AddLog("se acabo el juego... que tragedia RIP maldito gui att: lucas bai");
            if (SegundoEquipo.JugadoresActivos.size() < 7)
            {
                info.AddLog("por falta de jugadores causado por tarjetas roja, "+ SegundoEquipo.enombre + " Se retira de juego con mcha rabia") ;
                info.AddLog("Gana " + PrimerEquipo.enombre );
            }
            else 
            {
                info.AddLog("por falta de jugadores causado por tarjetas roja, "+ PrimerEquipo.enombre + " Se retira de juego con mcha rabia") ;
                info.AddLog("Gana " + SegundoEquipo.enombre );               
            }
        
        
        }
        
        //Llame a los metodos ue imprimen la info del juego en el visual
        zzz.jeje(info.actual);
        zzz.jaja(actualtiempo);
        zzz.jojo(actualmarcador);
       
    } // Metodo que dice que hacer
    
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
        if (idd == 0){System.out.println("RIP, esto nunca deberia ocurrir idd=0");}
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
        
        // CASOS ESPECIALES, ANTES DEL SWITCH 
       // CAMBIO
        if (A.Cambios < 3 && B.Cambios < 3)
        {
            if (info.minActual > 60)
            {
                if (Probabilidad(info.minActual-60))
                {
                    cases = -1;
                
                }
            }
        }
        
        // END CAMBIO
        
        // CORNER
        
        if (A.isCorner)
        {
            A.isCorner = false;
            // si el corner lo recibe el def del otro equipo 60
           if (Probabilidad(60))
           {
               // el defensa la ba a botar
               // probabilidad de que el pase es bueno 50
               if (Probabilidad(50))
               {
                   int indez = B.IndexDeJugador(B.JugadorEquipo("defensa"));
                   int indezz = B.IndexDeJugador(B.JugadorEquipo("centro"));
                   index = A.IndexDeJugador(idd);
                   A.JugadoresActivos.get(index).HasBall = false;
                   B.JugadoresActivos.get(indezz).HasBall = true;
                   info.AddLog(StrParaLog(A.JugadoresActivos.get(index),B.JugadoresActivos.get(indez),12) 
                           + " que immedeatamente la despeja! y es recibido por " + B.JugadoresActivos.get(indezz).nombre);
                   
                   
               }
               // probabilidad que salga del campo
               else if (Probabilidad(70))
               {
                   int indez = B.IndexDeJugador(B.JugadorEquipo("defensa"));
                   int indezz = A.IndexDeJugador(A.JugadorEquipo("centro"));
                   index = A.IndexDeJugador(idd);
                   A.JugadoresActivos.get(index).HasBall = false;
                   A.JugadoresActivos.get(indezz).HasBall = true;
                   info.AddLog(StrParaLog(A.JugadoresActivos.get(index),B.JugadoresActivos.get(indez),12) 
                           + " que immedeatamente la despeja! pero sale del campo, recibe la pelota " +  A.JugadoresActivos.get(indezz).nombre);
                   
                   
                   
               }
               // si un centro del otro equipo lo intercepta
               else
               {
                   int indez = B.IndexDeJugador(B.JugadorEquipo("defensa"));
                   int indezz = A.IndexDeJugador(A.JugadorEquipo("centro"));
                   index = A.IndexDeJugador(idd);
                   A.JugadoresActivos.get(index).HasBall = false;
                   A.JugadoresActivos.get(indezz).HasBall = true;
                   info.AddLog(StrParaLog(A.JugadoresActivos.get(index),B.JugadoresActivos.get(indez),12) 
                           + " que immedeatamente la despeja! pero el pase lo intercepta" +  A.JugadoresActivos.get(indezz).nombre);
                   
               }
               
               
           }
           // si el corner lo recibe un delantero y tira
           else 
           {
               // probabilidad de que falla, bola a portero
               if (Probabilidad(60))
               {
                   
                   int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                   int indezz = A.IndexDeJugador(A.JugadorEquipo("delantero"));
                   index = A.IndexDeJugador(idd);
                   A.JugadoresActivos.get(index).HasBall = false;
                   B.JugadoresActivos.get(indez).HasBall = true;
                   info.AddLog(StrParaLog(A.JugadoresActivos.get(index),A.JugadoresActivos.get(indezz),15));
                   
                   
                   
               }              
               // probabilidad que el portero lo agarre
               else if (Probabilidad(50))
               {
                   int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                   int indezz = A.IndexDeJugador(A.JugadorEquipo("delantero"));
                   index = A.IndexDeJugador(idd);
                   A.JugadoresActivos.get(index).HasBall = false;
                   B.JugadoresActivos.get(indez).HasBall = true;
                   info.AddLog(StrParaLog(A.JugadoresActivos.get(index),A.JugadoresActivos.get(indezz),14));
                   
                   
               }              
               // probabilidad de gol
               else 
               {
                   int indez = B.IndexDeJugador(B.JugadorEquipo("centro"));
                   int indezz = A.IndexDeJugador(A.JugadorEquipo("delantero"));
                   index = A.IndexDeJugador(idd);
                   A.JugadoresActivos.get(index).HasBall = false;
                   B.JugadoresActivos.get(indez).HasBall = true;
                   info.AddLog(StrParaLog(A.JugadoresActivos.get(index),A.JugadoresActivos.get(indezz),13));
                   
               }
           }
        }
         // END CORNER
        
        
        
        
        
        // END de casos especiales
        
         
        
        
        else {
        
        
        
        switch(cases)
        {
            case -1: 
                if (A.Cambios <3) 
                    {
                        List<String> p = new ArrayList();
                        p = A.CambioDePlayer(99);
                        info.log.println(p.get(0)+" es intercambiado por " + p.get(1));
                    }
                    else if (B.Cambios <3)
                    {
                        List<String> p = new ArrayList();
                        p = B.CambioDePlayer(99);
                        info.log.println(p.get(0)+" es intercambiado por " + p.get(1));
                    }
                    break;
            case 0:
                System.out.println("RIP esto nunca deberia ocurrir case 0");
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
                        int por = B.JugadoresActivos.get(sdd).skillpor-60;
                        if (por < 0 ){  por = 0; }
                        int pro = A.JugadoresActivos.get(index).skilloff - por;
                        
                        //Probabilidad de gol pro
                        if (Probabilidad(pro))
                        {
                            A.Puntuacion++;
                            int indez = B.IndexDeJugador(B.JugadorEquipo("centro"));
                            index = A.IndexDeJugador(idd);
                            A.JugadoresActivos.get(index).HasBall = false;
                            B.JugadoresActivos.get(indez).HasBall = true;
                            index = A.IndexDeJugador(idd);
                            info.AddLog(StrParaLog(A.JugadoresActivos.get(index),null,0));
                        }
                        // lo agarro el portero por + 20
                        else if (Probabilidad(por + 20))
                        {
                            int indez = B.IndexDeJugador(B.JugadorEquipo("portero"));
                            index = A.IndexDeJugador(idd);
                            A.JugadoresActivos.get(index).HasBall = false;
                            B.JugadoresActivos.get(indez).HasBall = true;
                            info.AddLog(StrParaLog(A.JugadoresActivos.get(index),B.JugadoresActivos.get(indez),9));
                        }
                        
                        // el portero le da, corner
                        else 
                        {
                            index = A.IndexDeJugador(idd);
                            A.isCorner = true;
                            info.AddLog(StrParaLog(A.JugadoresActivos.get(index),null,11));
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
                            int indez = B.IndexDeJugador(B.JugadorEquipo("centro"));
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
                else if (Probabilidad(50))
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
                // falta
                else
                {
                    // falta leve
                    if (Probabilidad(70))
                    {
                       int indez = B.IndexDeJugador(B.JugadorEquipo("defensa"));
                       index = A.IndexDeJugador(idd); 
                       B.JugadoresActivos.get(indez).FaltasLeve++;
                       
                       if (B.JugadoresActivos.get(indez).FaltasLeve > 3)
                       {
                            B.JugadoresActivos.get(indez).FaltasLeve = 0;
                            B.JugadoresActivos.get(indez).TarjetasAmarilla++;
                            if (B.JugadoresActivos.get(indez).TarjetasAmarilla > 2)
                            {
                                B.JugadoresActivos.get(indez).TarjetasAmarilla = 0;
                                info.AddLog("Falta leve de " +B.JugadoresActivos.get(indez).nombre + " con su historial en este juego, recibe tarjeta roja y es eliminado del campo!"
                                        + A.JugadoresActivos.get(index).nombre +" sigue con la pelota. " );
                                B.JugadoresActivos.remove(indez);
                                if (B.JugadoresActivos.size() < 7)
                                {
                                    gg = true;
                                }
                            }
                       }
                        
                        
                    }
                    // falta grave
                    else 
                    {
                        int indez = B.IndexDeJugador(B.JugadorEquipo("defensa"));
                        index = A.IndexDeJugador(idd);
                        if (A.Cambios <3)
                        {
                            
                        List<String> p = new ArrayList();
                        p = A.CambioDePlayer(idd);
                        info.log.println("Falta grave! "+p.get(0)+" es intercambiado por " + p.get(1)+ " ademas, por causar esta herida" 
                                + B.JugadoresActivos.get(indez).nombre + "es eliminado del campo.");
                            
                        }
                        else 
                        {
                            info.log.println("Falta grave! "+ "Al no tener mas cambios disponibles, "+ A.JugadoresActivos.get(index).nombre + " sale del campo"+" ademas, por causar esta herida" 
                                + B.JugadoresActivos.get(indez).nombre + "es eliminado del campo.");
                            
                            A.JugadoresActivos.remove(index);
                            if (A.JugadoresActivos.size() < 7)
                            {
                                gg = true;
                            }
                            
                        }
                        B.JugadoresActivos.remove(indez);
                        if (B.JugadoresActivos.size() < 7)
                            {
                                gg = true;
                            }                  
                    }  
                    
                }
                break;               
            // centro    
            case 2: 
                // probablidad que le quiten la pelota      
                int indez = B.IndexDeJugador(B.JugadorEquipo("centro"));
                if (Probabilidad(B.JugadoresActivos.get(indez).skilldri-30)) 
                {
                    indez = B.IndexDeJugador(B.JugadorEquipo("centro"));
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
                           
                // probabilidad que el portero de un pase bien a un defensa
                if (Probabilidad(80))
                {
                    int indec = A.IndexDeJugador(A.JugadorEquipo2("defensa",idd));
                        index = A.IndexDeJugador(idd);
                        A.JugadoresActivos.get(index).HasBall = false;
                        A.JugadoresActivos.get(indec).HasBall = true;
                        info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                            A.JugadoresActivos.get(indec),5));
                }
                
                // probabilidad que cuando el portero de un pase, se la quite un centro del otro equipo
                else if (Probabilidad(20))
                {
                indez = B.IndexDeJugador(B.JugadorEquipo("centro"));
                index = A.IndexDeJugador(idd);
                A.JugadoresActivos.get(index).HasBall = false;     
                B.JugadoresActivos.get(indez).HasBall = true;
                
                info.AddLog(StrParaLog(A.JugadoresActivos.get(index),
                    B.JugadoresActivos.get(indez),10));
                    
                
                }
                
                // probabilidad de que de un pase a un centro correctamente 
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
        } 
        }
    } // una accion
    
    public void inicio(){
      
    
        // si equipo 1 recibe la pelota 
        if (Probabilidad(100))
        {
            int sss = PrimerEquipo.JugadorEquipo("centro");
            int sd = PrimerEquipo.IndexDeJugador(sss);
            PrimerEquipo.JugadoresActivos.get(sd).HasBall = true;
            String s = "El juego comienza hoy, un dia excelente y gracias a suerte en un tose de moneda " + PrimerEquipo.enombre + " le toca sacar.";
            zzz.Log_Texto.setText(zzz.Log_Texto.getText() + "\r\n" + s);
            System.out.println(s);
            info.log.println(s);
            info.AddLog(StrParaLog(PrimerEquipo.JugadoresActivos.get(sd),null,7));
            
           
        }
        else 
        {
            // sd es index, sss es id
            int sss = SegundoEquipo.JugadorEquipo("centro");
            int sd = SegundoEquipo.IndexDeJugador(sss);
            SegundoEquipo.JugadoresActivos.get(sd).HasBall = true;;
            String sdd = "El juego comienza hoy, un dia excelente y gracias a suerte en un tose de moneda " + SegundoEquipo.enombre + " le toca sacar.";
            zzz.Log_Texto.setText(zzz.Log_Texto.getText() + "\r\n" + sdd);
            System.out.println(sdd);
            info.log.println(sdd);
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
        x = 10 el portero saca pero el centro del otro equipo recupera
        
        corners
        
        x = 11 el portero le da, es corner (1)
        x = 12 el del saca y el def lo bota, lo recibe el centro

        
        
        x = 13 el del saca, del recibe y gol
        x = 14 el del saca, del recibe y portero atrapa
        x = 15 el del saca, del recibe y falla 
        
       
        */
        String re;
        //Comentarios del juego
        switch (x)
        {
            
            case 0:
                re = " El jugador "+ uno.nombre + " recibe el balon, chuta el balon  y GOOOOOOOOOOOOOOOOOOL!!!";
                return re;
            case 1:
                re = uno.nombre + " recibe la pelota, tira... pero el portero contrario atrapa el balon sin problemas.";
                return re;
            case 2:
                re = uno.nombre + " recibe la pelota, tira y LE DA AL PALOOOOO!... el balon salie hacia afuera, saque de arco. ";
                return re;
            case 3: 
                re = uno.nombre + " recibe la pelota, tira y... choca con el palo y sale hacia afuera, pero " + uno.nombre + " Le pega al rebote y GOOOOOOOOOOL!";
                return re;
            case 4:
                re = uno.nombre + " recibe la pelota, tira... pero se dirije afuera del arco... pelota larga....";
                return re;
            case 5:
                re = uno.nombre +  " da un pase a " + dos.nombre;
                return re;
            case 6:
                re = uno.nombre + " pasa pero... es fuera de juego! ahora le toca sacar a " + dos.nombre +
                        " del equipo contrario.";
                return re;
            case 7:
                re = uno.nombre + " recibe la pelota.";
                return re;                    
            case 8:
                re = uno.nombre + " da un pase, pero " + dos.nombre + " le intercepta la pelota.";
                return re;
            case 9:
                re = uno.nombre+  " recibe la pelota, tira a PUERTAAAA... Pero " + dos.nombre + " lo ataja.";
                return re;
            case 10:
                re = uno.nombre + " Da un pase largo, pero... " + dos.nombre + " del otro equipo, lo recupera!";
                return re;               
            case 11:
                re = uno.nombre + " recibe la pelota, tira y... el portero con mucho esfuerzo le desvia el disparo, es tiro de esquina!";
                return re;               
            case 12:
                re = uno.nombre + " le toca sacar de corner, este intenta pasar hacia el centro... pero es interceptado por " + dos.nombre;
                return re;    
            case 13: 
                re = uno.nombre + " saca de corner, " + dos.nombre + " le da con la cabeza! y.. GOOOOOL!!!!!!";
                return re;
            case 14:
                re = uno.nombre + " saca de corner, " + dos.nombre + " le da con la cabeza! y.. el portero lo agarra!";
                return re;
            case 15:
                re = uno.nombre + " saca de corner, " + dos.nombre + " le da DE CHILENAAA Y!!! .. falla, bola a portero";
                return re;
            default: return "rip nunca deberia ocurrir no case, default";
                
        }
        
    } // me tira el string que dice "el player 1 hizo algo player 2
    
    
}
//


//Metodo con info de los jugadores
class player
{
    int id;   
    String nombre;
    String posicion;
    int skilloff; int skilldri; int skilldef;  int skillpor;
    boolean HasBall = false; // false hasta que empieza el juego
    int idvisual;
    int FaltasLeve = 0;
    int TarjetasAmarilla = 0;
    
    public player (int pid, String pnombre, String pposicion, int pskilloff, int pskilldri, int pskilldef, int pskillpor, int pidvisual) {
        // aqui se setean los valores iniciales, es el constructor
        id = pid;
        posicion = pposicion;
        skilloff = pskilloff;
        skilldri= pskilldri;
        skilldef = pskilldef;
        nombre = pnombre;
        skillpor = pskillpor;
        idvisual = pidvisual;
    }
        
    
}
//


//info de los equipos
class equipo 
{
    boolean isCorner = false; // para dar corners
    int Localid;
    int Puntuacion = 0;
    List<player> Jugadores = new ArrayList(); // lista de 20 jugadores
    List<player> JugadoresActivos = new ArrayList(); // jugadores activos (11 jugadores)
    List<player> JugadoresBanca = new ArrayList(); // jugadores en banca (9 jugadores)
    int Cambios = 0;
    String enombre;
    
    public equipo (int id, String nombre) {
        Localid = id;
        enombre = nombre;
    }
    
    public void start() {
        CrearEquipoActivo();
        CrearBanca();
    }
    
    public void CrearEquipoActivo() {
        
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
        int s = 0;
        for (int a = 0; a < 20; a++)
        {
            if (!JugadoresActivos.contains(Jugadores.get(a)))
            {
                JugadoresBanca.add(Jugadores.get(a));
                
            }
            
        }
        Collections.shuffle(JugadoresBanca);
        
    } // crea la banca
   
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
        System.out.println("RIP jugactivos2");      
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
        System.out.println("RIP jugequipo");
        return 1;
    
    } // me devuelve el id del jugador de la posicion como parametro (INCOMPLETO)
    
    public List<String> CambioDePlayer (int id) {
        int p = 0;
        // si el jugador es aleatorio
        if (id == 99)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(0,11);
            p = JugadoresActivos.get(randomNum).id;
        }
        // sino
        else 
        {
            p = id;
        }
        
        int index = IndexDeJugador(p);
        String pos = JugadoresActivos.get(index).posicion;
        
        
        while (JugadoresActivos.get(index).HasBall)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(0,11);
            p = JugadoresActivos.get(randomNum).id;
            index = IndexDeJugador(p);
        }
        
        int id2 = 0;
        // determinar id de jugador con la misma posicion en jugador banca
        for (int a = 0; a < JugadoresBanca.size(); a++)
        {
            if (JugadoresBanca.get(a).posicion.equals(pos))
            {
                id2 = JugadoresBanca.get(a).id;
                
            }
        }
        
        index = IndexDeJugador(p);
        String nombre1 = JugadoresActivos.get(index).nombre;
        JugadoresBanca.add(JugadoresActivos.get(index));
        JugadoresActivos.remove(index); 
        
        int index2 = 0;      
        for (int a = 0; a < JugadoresBanca.size(); a++)
        {
            if (JugadoresBanca.get(a).id == id2)
            {
                index2 = a;
                
            }
        }
        String nombre2 = JugadoresBanca.get(index2).nombre;
        JugadoresActivos.add(JugadoresBanca.get(index2));
        JugadoresBanca.remove(index2);
        List<String> list = new ArrayList();
        list.add(nombre1);
        list.add(nombre2);
        return list;
    } // saca de activos y mete en banca y viceversa, id 99 = random::: nombre 1 es el entrando, nombre 2 es el saliendo
}
//


//Agrega info de tiempo marcador y comentarios en el log
class informacion
{
    int kk;
    int minActual;
    int segActual;
    PrintWriter log = new PrintWriter("log.txt");
    String actual;
    //String actualmarcador;
    
    
    
    public informacion (int id) throws IOException {
        kk=id;
        log.println("HEY SUP BITCHES");
        
        
 
    }
    
    public void AddLog(String accion) {
        
        
  
        
        String mintxt = String.format("%02d", minActual);
        String segtxt = String.format("%02d", segActual);
        
        actual = "["+mintxt+":"+segtxt+ "] -> " + accion;   
        System.out.println("["+mintxt+":"+segtxt+ "] -> " + accion);
        log.println("["+mintxt+":"+segtxt+ "] -> " + accion);
       
        // 
    }
}



