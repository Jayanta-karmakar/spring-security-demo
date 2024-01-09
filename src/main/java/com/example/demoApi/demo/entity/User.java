package com.example.demoApi.demo.entity;

import jakarta.persistence.Table;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigInteger;
import java.util.Collection;

/**
 * @author : jayantakarmakar
 * @mail : jayantakarmakar998@mail.com
 * @created : 10/01/24, Wednesday
 **/

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_user", schema = "")
public class User implements UserDetails {
    private BigInteger id;
    private String userName;
    private String email;
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
