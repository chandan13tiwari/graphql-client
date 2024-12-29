package com.poc.graphql_client.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Subject {
    private Integer id;
    private Integer studentId;
    private String subjectName;
    private Integer marks;
    private String teacherName;
}
