package at.htl.api;

import at.htl.workloads.student.StudentRepo;
import at.htl.workloads.student.StudentService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("api/student")
public class StudentResource {

    @Inject
    StudentService studentService;

    @GET
    @Path("all")
    public Response getAll(){
        var allStudents = this.studentService.getAll();
        return Response.ok(allStudents).build();
    }

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        var student = this.studentService.get(id);
    if (student == null) {
        return Response.status(400).build();
    }
        return Response.ok(student).build();
    }
}
