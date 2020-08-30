package com.example.demo.patterns_meles_judit.builder;

import com.example.demo.patterns_meles_judit.builder.constructor.ConstructorMsj;
import com.example.demo.patterns_meles_judit.builder.constructor.ConstructorMsjConFormato;
import com.example.demo.patterns_meles_judit.builder.constructor.ConstructorMsjSinFirma;
import com.example.demo.patterns_meles_judit.builder.constructor.ConstructorMsjSinFormato;
import com.example.demo.patterns_meles_judit.builder.director.DirectorMensaje;

public class GestorEnvioMensajes {
    private DirectorMensaje directorMensaje;
    private ConstructorMsj constructorMsj;

    public void seleccionarTipoMsj(String tipoMsj){
        verificarTipoMsj(tipoMsj);
        directorMensaje = new DirectorMensaje(constructorMsj);
    }

    private void verificarTipoMsj(String tipoMsj){
        if("MENSAJE SIN FORMATO".equals(tipoMsj)) {
            constructorMsj = new ConstructorMsjSinFormato();
        } else if ("MENSAJE CON FORMATO".equals(tipoMsj)){
            constructorMsj = new ConstructorMsjConFormato();
        } else {
            constructorMsj = new ConstructorMsjSinFirma();
        }
    }

    public String obtenerMensaje(){
        return constructorMsj.obtenerMensaje();
    }
}
