package com.walter.demo;

import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private TaskRuntime taskRuntime;

	@Test
	public void contextLoads() {
		taskRuntime.create(
				TaskPayloadBuilder.create()
						.withName("First Team Task")
						.withDescription("This is something really important")
						.withCandidateGroup("activitiTeam")
						.withPriority(10)
						.build());
	}

}
