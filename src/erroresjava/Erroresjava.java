
package erroresjava;
import java.util.*;
public class Erroresjava {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        
        System.out.println("Ingrese valor real");
        double vr = x.nextDouble();
        System.out.println("Ingrese valor aproximado");
        double va = x.nextDouble();
        Errores e1=new Errores(vr,va);
        System.out.println("Error Absoluto: "+e1.ErrorAbsoluto()); 
        System.out.println("Error Relativo: "+e1.ErrorRelativo());
        System.out.println("Error Relativo Porcentual: "+e1.ErrorRelativoPorcentual());
        
        
    }
    
}
class Errores{
    private double ValorReal,ValorAproximado;
    public Errores(double a1,double b1){
        ValorReal=a1; 
        ValorAproximado=b1; 
    }
    public double ErrorRelativo(){
        return ErrorAbsoluto()/getValorReal();
    }
    public double ErrorAbsoluto(){
        return Math.abs(getValorReal()-getAproximado());
    }
    public double ErrorRelativoPorcentual(){
        return ErrorRelativo()*100;
    }
    public void setValorReal(double a1){
        ValorReal=a1;
    }
    public void setValorAproximado(double b1){
        ValorAproximado=b1;
    }
    public double getValorReal(){
        return ValorReal;
    }
    public double getAproximado(){
        return ValorAproximado;
    }
        
}
