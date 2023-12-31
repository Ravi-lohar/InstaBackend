package com.example.InstaBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer followId;


    @ManyToOne
    @JoinColumn(name = "fk_actual_user")
    User currentUser;

    @ManyToOne
    @JoinColumn(name = "fk_follower_of_actual_user")
    User currentUserFollower;

}
