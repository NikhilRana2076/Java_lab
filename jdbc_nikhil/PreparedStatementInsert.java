/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc_nikhil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Nikhil_Rana
 */
public class PreparedStatementInsert {

    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");

        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter id:");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter name:");
            String name = br.readLine();
            System.out.println("age");
            int age = Integer.parseInt(br.readLine());

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");

            System.out.println("Do you want to continue: y/n");
            String s = br.readLine();
            if (s.startsWith("n")) {
                break;
            }
        } while (true);
        con.close();

    }
}
