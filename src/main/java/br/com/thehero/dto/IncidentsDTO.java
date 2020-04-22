package br.com.thehero.dto;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IncidentsDTO {

  @JsonProperty("id")
  private String id;

  @JsonProperty("title")
  @NotNull
  private String title;

  @JsonProperty("description")
  @NotNull
  private String description;

  @JsonProperty("value")
  @NotNull
  private String value;

  public IncidentsDTO(@NotNull String title, @NotNull String description, @NotNull String value,
      String id) {
    this.title = title;
    this.description = description;
    this.value = value;
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
