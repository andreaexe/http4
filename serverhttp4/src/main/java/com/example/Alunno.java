package com.example;

public class Alunno {
    
   String nome;
   String cognome;
   int eta;

public Alunno(String nome, String cognome, int eta) {
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
}


public Alunno() {
    
}


public String getNome() {
    return nome;
}

public String getCognome() {
    return cognome;
}

public int getEta() {
    return eta;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setCognome(String cognome) {
    this.cognome = cognome;
}

public void setEta(int eta) {
    this.eta = eta;
} 

   
}
