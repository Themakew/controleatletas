package model;

import java.util.ArrayList;

public class Judoca extends Atleta {

    private String classes; // Mirim Aspirante, Infantil Aspirante, Infanto Juvenil Aspirante, Pré Juvenil Aspirante, 
    //Juvenil Aspirante, Adulto Aspirante, Pré-Juvenil Especial, Juvenil Especial, Adulto Especial
    private char estiloPredominante; // O=Ortodoxo(destro) S=Southpaw(canhoto)
    private ArrayList<Premiacao> premiacoes;
    private String faixa; // Em cm  --- colocar cor da faixa---
    private int totalLutas;
    private int totalVitorias;
    private int totalVitoriasIppon;
    private int totalEmpates;
    private int totalDerrotas;
    private int totalDesistencias;

    public Judoca(String nome, String sexo) {
        super(nome,sexo);
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getTotalDesistencias() {
        return totalDesistencias;
    }

    public void setTotalDesistencias(int desistencias) {
        this.totalDesistencias = desistencias;
    }

    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int empates) {
        this.totalEmpates = empates;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

    public char getEstiloPredominante() {
        return estiloPredominante;
    }

    public void setEstiloPredominante(char estiloPredominante) {
        this.estiloPredominante = estiloPredominante;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int numLutas) {
        this.totalLutas = numLutas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int vitorias) {
        this.totalVitorias = vitorias;
    }

    public int getTotalVitoriasIppon() {
        return totalVitoriasIppon;
    }

    public void setTotalVitoriasNocaute(int vitoriasIppon) {
        this.totalVitoriasIppon = vitoriasIppon;
    }

    public String obterCategoriaPesoNome() {
        return obterCategoriaPesoNome(this.getClasses(), this.getPeso(), this.getSexo());
    }

    // possivel metodo para o sexo 
    public static String obterCategoriaPesoNome(String classes, double peso, String sexo) {   
        if (classes.equals("Mirim Aspirante")) {
            return obterCategoriaAspirantePesoMirim(peso,sexo);
        } else if (classes.equals("Infantil Aspirante")) {
            return obterCategoriaAspirantePesoInfantil(peso,sexo);
        } else if (classes.equals("Infanto Juvenil Aspirante")){
            return obterCategoriaAspirantePesoInfantoJuvenil(peso,sexo);
        } else if (classes.equals("Pré Juvenil Aspirante")){
            return obterCategoriaAspirantePesoPreJuvenil(peso,sexo);
        } else if (classes.equals("Juvenil Aspirante")){
            return obterCategoriaAspirantePesoJuvenil(peso,sexo);
        } else if (classes.equals("Adulto Aspirante")){
            return obterCategoriaAspirantePesoAdulto(peso,sexo);
        } else if (classes.equals("Pré Juvenil Especial")){
            return obterCategoriaEspecialPesoPreJuvenil(peso,sexo);
        } else if (classes.equals("Juvenil Especial")){
            return obterCategoriaEspecialPesoJuvenil(peso,sexo);
        } else if (classes.equals("Junior Especial")){
            return obterCategoriaEspecialPesoJunior(peso,sexo);
        } else if (classes.equals("Senior Especial")){
            return obterCategoriaEspecialPesoSenior(peso,sexo);
        } else {
            return "";
        }
   }
    
    private static String obterCategoriaAspirantePesoAdulto(double peso,String sexo) {
        if(sexo.equals("M")){
        if (peso <= 55) {
            return "S. Ligeiro";
        } else if (peso > 55 && peso <=60) {
            return "Ligeiro";
        } else if (peso > 60 && peso <= 66) {
            return "M. Leve";
        } else if (peso > 66 && peso <= 73) {
            return "Leve";
        } else if (peso > 73 && peso <= 81) {
            return "M. médio";
        } else if (peso > 81 && peso <= 90) {
            return "Médio";
        } else if (peso > 90 && peso <= 100) {
            return "M. Pesado";
        } else if(peso>100){
            return "Pesado";
        } else{
            return "";
        }
      }
        else{
          if (peso <= 44) {
            return "S. Ligeiro";
        } else if (peso > 44 && peso <=48) {
            return "Ligeiro";
        } else if (peso > 48 && peso <= 52) {
            return "M. Leve";
        } else if (peso > 52 && peso <= 57) {
            return "Leve";
        } else if (peso > 57 && peso <= 63) {
            return "M. médio";
        } else if (peso > 63 && peso <= 70) {
            return "Médio";
        } else if (peso > 70 && peso <= 78) {
            return "M. Pesado";
        } else if(peso > 78){
            return "Pesado";
        } else{
            return "";
        }           
      }
    }

    private static String obterCategoriaAspirantePesoInfantil(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 28) {
            return "S. Ligeiro";
        } else if (peso > 28 && peso <=30) {
            return "Ligeiro";
        } else if (peso > 30 && peso <= 33) {
            return "M. Leve";
        } else if (peso > 33 && peso <= 36) {
            return "Leve";
        } else if (peso > 36 && peso <= 40) {
            return "M. médio";
        } else if (peso > 40 && peso <= 45) {
            return "Médio";
        } else if (peso > 45 && peso <= 50) {
            return "M. Pesado";
        } else if (peso > 50 && peso <= 55) {
            return "Pesado";
        } else if (peso > 55 && peso <= 60) {
            return "S. Pesado";
        } else if(peso > 60){
            return "E. pesado";
        }else{
            return "";
        }
      }else{
            if (peso <= 26) {
            return "S. Ligeiro";
        } else if (peso > 26 && peso <=28) {
            return "Ligeiro";
        } else if (peso > 28 && peso <= 30) {
            return "M. Leve";
        } else if (peso > 30 && peso <= 33) {
            return "Leve";
        } else if (peso > 33 && peso <= 36) {
            return "M. médio";
        } else if (peso > 36 && peso <= 40) {
            return "Médio";
        } else if (peso > 40 && peso <= 45) {
            return "M. Pesado";
        } else if(peso > 45 && peso <= 50){
            return "Pesado";
        } else if (peso > 50){
            return "S. Pesado";
        } else {
            return "";
        }
        }
    }
    
    private static String obterCategoriaAspirantePesoMirim(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 23) {
            return "S. Ligeiro";
        } else if (peso > 23 && peso <=26) {
            return "Ligeiro";
        } else if (peso > 26 && peso <= 29) {
            return "M. Leve";
        } else if (peso > 29 && peso <= 32) {
            return "Leve";
        } else if (peso > 32 && peso <= 36) {
            return "M. médio";
        } else if (peso > 36 && peso <= 40) {
            return "Médio";
        } else if (peso > 40 && peso <= 45) {
            return "M. Pesado";
        } else if (peso > 45 && peso <= 50) {
            return "Pesado";
        } else if(peso > 50) {
            return "S. pesado";
        } else{
            return "";
        }
        }else{
            if (peso <= 23) {
            return "S. Ligeiro";
        } else if (peso > 23 && peso <=26) {
            return "Ligeiro";
        } else if (peso > 26 && peso <= 29) {
            return "M. Leve";
        } else if (peso > 29 && peso <= 32) {
            return "Leve";
        } else if (peso > 32 && peso <= 36) {
            return "M. médio";
        } else if (peso > 36 && peso <= 40) {
            return "Médio";
        } else if (peso > 40 && peso <= 45) {
            return "M. Pesado";
        } else if(peso > 45 && peso <= 50){
            return "Pesado";
        } else if (peso > 50){
            return "S. Pesado";
        } else {
            return "";
        }
    }
}
    
    private static String obterCategoriaAspirantePesoInfantoJuvenil(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 28) {
            return "S. Ligeiro";
        } else if (peso > 28 && peso <=31) {
            return "Ligeiro";
        } else if (peso > 31 && peso <= 34) {
            return "M. Leve";
        } else if (peso > 34 && peso <= 38) {
            return "Leve";
        } else if (peso > 38 && peso <= 42) {
            return "M. médio";
        } else if (peso > 42 && peso <= 47) {
            return "Médio";
        } else if (peso > 47 && peso <= 52) {
            return "M. Pesado";
        } else if(peso > 52){
            return "Pesado";
        } else {
            return "";
        }
      }else{
            if (peso <= 28) {
            return "S. Ligeiro";
        } else if (peso > 28 && peso <=31) {
            return "Ligeiro";
        } else if (peso > 31 && peso <= 34) {
            return "M. Leve";
        } else if (peso > 34 && peso <= 38) {
            return "Leve";
        } else if (peso > 38 && peso <= 42) {
            return "M. médio";
        } else if (peso > 42 && peso <= 47) {
            return "Médio";
        } else if (peso > 47 && peso <= 52) {
            return "M. Pesado";
        } else if(peso > 52){
            return "Pesado";
        } else {
            return "";
        }
    }
}
    
    private static String obterCategoriaAspirantePesoPreJuvenil(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 36) {
            return "S. Ligeiro";
        } else if (peso > 36 && peso <=40) {
            return "Ligeiro";
        } else if (peso > 40 && peso <= 44) {
            return "M. Leve";
        } else if (peso > 44 && peso <= 48) {
            return "Leve";
        } else if (peso > 48 && peso <= 53) {
            return "M. médio";
        } else if (peso > 53 && peso <= 58) {
            return "Médio";
        } else if (peso > 58 && peso <= 64) {
            return "M. Pesado";
        } else if (peso > 64){
            return "Pesado";
        } else {
            return "";
        }
      }else{
            if (peso <= 36) {
            return "S. Ligeiro";
        } else if (peso > 36 && peso <=40) {
            return "Ligeiro";
        } else if (peso > 40 && peso <= 44) {
            return "M. Leve";
        } else if (peso > 44 && peso <= 48) {
            return "Leve";
        } else if (peso > 48 && peso <= 53) {
            return "M. médio";
        } else if (peso > 53 && peso <= 58) {
            return "Médio";
        } else if (peso > 58 && peso <= 64) {
            return "M. Pesado";
        } else if(peso > 64){
            return "Pesado";
        } else {
            return "";
        }
    }
}
        
    private static String obterCategoriaAspirantePesoJuvenil(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 50) {
            return "S. Ligeiro";
        } else if (peso > 50 && peso <=55) {
            return "Ligeiro";
        } else if (peso > 55 && peso <= 60) {
            return "M. Leve";
        } else if (peso > 60 && peso <= 66) {
            return "Leve";
        } else if (peso > 66 && peso <= 73) {
            return "M. médio";
        } else if (peso > 73 && peso <= 81) {
            return "Médio";
        } else if (peso > 81 && peso <= 90) {
            return "M. Pesado";
        } else {
            return "Pesado";
        } 
      }else{
            if (peso <= 40) {
            return "S. Ligeiro";
        } else if (peso > 40 && peso <=44) {
            return "Ligeiro";
        } else if (peso > 44 && peso <= 48) {
            return "M. Leve";
        } else if (peso > 48 && peso <= 52) {
            return "Leve";
        } else if (peso > 52 && peso <= 57) {
            return "M. médio";
        } else if (peso > 57 && peso <= 53) {
            return "Médio";
        } else if (peso > 63 && peso <= 70) {
            return "M. Pesado";
        } else if(peso > 70){
            return "Pesado";
        } else {
            return "";
        }
    }
 }
        
    private static String obterCategoriaEspecialPesoPreJuvenil(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 36) {
            return "S. Ligeiro";
        } else if (peso > 36 && peso <=40) {
            return "Ligeiro";
        } else if (peso > 40 && peso <= 44) {
            return "M. Leve";
        } else if (peso > 44 && peso <= 48) {
            return "Leve";
        } else if (peso > 48 && peso <= 53) {
            return "M. médio";
        } else if (peso > 53 && peso <= 58) {
            return "Médio";
        } else if (peso > 58 && peso <= 64) {
            return "M. Pesado";
        } else if (peso > 64){
            return "Pesado";
        } else{
            return "";
        }
      }else{
            if (peso <= 36) {
            return "S. Ligeiro";
        } else if (peso > 36 && peso <=40) {
            return "Ligeiro";
        } else if (peso > 40 && peso <= 44) {
            return "M. Leve";
        } else if (peso > 44 && peso <= 48) {
            return "Leve";
        } else if (peso > 48 && peso <= 53) {
            return "M. médio";
        } else if (peso > 53 && peso <= 58) {
            return "Médio";
        } else if (peso > 58 && peso <= 64) {
            return "M. Pesado";
        } else if(peso > 64){
            return "Pesado";
        } else {
            return "";
        }
    }
 }
        
    private static String obterCategoriaEspecialPesoJuvenil(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 50) {
            return "S. Ligeiro";
        } else if (peso > 50 && peso <=55) {
            return "Ligeiro";
        } else if (peso > 55 && peso <= 60) {
            return "M. Leve";
        } else if (peso > 60 && peso <= 66) {
            return "Leve";
        } else if (peso > 66 && peso <= 73) {
            return "M. médio";
        } else if (peso > 73 && peso <= 81) {
            return "Médio";
        } else if (peso > 81 && peso <= 90) {
            return "M. Pesado";
        } else if (peso > 90){
            return "Pesado";
        } else{
            return "";
        }
      }else{
            if (peso <= 40) {
            return "S. Ligeiro";
        } else if (peso > 40 && peso <=44) {
            return "Ligeiro";
        } else if (peso > 44 && peso <= 48) {
            return "M. Leve";
        } else if (peso > 48 && peso <= 52) {
            return "Leve";
        } else if (peso > 52 && peso <= 57) {
            return "M. médio";
        } else if (peso > 57 && peso <= 63) {
            return "Médio";
        } else if (peso > 63 && peso <= 70) {
            return "M. Pesado";
        } else if(peso > 70){
            return "Pesado";
        } else {
            return "";
        }
     }
 }
        
    private static String obterCategoriaEspecialPesoJunior(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 55) {
            return "S. Ligeiro";
        } else if (peso > 55 && peso <=60) {
            return "Ligeiro";
        } else if (peso > 60 && peso <= 66) {
            return "M. Leve";
        } else if (peso > 66 && peso <= 73) {
            return "Leve";
        } else if (peso > 73 && peso <= 81) {
            return "M. médio";
        } else if (peso > 81 && peso <= 90) {
            return "Médio";
        } else if (peso > 90 && peso <= 100) {
            return "M. Pesado";
        } else {
            return "Pesado";
        } 
      }else{
            if (peso <= 44) {
            return "S. Ligeiro";
        } else if (peso > 44 && peso <=48) {
            return "Ligeiro";
        } else if (peso > 48 && peso <= 52) {
            return "M. Leve";
        } else if (peso > 52 && peso <= 57) {
            return "Leve";
        } else if (peso > 57 && peso <= 63) {
            return "M. médio";
        } else if (peso > 63 && peso <= 70) {
            return "Médio";
        } else if (peso > 70 && peso <= 78) {
            return "M. Pesado";
        } else if(peso > 78){
            return "Pesado";
        } else {
            return "";
        }
    }
  }
    
    private static String obterCategoriaEspecialPesoSenior(double peso, String sexo) {
        if(sexo.equals("M")){
        if (peso <= 55) {
            return "S. Ligeiro";
        } else if (peso > 55 && peso <=60) {
            return "Ligeiro";
        } else if (peso > 60 && peso <= 66) {
            return "M. Leve";
        } else if (peso > 66 && peso <= 73) {
            return "Leve";
        } else if (peso > 73 && peso <= 81) {
            return "M. médio";
        } else if (peso > 81 && peso <= 90) {
            return "Médio";
        } else if (peso > 90 && peso <= 100) {
            return "M. Pesado";
        } else {
            return "Pesado";
        } 
      }else{
            if (peso <= 44) {
            return "S. Ligeiro";
        } else if (peso > 44 && peso <=48) {
            return "Ligeiro";
        } else if (peso > 48 && peso <= 52) {
            return "M. Leve";
        } else if (peso > 52 && peso <= 57) {
            return "Leve";
        } else if (peso > 57 && peso <= 63) {
            return "M. médio";
        } else if (peso > 63 && peso <= 70) {
            return "Médio";
        } else if (peso > 70 && peso <= 78) {
            return "M. Pesado";
        } else if(peso > 78){
            return "Pesado";
        } else {
            return "";
        }
    }
  }
    
}
    
