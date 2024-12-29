package com.poc.graphql_client.service;

import com.poc.graphql_client.client.StudentClient;
import com.poc.graphql_client.dto.Student;
import com.poc.graphql_client.dto.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraphqlCLientService {

    @Autowired
    private StudentClient studentClient;

    public List<Subject> fetchSubjectByStudentId(int id) {
        List<Subject> subjects = studentClient.fetchSubjectByStudentId(id);
        System.out.println(subjects);
        return subjects;
    }
}
