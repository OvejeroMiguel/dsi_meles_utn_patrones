package com.example.demo.patterns_meles_judit.singleton;

public class DbConnection {
    private static DbConnection dbConnection;
    private String cadenaDeconexion;

    private DbConnection(String cadenaDeconexion) {
        this.cadenaDeconexion = cadenaDeconexion;
    }

    public static DbConnection getInstancia(String mensaje){
        if(dbConnection == null) {
            dbConnection = new DbConnection(mensaje);
        };
        return dbConnection;
    }

    public String getCadenaDeconexion() {
        return cadenaDeconexion;
    }

    public void setCadenaDeconexion(String cadenaDeconexion) {
        this.cadenaDeconexion = cadenaDeconexion;
    }
}
