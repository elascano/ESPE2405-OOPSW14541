/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soccerteams;

/**
 *
 * @author G406
 */
public class SoccerTeams {

    public static void main(String[] args) {
       String uri = "tu_uri_de_mongodb_atlas";

        TeamDatabase db = new TeamDatabase(uri);
        
        // Crear un nuevo equipo
        Team newTeam = new Team(1, "FC Barcelona", "A professional football club based in Barcelona", 10, 20);
        db.createTeam(newTeam);

        db.close();
    }
}
