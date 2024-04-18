/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Dossier;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Dossier_Action {
    public void dossier_Add(Dossier dossier) {
        String query = "INSERT INTO Dossier (dateCreation, nature_Examen, Date_Examen, Observations, codeP) VALUES (?, ?, ?, ?, ?)";
    }
    public void dossier_Update(int Id, Dossier dossier){
        String query = "UPDATE Dossier SET dateCreation=?, nature_Examen=?, Date_Examen=?, Observations=?, codeP=? WHERE Id=?";
    }
     public void dossier_Del(int Id){
         String query = "DELETE FROM Dossier WHERE Id=?";
     }
     public Dossier dossier_Find(int Id){
          String query = "SELECT * FROM Dossier WHERE Id=?";
        return null;
     }
     public List<Dossier> dossier_Liste(){
         List<Dossier> dossiers = new ArrayList<>();
        String query = "SELECT * FROM Dossier";
        return null;
     }
}
