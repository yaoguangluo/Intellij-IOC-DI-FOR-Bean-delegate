package redisDAOImpl;
import redisDAO.RedisDAO;
import org.springframework.stereotype.Service;
//import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import iluwatar.event.UserCreatedEvent;
import iluwatar.handler.UserCreatedEventHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import common.HibernateUtil;
import entity.Lolroler;
import entity.User;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Service
public class RedisDAOImpl implements RedisDAO {

	@Autowired
	private StringRedisTemplate redisTemplate;
	@Override
	public String getValueByKey(String key)
	{
		return redisTemplate.opsForValue().get(key);
	}
}