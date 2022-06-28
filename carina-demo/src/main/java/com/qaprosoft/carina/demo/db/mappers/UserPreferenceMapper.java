package com.qaprosoft.carina.demo.db.mappers;

import com.qaprosoft.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);

}
