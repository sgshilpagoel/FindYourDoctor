package com.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Insurance;

public class InsuranceDB {
	public static ArrayList<Insurance> getInsuranceList(int groupNumber) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "select * from insurance where groupNumber ="+groupNumber;
        System.out.println((query));

        try {
            java.sql.Connection con = Connection.getConnection(query);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            System.out.println("step 1 executed");
            Insurance ins = new Insurance();
            ArrayList<Insurance> insList = new ArrayList();
            while (rs.next()) {
               
            	ins.setGroupNumber(rs.getString("groupNumber"));
            	ins.setHealthcare_provider(rs.getString("healthcare_provider"));
            	ins.setHospitalName(rs.getString("hospitalName"));
            	ins.setAddress(rs.getString("address"));
            	insList.add(ins);
            }
        	//ps.close();
        	//con.close();
            return insList;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

}
