/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class Dossier {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(String datecreation) {
        this.datecreation = datecreation;
    }

    public String getNature_examen() {
        return nature_examen;
    }

    public void setNature_examen(String nature_examen) {
        this.nature_examen = nature_examen;
    }

    public String getDate_examen() {
        return date_examen;
    }

    public void setDate_examen(String date_examen) {
        this.date_examen = date_examen;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getCodep() {
        return codep;
    }

    public void setCodep(int codep) {
        this.codep = codep;
    }

    public Dossier(String datecreation, String nature_examen, String date_examen, String observation, int codep) {
        this.datecreation = datecreation;
        this.nature_examen = nature_examen;
        this.date_examen = date_examen;
        this.observation = observation;
        this.codep = codep;
    }

    public Dossier(int id, String datecreation, String nature_examen, String date_examen, String observation, int codep) {
        this.id = id;
        this.datecreation = datecreation;
        this.nature_examen = nature_examen;
        this.date_examen = date_examen;
        this.observation = observation;
        this.codep = codep;
    }
    private int id;
    private String datecreation;
    private String nature_examen;
    private String date_examen;
    private String observation;
    private int codep;

    public Dossier() {
    }

    public String getNatureExamen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Date getDateCreation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Date getDateExamen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getObservations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodeP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
