package module.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="urls")
@Data
public class Url {
    @Id

    private UUID id;
    private String orignalURL;
    private String URLShort;
    private int countClick;

}
