package com.madjava.micro.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;

import com.madjava.micro.service.DatabaseVersionService;

public class DatabaseVersionServiceImpl implements DatabaseVersionService {
	@Autowired
	private DataSource dataSource;

	@Override
	public List<String> listVersionHistory(String siteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDatabase(String[] siteIds) {

		for (String site : siteIds) {
			Map<String, String> placeMap = new HashMap<>();
			placeMap.put("tanent", "_" + site);
			if ("base".equals(site)) {
				placeMap.put("tanent", "");
			}
			Flyway flyway = Flyway.configure().dataSource(dataSource).table("schema_history_" + site)
					.placeholderPrefix("_${").placeholderSuffix("}").baselineOnMigrate(true).placeholders(placeMap)
					.locations("db/migration").baselineOnMigrate(true).load();
			flyway.migrate();
		}

		return true;
	}

	@Override
	public List<String> getSiteList() {
		// TODO Auto-generated method stub
		return null;
	}

}
