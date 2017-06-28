package restServiceImpl;
import java.util.Date;
import java.util.List;

import hbntDAO.SelectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restService.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

	@Autowired
	private SelectDAO selectDAO;
	@Override
	public void testSample(int id) {
		// TODO Auto-generated method stub
		selectDAO.selectTableById(id);
	}

	
}