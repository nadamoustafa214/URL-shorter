package module.entity;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlDto {
    private long id;
    private String orignal_URL;
    private String URL_short;
    private int count_click;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime deleted_at;
    private boolean is_deleted;
}
