/**
 * 
 */
package br.com.oncast.codechallenge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.event.LoggingEventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;

/**
 * @author eduardobregaida
 * 
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.brasilct.codechallenge.domain")
public class PersistenceConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "codechallenge-db";
	}

	@Override
	public Mongo mongo() throws Exception {
		// mongodb://codechallenge-dbuser:codechallenge12@ds041367.mongolab.com:41367/codechallenge-db
		final Mongo mongo = new Mongo("ds041367.mongolab.com", 41367);
		mongo.setWriteConcern(WriteConcern.SAFE);
		return mongo;
	}

	@Override
	protected UserCredentials getUserCredentials() {
		final UserCredentials credentials = new UserCredentials("codechallenge-dbuser", "codechallenge12");
		return credentials;
	}

	@Override
	protected String getMappingBasePackage() {
		return "br.com.brasilct.codechallenge.domain";
	}

	@Bean
	public LoggingEventListener loggingEventListener() {
		return new LoggingEventListener();
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), getDatabaseName(),getUserCredentials());
	}

}
