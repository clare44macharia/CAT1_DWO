package com.ics.demo;

import com.ics.demo.groupaspring.models.Appointment;
import com.ics.demo.groupaspring.models.AppointmentDto;
import com.ics.demo.groupaspring.models.CompanyDto;
import com.ics.demo.groupaspring.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "client", url = "http://10.51.10.111:2000")

public interface FeignBoss {
    @RequestMapping(method = {RequestMethod.POST},value = {"students"})
    Student registerStudent(@RequestBody Student student);

  @RequestMapping(
        method = {RequestMethod.GET},
           value = {"students"}
    )
   Student findById(@RequestParam(name = "studentNumber") String var1);

    @RequestMapping(
            method = {RequestMethod.POST},
            value = {" companies/{companyId}/attachment"}
    )

    CompanyDto requestAttachment(@RequestBody CompanyDto var1);






   // @RequestMapping(method = {RequestMethod.POST},value ={"appointments"} )
  //  Appointment createAppointment(@RequestBody AppointmentDto appointmentDto);

   // @RequestMapping(method={RequestMethod.PATCH},value = {"appointments/{id}"})
   // Appointment confirmAppointment(@PathVariable Long id, @RequestParam Long studentId);



}
