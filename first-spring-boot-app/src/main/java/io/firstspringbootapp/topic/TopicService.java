package io.firstspringbootapp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<topic> topics = new ArrayList(Arrays.asList(

			new topic("Spring", "Spring MVC Framework", "Spring learn"),
			new topic("Angular JS", "Angular MVC Framework", "Angular learn")

	));

	public List<topic> getAllTopics() {
		return topics;
	}

	public topic getToipc(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(topic tp) {
		topics.add(tp);

	}

	public void updateTopic(topic tp) {

		for (int i = 0; i < topics.size(); i++) {
			tp = topics.get(i);
			if (tp.getId().equals(tp.getId())) {
				topics.set(i, tp);
			}
		}

	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
