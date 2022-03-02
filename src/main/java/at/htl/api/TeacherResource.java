package at.htl.api;

import at.htl.workloads.student.TeacherService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("api/teacher")
public class TeacherResource {

    @Inject
    TeacherService teacherService;

    @GET
    @Path("all")
    public Response getAll() {
        var allTeachers = this.teacherService.getAll();
        return Response.ok(allTeachers).build();
    }

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        var teacher = this.teacherService.get(id);
        if (teacher == null) {
            return Response.status(400).build();
        }
        return Response.ok(teacher).build();
    }
}
