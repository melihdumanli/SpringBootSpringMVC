package com.melihdumanli.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto implements Serializable {
    private static final long serialVersionUID = -7886808705198749227L;

    private int id;
    private String name;
    private String surname;

}
