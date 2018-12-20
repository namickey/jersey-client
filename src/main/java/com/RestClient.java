package com;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class RestClient {
    public List<ProjectDto> getProjectList(){

        Client client = ClientBuilder.newClient();
        List<ProjectDto> list = client.target("http://localhost:8080/demo")
                .path("projects").request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<ProjectDto>>() {});

        list.stream().forEach(System.out::println);

        return list;
    }
}
