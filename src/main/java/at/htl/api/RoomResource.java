package at.htl.api;

import at.htl.models.RoomET;
import at.htl.models.Student;
import at.htl.workloads.student.RoomService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("api/room")
public class RoomResource {

    @Inject
    RoomService roomService;

    @GET
    @Path("all")
    public Response getAll(){
        var allRoom = this.roomService.getAll();
        return Response.ok(allRoom).build();
    }

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        var room = this.roomService.get(id);
        if (room == null) {
            return Response.status(400).build();
        }
        return Response.ok(room).build();
    }

    @POST
    public Response add(RoomET room) {
        roomService.add(room);
        return Response.ok().build();
    }

    @DELETE
    public Response remove(Long id) {
        roomService.remove(id);
        return Response.ok().build();
    }

}
