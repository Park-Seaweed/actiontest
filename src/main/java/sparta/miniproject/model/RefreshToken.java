package sparta.miniproject.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@NoArgsConstructor
@Table(name = "refresh_token")
@Entity
public class RefreshToken {

    @Id

    @Column(name = "RTKEY")
    private String key;
    @Column(name = "RTVALUE")

    private String value;

    public RefreshToken updateValue(String token) {
        this.value = token;
        return this;
    }

    @Builder
    public RefreshToken(String key, String value) {
        this.key = key;
        this.value = value;
    }
}