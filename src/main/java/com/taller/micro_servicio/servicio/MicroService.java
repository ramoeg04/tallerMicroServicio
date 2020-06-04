package com.taller.micro_servicio.servicio;

import org.springframework.stereotype.Service;

@Service
public class MicroService {

    public String enviarMensaje(String mensaje){
        return mensaje;
    }

    //domain driven development
//    public String recibirMensaje (String recibir) {
//        return recibir;
//    }
}
