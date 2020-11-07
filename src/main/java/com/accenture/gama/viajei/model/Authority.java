package com.accenture.gama.viajei.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;


@Entity(name = "authorities")
public class Authority  implements GrantedAuthority{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final String PK = "id" ;
    public static final String FK = "authority_id" ;

    @Id
    @Column(name = PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String authority;

    public Authority(Long id, @NotNull String authority) {
        this.id = id;
        this.authority = authority;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public static String getPk() {
        return PK;
    }

    public static String getFk() {
        return FK;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Authority [authority=" + authority + ", id=" + id + "]";
    }
}
