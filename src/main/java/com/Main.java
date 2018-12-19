package com;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        List<ProjectDto> list = client.target("http://localhost:8080/demo")
                .path("projects").request(MediaType.APPLICATION_JSON).get(new GenericType<List<ProjectDto>>() {});
        list.stream().forEach(System.out::println);
    }
}
