import sun.misc.IOUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;



/**
 * Created by Olga Pavlova on 5/12/2016.
 */
@Path("/ExampleResource")
public class ExampleResource {
    private static final String TEXTFILE_PATH = "project.log";
    private static final String IMAGEFILE_PATH = "CLIerrorMsg.jpg";
    private static final String PDFFILE_PATH = "gaenselieselstrasse_projektinfo.pdf";
    private static final String EXCELFILE_PATH = "EXCEL_Example.XLSX";


    @GET
    @Path("/text") //   /ExampleResource/text
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getTextFile() {

        InputStream in = this.getClass().getResourceAsStream(TEXTFILE_PATH);
        Response.ResponseBuilder response = Response.ok(in, MediaType.APPLICATION_OCTET_STREAM);
        response.header("Content-Disposition", "attachment; filename=\"" + TEXTFILE_PATH + "\"");
        return response.build();

    }


    @GET
    @Path("/image")  //   /ExampleResource/image
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getImageFile() {

        InputStream in = this.getClass().getResourceAsStream(IMAGEFILE_PATH);

        Response.ResponseBuilder response = Response.ok(in, MediaType.APPLICATION_OCTET_STREAM);
        response.header("Content-Disposition",
                "attachment; filename=\"" + IMAGEFILE_PATH + "\"");
        return response.build();

    }


    @GET
    @Path("/pdf") //  /ExampleResource/pdf
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getPDFFile() {

        InputStream in = this.getClass().getResourceAsStream(PDFFILE_PATH);

        Response.ResponseBuilder response = Response.ok(in, MediaType.APPLICATION_OCTET_STREAM);
        response.header("Content-Disposition",
                "attachment; filename=\"" + PDFFILE_PATH + "\"");
        return response.build();

    }


    @GET
    @Path("/excel") //   /ExampleResource/excel
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getExcelFile() {

        InputStream in = this.getClass().getResourceAsStream(EXCELFILE_PATH);

        Response.ResponseBuilder response = Response.ok(in, MediaType.APPLICATION_OCTET_STREAM);
        response.header("Content-Disposition",
                "attachment; filename=\"" + EXCELFILE_PATH + "\"");
        return response.build();

    }

}