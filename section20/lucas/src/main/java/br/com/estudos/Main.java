package br.com.estudos;

import java.sql.Connection;

import br.com.estudos.db.DB;

public class Main {
    public static void main(String[] args) {
    
        Connection newConn = DB.getConnection();
        DB.closeConnection();
    }
}