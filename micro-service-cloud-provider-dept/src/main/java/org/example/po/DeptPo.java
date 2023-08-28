package org.example.po;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DEPT")
public class DeptPo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
