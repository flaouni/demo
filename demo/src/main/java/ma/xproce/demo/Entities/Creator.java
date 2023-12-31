package ma.xproce.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Creator {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    @OneToMany(
            mappedBy = "Creator",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Video> videoList;
}
