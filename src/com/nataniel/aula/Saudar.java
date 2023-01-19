package com.nataniel.aula;

import java.util.Calendar;
//import java.security.Timestamp;
//import java.util.Calendar;
//import java.util.Date;

public class Saudar{
        
        public static void Saudacao(){
            Calendar hora = Calendar.getInstance();
            int agora = hora.get(Calendar.HOUR_OF_DAY);
            //int agora = 20;
            if(agora <= 19 && agora >= 12)
                System.out.println("Boa tarde!");
            else if(agora > 19 || agora < 6)
                System.out.println("Boa noite!");
            else
                System.out.println("Bom dia!");
        }
    }