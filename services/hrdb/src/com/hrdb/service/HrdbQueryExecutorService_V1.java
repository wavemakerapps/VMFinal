/*Generated by WaveMaker Studio*/
package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Date;

import com.hrdb.models.query.InsertQueryUserRequest;
import com.hrdb.models.query.InsertQuesryEmployeeRequest;
import com.hrdb.models.query.InsertQuesryVacationRequest;

@Deprecated
public interface HrdbQueryExecutorService_V1 {

    @Deprecated
    public int executeInsertQuesryEmployee(Integer empId, String lastname, String firstname, String username, String password, String street, String city, String state, String zip, Date birthdate, Integer tenantId);

    @Deprecated
    public int executeInsertQuery_User(String username, String password, String role, Integer tenantId);

    @Deprecated
    public int executeInsertQuesryVacation(Integer id, Date startDate, Date endDate, Integer empId, Integer tenantId, String status, String typecol);

}