package com.nazeem.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Provincia")
public class Provincia {
	@Id
	private String id;
	private String nombre;
	private String codigo;
}
