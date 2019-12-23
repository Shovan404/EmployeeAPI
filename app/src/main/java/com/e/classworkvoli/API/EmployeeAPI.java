package com.e.classworkvoli.API;

import com.e.classworkvoli.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees();

    @GET("employee/{empID}")
    Call<Employee> getEmployeeID(@Path("empID") int  empID);

    @PUT("employee/{empID}")
    Call<Void> updateEmployee(@Path("empID") int empID, @Body Employee)
}
