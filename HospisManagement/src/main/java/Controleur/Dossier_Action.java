/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Dao.ConnexionBase;
import Modele.Dossier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dossier_Action {

    public void dossier_Add(ConnexionBase connexion, Dossier dossier) {
        Connection connection = connexion.getConnection();
        String query = "INSERT INTO Dossier (dateCreation, nature_Examen, Date_Examen, Observations, codeP) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDate(1, dossier.getDateCreation());
            statement.setString(2, dossier.getNatureExamen());
            statement.setDate(3, dossier.getDateExamen());
            statement.setString(4, dossier.getObservations());
            statement.setInt(5, dossier.getCodeP());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dossier_Update(ConnexionBase connexion, int Id, Dossier dossier) {
        Connection connection = connexion.getConnection();
        String query = "UPDATE Dossier SET dateCreation=?, nature_Examen=?, Date_Examen=?, Observations=?, codeP=? WHERE Id=?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDate(1, dossier.getDateCreation());
            statement.setString(2, dossier.getNatureExamen());
            statement.setDate(3, dossier.getDateExamen());
            statement.setString(4, dossier.getObservations());
            statement.setInt(5, dossier.getCodeP());
            statement.setInt(6, Id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dossier_Del(ConnexionBase connexion, int Id) {
        Connection connection = connexion.getConnection();
        String query = "DELETE FROM Dossier WHERE Id=?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, Id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Dossier dossier_Find(ConnexionBase connexion, int Id) {
        Connection connection = connexion.getConnection();
        String query = "SELECT * FROM Dossier WHERE Id=?";
        Dossier dossier = null;
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, Id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                dossier = new Dossier(
                    resultSet.getInt("Id"),
                    resultSet.getString("dateCreation"),
                    resultSet.getString("nature_Examen"),
                    resultSet.getString("Date_Examen"),
                    resultSet.getString("Observations"),
                    resultSet.getInt("codeP")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return dossier;
    }

    public List<Dossier> dossier_Liste(ConnexionBase connexion) {
        Connection connection = connexion.getConnection();
        String query = "SELECT * FROM Dossier";
        List<Dossier> dossiers = new ArrayList<>();
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                dossiers.add(new Dossier(
                    resultSet.getInt("Id"),
                    resultSet.getString("dateCreation"),
                    resultSet.getString("nature_Examen"),
                    resultSet.getString("Date_Examen"),
                    resultSet.getString("Observations"),
                    resultSet.getInt("codeP")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return dossiers;
    }
}
