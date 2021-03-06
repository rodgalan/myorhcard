package org.happyhome.myorchard.tasks.application;

import java.util.Date;

public class CreateTaskCommand {
  private final String name;
  private final String description;
  private final Date date;

  public CreateTaskCommand(String name, String description, Date date) {
    this.name = name;
    this.description = description;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Date getDate() {
    return date;
  }
}
