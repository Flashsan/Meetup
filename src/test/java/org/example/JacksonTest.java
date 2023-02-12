package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.Meetup;


public class JacksonTest {

//    ObjectMapper objectMapper = new ObjectMapper();
//
//    @Test
//    public void pojoToJsonString() throws JsonProcessingException {
//        Meetup meetup = new Meetup(1, "Java Developer");
//
//        String json = objectMapper.writeValueAsString(meetup);
//        System.out.println(json);
//    }

//    @Test
//    public void jsonStringToPojo() throws JsonProcessingException {
//        String meetupJson = "{\n" +
//                " \"id\":\"1\",\n" +
//                " \"name\":\"Python Developer\",\n" +
//                "}";
//
//        Meetup meetup = objectMapper.readValue(meetupJson, Meetup.class);
//
//        assertThat(meetup.getId()).isEqualTo(1);
//    }
}
