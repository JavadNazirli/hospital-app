package org.example.doctor.entity;

import lombok.*;
import org.example.common.model.enums.Branches;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
  private Long id;
  private String firstName;
  private String lastName;
  private Branches branch;
  private String email;
  private String phone;
  private String roomNumber;
  private boolean isActive;
  private LocalDateTime createdAt;
}
