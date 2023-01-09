package com.rimair.app.rimair.metier;

import java.util.Optional;

import com.rimair.app.rimair.models.Admin;

public interface AdminMetier {
Optional<Admin> getAdmin(Admin admin);
void saveAdmin(Admin admin);

}
