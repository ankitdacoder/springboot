package io.firstspringbootapp.topic;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public topic getTopic(@PathVariable String id)
	{
		return topicService.getToipc(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody topic tp)
	{
		 topicService.addTopic(tp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updatetopics")
	public void updateTopic(@RequestBody topic tp)
	{   
		 topicService.updateTopic(tp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{   
		 topicService.deleteTopic(id);
	}
	

}
