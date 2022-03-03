package at.htl.api;

import at.htl.models.TableET;
import at.htl.workloads.student.StudentTableService;
import at.htl.workloads.student.TableService;
import at.htl.workloads.student.TeacherService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("api/table")
public class TableResource {

    @Inject
    TableService tableService;

    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Long id) {
        var table = this.tableService.get(id);
        if (table == null) {
            return Response.status(400).build();
        }
        return Response.ok(table).build();
    }

    @POST
    public Response add(TableET tableET) {
        tableService.add(tableET);
        return Response.ok().build();
    }

    @DELETE
    public Response remove(Long id) {
        tableService.remove(id);
        return Response.ok().build();
    }
}
