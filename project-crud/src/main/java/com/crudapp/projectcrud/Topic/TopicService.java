package com.crudapp.projectcrud.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	TopicRepository topicRepository;

	public List<Topic> topics = new ArrayList<Topic>
	(Arrays.asList(new Topic("java", "spring", "java framework"),
			new Topic("python", "django", "python framework"), new Topic("javaScript", "NodeJS", "js framework")));

	public List<Topic> getAllTopics() {
		List<Topic> t = new ArrayList<Topic>();
		topicRepository.findAll().forEach(t::add);
		return t;
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).orElse(null);
	}
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic,String id) {
		topicRepository.save(topic);
	}
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
