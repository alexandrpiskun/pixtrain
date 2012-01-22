package com.generic.model.endpoint;

import com.generic.model.Picture;
import com.generic.model.dao.PictureDao;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Path("/picture")
@Component
public class PictureEndpoint {

	@Autowired
	private PictureDao  picturesDao;
	
	@GET
	@Produces("application/json")
	public List<Picture> getFundList() {
	    return picturesDao.getAllPictures();
	};
	
}
