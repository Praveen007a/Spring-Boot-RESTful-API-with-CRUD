package com.crudapp.projectcrud.Topic;

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
	TopicService topicService; 
	
	@RequestMapping("/topics")
	public List<Topic> getAlltopics() {
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	@RequestMapping(value="/topics",method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		 topicService.addTopic(topic);
	}
	@RequestMapping(value="/topics/{id}",method=RequestMethod.PUT)
	public void update(@RequestBody Topic topic,@PathVariable String id) {
		 topicService.updateTopic(topic,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void delete(@PathVariable String id) {
		
	}
}
