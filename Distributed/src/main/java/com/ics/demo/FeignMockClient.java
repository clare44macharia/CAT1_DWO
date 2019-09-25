/*
package com.ics.demo;

import com.ics.demo.groupaspring.models.Appointment;
import com.ics.demo.groupaspring.models.AppointmentDto;
import com.ics.demo.groupaspring.models.Student;
import com.ics.demo.groupaspring.models.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "name" ,url = "http://localhost:2000")
public interface FeignMockClient {

    @RequestMapping(method = {RequestMethod.POST},value = {"students"})
    Student registerStudent(@RequestBody Student var1);

 //   @RequestMapping(method = {RequestMethod.GET},value = {"/students"})
   Student findById(@RequestParam(name="studentNumber") String var1);

  //  @RequestMapping(method = {RequestMethod.GET},value = {"/lecturers"})
   // List<Teacher> getAllTeachers();

    @RequestMapping(method = {RequestMethod.POST},value ={"/appointments"} )
    AppointmentDto createAppointment(@RequestBody AppointmentDto var1);

    @RequestMapping(method={RequestMethod.PATCH},value = {"/appointments/{id}"})
    Appointment confirmAppointment(@PathVariable(name = "id") Long var1,@RequestParam(name = "studentId") Long var2);


}
*/
