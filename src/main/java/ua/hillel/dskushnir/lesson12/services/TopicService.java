package ua.hillel.dskushnir.lesson12.services;

import ua.hillel.dskushnir.lesson12.dao.staticDao.TopicDaoImpl;
import ua.hillel.dskushnir.lesson12.interfaces.TopicDao;
import ua.hillel.dskushnir.lesson12.model.Topic;




public class TopicService {
    private static TopicDao topicDao = new TopicDaoImpl() ;
    public static Topic saveAllTopic(Topic topic) {
        Integer id = topic.getId();
        String description=topic.getDescription();

        return topicDao.create(topic);
    }


}



