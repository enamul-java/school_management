package com.erainfotechbd.school_management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "uc_email_address",
                columnNames = {"email_address"}
        )
)
@Builder
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_id_gen",
            sequenceName = "student_id_gen",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_id_gen"
    )
    private Long studentId;

    private String firstName;
    private String lastName;
    @Column(
            name = "email_address",
            nullable = false
    )
    private String studentEmail;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;

}
