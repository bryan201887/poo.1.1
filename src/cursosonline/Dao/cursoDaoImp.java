/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.Dao;

import cursosonline.Conection;
import cursosonline.entidades.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class cursoDaoImp  implements CursoDao{

   @Override
    public List<Curso> getCursos() {
       List<Curso> cursos=new ArrayList<>();
       Connection conn;
        try {
           conn = Conection.conector();
           String sql="select id, nombre from public.cursos;";
           PreparedStatement stm= conn.prepareStatement(sql);
           ResultSet rs=stm.executeQuery();
           while(rs.next()){
               Curso curso =new Curso(rs.getInt(1), rs.getString(2));
               cursos.add(curso);
               

                       }
        
      }catch (SQLException ex) {
            
              ex.printStackTrace();
         }
        return cursos;
    }

    @Override
    public void ingresar(Curso cursos) {
     try {
            Conection conexion = new Conection();
            Connection conn = null;
            conn = Conection.conector();
            String sql = "INSERT INTO  public.cursos(nombre) values (?);";
            PreparedStatement psta = conn.prepareStatement(sql);
            psta.setString(1, cursos.getNombre());
            psta.execute();
         
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    

    @Override
    public void actualizar(Curso cursos) {
      try {
            Conection conexion = new Conection();
            Connection conn = null;
            conn =Conection.conector();
            String sqlinsertar = "Update  public.cursos set nombre=? where id=?";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, cursos.getNombre());
            psta.setInt(2, cursos.getId());
            psta.execute();
            
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @Override
    public void eliminar(int id) {
    try {
            Conection coneccion = new Conection();
            Connection conn = null;
            conn = Conection.conector();
            String sqldelete = "Delete From  public.cursos where id=?";
            PreparedStatement psta = conn.prepareStatement(sqldelete);
            psta.setInt(1, id);
            psta.execute();
           // conn.commit();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
}
