package org.exam.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Etudiant {
    private String cne;
    private String nom;
    private String prenom;
    private Date dateNaissance;

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getDateNaissance() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/DD/yyyy");
        return (sdf.format(dateNaissance)).toString();

    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Etudiant(String cne, String nom, String prenom) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString(){
        return nom+prenom+", "+cne+", né le "+dateNaissance;
    }

    public boolean equals(Etudiant etudiant){
        if(etudiant != null){
            if(etudiant.getCne().equals(cne) && etudiant.getDateNaissance().equals(dateNaissance))
                return true;
        }
        return false;
    }
}
