package com.jozzias.outboxpatternconsumer.model;


    import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
    import lombok.*;

    import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "book")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    private String title;

    private LocalDateTime year;

    private boolean publicDomain;

}


