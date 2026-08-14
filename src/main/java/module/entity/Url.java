package module.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="urls")
@Data
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="orignal_url")
    private String orignalURL;
    @Column(unique = true,name = "short_url")
    private String URLShort;
    @Column(name="count_click")
    private int countClick;
    @UpdateTimestamp
    public LocalDateTime updated_at;
    @Timestamp
    public LocalDateTime deleted_at;
    @CreationTimestamp
    @Column(updatable = false)
    public  LocalDateTime created_at;
    @Column(name="is_deleted")
    private boolean isDeleted=false;

}
