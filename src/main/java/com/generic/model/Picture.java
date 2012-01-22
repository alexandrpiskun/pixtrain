package com.generic.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "pixtrain_picture")
@XmlRootElement(name = "picture")
public class Picture implements Serializable {

    String id;
    String name;
    String link;

    @XmlElement(name = "id")
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "link")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
