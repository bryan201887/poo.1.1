/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline;

import cursosonline.Dao.EstudiantesDao;
import cursosonline.Dao.estudiantesDaoImp;
import cursosonline.entidades.Estudiantes;

/**
 *
 * @author DELL
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Ingresar
        //CursoDao  cursoD = new cursoDaoImp();
        /*Curso cursos=new Curso(0,"Mantemiendo de computadora 2");
        cursoD.ingresar(cursos);*/
        //Actualizar
         /*Curso cursos1=new Curso(3,"redes de computadora");
        cursoD.actualizar(cursos1);*/
        // Eliminar 
        //Curso cursos2=new Curso(6,"Expresion oral");
        //cursoD.eliminar(6);
      EstudiantesDao  estuD = new estudiantesDaoImp();
       // Estudiantes estudiantes=new Estudiantes(0,"david","olvera","dolv@gmail.com");
        //estuD.ingresarE(estudiantes);
        //Actualizar
         /*Estudiantes estu1=new Estudiantes(1,"andrade17@hotmail.com");
        estuD.actualizarE(estu1);*/
        // Eliminar 
        //Estudiantes estudiantes=new Estudiantes1,"carlos","andrade","carlos17@gmail.com");
          //estuD.eliminarE(1);
          
          
          /*for (Curso e : cursoD.getCursos()){
            System.out.println(e.getId() + "-" + e.getNombre());*/
            
            
            
          for (Estudiantes r : estuD.getEstudiantes()){
            System.out.println(r.getId() + "-" + r.getNombre()+ "-"+ r.getApellido()+ "-" + r.getEmail());
    }
    }  
}
