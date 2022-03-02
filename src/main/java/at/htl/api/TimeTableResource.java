package at.htl.api;

import at.htl.models.TableET;
import at.htl.models.TimeTable;
import at.htl.workloads.student.TimeTableService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("api/timetable")
public class TimeTableResource {

    @Inject
    private TimeTableService timeTableService;

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        var tt = this.timeTableService.get(id);
        if (tt == null) {
            return Response.status(400).build();
        }
        return Response.ok(tt).build();
    }

    @POST
    public Response add(TimeTable tt) {
        timeTableService.add(tt);
        return Response.ok().build();
    }

    @DELETE
    public Response remove(Long id) {
        timeTableService.remove(id);
        return Response.ok().build();
    }

}

