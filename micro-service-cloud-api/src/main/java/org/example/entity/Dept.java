package org.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long id;
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
