/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Dao.ConnexionBase;
import Modele.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Patient_Action {

    public void patient_Add(ConnexionBase connexion, Patient patient) {
        Connection connection = connexion.getConnection();
        String query = "INSERT INTO Patient (nom, prenom, age, sexe, adresse) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, patient.getNom());
            statement.setString(2, patient.getPrenom());
            statement.setInt(3, patient.getAge());
            statement.setString(4, patient.getSexe());
            statement.setString(5, patient.getAdresse());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void patient_Update(ConnexionBase connexion, int codeP, Patient patient) {
        Connection connection = connexion.getConnection();
        String query = "UPDATE Patient SET nom=?, prenom=?, age=?, sexe=?, adresse=? WHERE codeP=?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, patient.getNom());
            statement.setString(2, patient.getPrenom());
            statement.setInt(3, patient.getAge());
            statement.setString(4, patient.getSexe());
            statement.setString(5, patient.getAdresse());
            statement.setInt(6, codeP);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void patient_Del(ConnexionBase connexion, int codeP) {
        Connection connection = connexion.getConnection();
        String query = "DELETE FROM Patient WHERE codeP=?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codeP);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Patient patient_Find(ConnexionBase connexion, int codeP) {
        Connection connection = connexion.getConnection();
        String query = "SELECT * FROM Patient WHERE codeP=?";
        Patient patient = null;
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codeP);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                patient = new Patient(
                    resultSet.getInt("codeP"),
                    resultSet.getString("nom"),
                    resultSet.getString("prenom"),
                    resultSet.getInt("age"),
                    resultSet.getString("sexe"),
                    resultSet.getString("adresse")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return patient;
    }

    public List<Patient> patient_Liste(ConnexionBase connexion) {
        Connection connection = connexion.getConnection();
        String query = "SELECT * FROM Patient";
        List<Patient> patients = new ArrayList<>();
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                patients.add(new Patient(
                    resultSet.getInt("codeP"),
                    resultSet.getString("nom"),
                    resultSet.getString("prenom"),
                    resultSet.getInt("age"),
                    resultSet.getString("sexe"),
                    resultSet.getString("adresse")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return patients;
    }
}
