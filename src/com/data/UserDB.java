package com.data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.model.User;
import com.model.*;
public class UserDB {
    public static String registerUser(User user) {
        //ResultSet rs = null;
        PreparedStatement ps = null;
        String query = "Insert into users(firstName,lastName,email,contact,password) values('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getEmail()+"','"+user.getContact()+"','"+user.getPassword()+"')";
        System.out.println((query));
        try {
        	java.sql.Connection con = Connection.getConnection(query);
            ps = con.prepareStatement(query);
            int rs = ps.executeUpdate();
        	if(rs != 0){
            return "success";
        	}
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
		return null;
    }
    
    public static User getUser(String email, String password) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "select * from users where email ='"+email+"' and password ='"+password+"'"
        		+ "";
        System.out.println((query));
        try {
        	java.sql.Connection con = Connection.getConnection(query);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            User user = new User();;
            while (rs.next()) {
               
                user.setUserId(rs.getInt("userId"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
            }
            return user;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
    public static ArrayList<Dashboard> getDashboardList(int userID) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "select ua.doctorID, ua.userID, status, concat(d.firstName,' ',d.lastName) as doctorName,availDate,availTime,d.hostpitalName as hospitalName,hostpitalAddress  as hospitalAddress,d.specialization from userappointment ua inner join availability a  on ua.availID = a.availID inner join doctor d on d.doctorID = ua.doctorID where ua.userId ="+userID;
        System.out.println((query));
        try {
        	java.sql.Connection con = Connection.getConnection(query);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            Dashboard dashboard = new Dashboard();
            ArrayList<Dashboard> dashboardList = new ArrayList<>();
            while (rs.next()) {
               
            	dashboard.setUserID(rs.getInt("userId"));
            	dashboard.setDoctorID(rs.getInt("doctorId"));
            	dashboard.setDoctorName(rs.getString("doctorName"));
            	dashboard.setStatus(rs.getString("status"));
            	dashboard.setAvailDate(rs.getString("availDate"));
            	dashboard.setAvailTime(rs.getString("availTime"));
            	dashboard.setHospitalName(rs.getString("hospitalName"));
            	dashboard.setHospitalAddress(rs.getString("hospitalAddress"));
            	dashboard.setSpecialization(rs.getString("specialization"));
            	dashboardList.add(dashboard);
            }
            return dashboardList;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
