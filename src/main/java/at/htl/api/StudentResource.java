package at.htl.api;

import at.htl.workloads.student.StudentService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
}
