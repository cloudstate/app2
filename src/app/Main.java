package app;

import static fi.iki.elonen.NanoHTTPD.Response.Status.OK;

import java.io.IOException;

import fi.iki.elonen.NanoHTTPD;

public final class Main extends NanoHTTPD {

    public Main() throws IOException {
        super(8080);
        start(SOCKET_READ_TIMEOUT, false);
    }

    public static void main(final String[] args) throws IOException {
        System.out.println("Starting NanoHTTPD");
        new Main();
    }

    @Override
    public Response serve(final IHTTPSession session) {
        return newFixedLengthResponse(OK, "application/json", "[{\"id\":\"1\"}]");
    }

}
