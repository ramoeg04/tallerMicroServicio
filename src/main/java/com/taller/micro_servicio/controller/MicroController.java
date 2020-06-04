package com.taller.micro_servicio.controller;

import com.taller.micro_servicio.servicio.MicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/microServicio")
public class MicroController {

//        private static final Logger logger = LoggerFactory.getLogger(MicroController.class);

        @Autowired
        private MicroService microService;

        @PostMapping("/post")
        public String enviarMensaje() {
            String respuesta = microService.enviarMensaje("Hola");
            return respuesta;
        }

        @GetMapping("/get/{recibir}")
        public List<String> recibirMensaje(@PathVariable String recibir){
            List<String> result = new ArrayList<String>();
            result.add("Hola");
            result.add("oo");
           return result;
       }

    }
