package br.com.project.webmovies.routes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@JacksonStdImpl
@SpringBootApplication
public class MovieOmdb {

	@JsonProperty("Title")
	private String title;
	@JsonProperty("Year")
	private  String year;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
