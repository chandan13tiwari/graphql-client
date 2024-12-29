package com.poc.graphql_client.client;

import com.poc.graphql_client.config.GraphQLConfig;
import com.poc.graphql_client.dto.Student;
import com.poc.graphql_client.dto.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentClient {

    @Autowired
    GraphQLConfig graphQLConfig;

    public List<Subject> fetchSubjectByStudentId(int studentId) {
        String query = String.format("""
                query GetSubjectsByStudentId {
                     getSubjectsByStudentId(studentId: %s) {
                         studentId
                         subjectName
                         marks
                     }
                 }
                """, studentId);

        return graphQLConfig.graphQlClient().document(query)
                .retrieve("getSubjectsByStudentId")
                .toEntityList(Subject.class).block();
    }
}
