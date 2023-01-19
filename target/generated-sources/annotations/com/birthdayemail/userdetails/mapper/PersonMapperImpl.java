package com.birthdayemail.userdetails.mapper;

import com.birthdayemail.userdetails.entity.PersonEntity;
import com.birthdayemail.userdetails.model.Person;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-19T12:48:35+0530",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Eclipse Adoptium)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonEntity modelToEntity(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setFirstName( person.getFirstName() );
        personEntity.setLastName( person.getLastName() );
        personEntity.setBloodGroup( person.getBloodGroup() );
        personEntity.setMobileNumber( person.getMobileNumber() );
        personEntity.setEmailId( person.getEmailId() );
        personEntity.setDayMonth( person.getDayMonth() );

        return personEntity;
    }

    @Override
    public Person entityToModel(PersonEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        Person person = new Person();

        person.setFirstName( personEntity.getFirstName() );
        person.setLastName( personEntity.getLastName() );
        person.setBloodGroup( personEntity.getBloodGroup() );
        person.setMobileNumber( personEntity.getMobileNumber() );
        person.setEmailId( personEntity.getEmailId() );
        person.setDayMonth( personEntity.getDayMonth() );

        return person;
    }
}
