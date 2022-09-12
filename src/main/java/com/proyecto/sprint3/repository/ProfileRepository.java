package com.proyecto.sprint3.repository;

import com.proyecto.sprint3.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository <Profile, String > {
}
