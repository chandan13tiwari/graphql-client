package com.poc.graphql_client.controller;

import com.poc.graphql_client.dto.Student;
import com.poc.graphql_client.dto.Subject;
import com.poc.graphql_client.service.GraphqlCLientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphqlClient")
public class GraphQLClientController {

    @Autowired
    GraphqlCLientService service;

    @GetMapping("/studentId/{id}")
    public List<Subject> fetchSubjectByStudentId(@PathVariable("id") int id) {
        return service.fetchSubjectByStudentId(id);
    }
}
