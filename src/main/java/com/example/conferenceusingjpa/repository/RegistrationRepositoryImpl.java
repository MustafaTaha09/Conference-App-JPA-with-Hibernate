package com.example.conferenceusingjpa.repository;

import com.example.conferenceusingjpa.model.Registration;
import com.example.conferenceusingjpa.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext //there is auto wiring behind the scenes
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration){
        entityManager.persist(registration);

        return registration; //we changed it to return a registration because e7na 3ayzen nemskoh 34an npasseh fel RegistrationService
                            // along with the course. 5od balak hena e7na bnbassy by reference.
    }

    @Override
    public List<Registration> findAll() {
        // it knows that the object r is a Registration object because we said from Registration.
        // note that it has to be spelled exactly like the class Name "Registration"
        // This is called JPQL. Java Persistence Query Language
        List<Registration> registrations = entityManager.createQuery("Select r from Registration r").getResultList();


        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        // Projection is better when using this type of queries because if we had 10 registrations then the query will be run 10 times.
        //this is a projection query
        String jpql= "Select new com.example.conferenceusingjpa.model.RegistrationReport (r.name, c.name, c.description)" +
                " from Registration r, Course c where r.id = c.registration.id";
        List<RegistrationReport> registrationReports = entityManager.createQuery(jpql).getResultList();


        return registrationReports;
    }

}
