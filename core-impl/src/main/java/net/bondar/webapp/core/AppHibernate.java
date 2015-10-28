package net.bondar.webapp.core;

import net.bondar.webapp.api.model.ContactDto;
import net.bondar.webapp.dao.ContactDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Azeral on 28.10.2015.
 */
public class AppHibernate {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ContactDao contactDao = context.getBean(ContactDao.class);
        ContactDto contactDto = new ContactDto();
        contactDto.setFirstName("Ivan");
        contactDto.setLastName("Ivanov");
        contactDto.setBirthDate(LocalDate.of(1990, Month.APRIL, 12));
        System.out.println(contactDao.create(contactDto));

        context.stop();
    }
}
