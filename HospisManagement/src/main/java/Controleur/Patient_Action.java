/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Patient_Action {
    public void Patient_Add(Patient patient){
        String query = "INSERT INTO Patient (nom, prenom, age, sexe, adresse) VALUES (?, ?, ?, ?, ?)";
    }
        public void patient_Update(int codeP, Patient p) {
          String query = "UPDATE Patient SET nom=?, prenom=?, age=?, sexe=?, adresse=? WHERE codeP=?";   
        }
       public void patient_Del(int codeP)  {
        String query = "DELETE FROM Patient WHERE codeP=?";
       }
      public Patient patient_Find(int codeP)  {
        String query = "SELECT * FROM Patient WHERE codeP=?";
        return null;
      }
      public List<Patient> patient_Liste()  {
        List<Patient> patients = new ArrayList<>();
        String query = "SELECT * FROM Patient";
        return null;
      }
}
