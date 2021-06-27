package org.utm.dp.service;

import org.springframework.stereotype.Service;
import org.utm.dp.dao.DataSource;
import org.utm.dp.entity.MultiChoiceAnswer;
import org.utm.dp.entity.MultiChoiceRiddle;
import org.utm.dp.entity.Riddle;
import org.utm.dp.entity.TextRiddle;
import org.utm.dp.entity.decorations.HintDecorator;
import org.utm.dp.utils.RiddleAbstractFactory;
import org.utm.dp.utils.RiddleFactory;

import java.util.Arrays;

@Service
public class RiddleService {

    DataSource dataSource = DataSource.getDataSource();
    RiddleAbstractFactory riddleFactory = new RiddleFactory();

    public void populateWithRiddles() {
        Riddle firstRiddle = riddleFactory.getRiddle("text", new TextRiddle.TextRiddleBuilder()
                .setId(1L)
                .setDescription("VGhlIGFuc3dlciBpcyBpbiB5b3VyIGx1bmdz")
                .setCorrectAnswer("air")
                .setOrder(1)
        );
        dataSource.addRiddle(firstRiddle);

        Riddle secondRiddle = riddleFactory.getRiddle("text", new TextRiddle.TextRiddleBuilder()
                .setId(2L)
                .setDescription("Enigma said zinzh qamtl hahxb xutia sqdja")
                .setCorrectAnswer("gandalf")
                .setOrder(2)
        );
        dataSource.addRiddle(secondRiddle);

        Riddle thirdRiddle = riddleFactory.getRiddle("multi", new MultiChoiceRiddle.MultiChoiceRiddleBuilder()
                .setId(3L)
                .setDescription("Nblzz aol jpwoly")
                .setOrder(3)
                .setChoices(Arrays.asList(new MultiChoiceAnswer("jhlzhy", true),
                                new MultiChoiceAnswer("cpnluèyl", false),
                                new MultiChoiceAnswer("zobnivyvbno", false))
                )
        );
        dataSource.addRiddle(thirdRiddle);

        Riddle fourthRiddle = riddleFactory.getRiddle("text", new TextRiddle.TextRiddleBuilder()
                .setId(4L)
                .setDescription("You shall not pass")
                .setOrder(4)
                .setCorrectAnswer("123456")
        );

        HintDecorator hintDecorator = new HintDecorator(fourthRiddle, "Unless you know the password");
        hintDecorator.decorateRiddle();

        dataSource.addRiddle(fourthRiddle);
    }

    public boolean callTestClone() {
        return dataSource.testClone();
    }

}
