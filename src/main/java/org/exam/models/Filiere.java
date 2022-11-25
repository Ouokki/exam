package org.exam.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Filiere {
    private String nom;
    private String description;
    private Date dateAcreditation;

    private List<Module> listeDesModules;

    private List<Etudiant> listeDesEtudiants;

    public List<Module> getListeDesModules() {
        return listeDesModules;
    }

    public void setListeDesModules(List<Module> listeDesModules) {
        this.listeDesModules = listeDesModules;
    }

    public List<Etudiant> getListeDesEtudiants() {
        return listeDesEtudiants;
    }

    public void setListeDesEtudiants(List<Etudiant> listeDesEtudiants) {
        this.listeDesEtudiants = listeDesEtudiants;
    }

    public String getDateAcreditation() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/DD/yyyy");
        return (sdf.format(dateAcreditation)).toString();
    }

    public void setDateAcreditation(Date dateAcreditation) {
        this.dateAcreditation = dateAcreditation;
    }

    @Override
    public String toString(){
        return nom+" accréditée en "+dateAcreditation.toString()+" "+description;
    }
}
