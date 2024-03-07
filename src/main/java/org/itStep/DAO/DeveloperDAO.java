package org.itStep.DAO;

import org.itStep.Model.Developer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DeveloperDAO implements BaseEntity<Developer, Integer> {

    List<Developer> developers = new ArrayList<>(
            List.of(new Developer(1, "Jack WW", "09123", "jack@gmail.com", "jack.ua", "Jack"),
                    new Developer(2, "Bob RR", "09234", "bob@gmail.com", "bob.ua", "Bob"),
                    new Developer(3, "Rob HH", "09173", "rob@gmail.com", "rob.com", "Rob"),
                    new Developer(4, "Ivan PP", "068141", "ivan@gmail.com", "ivan.com", "Ivan")
            )
    );

    @Override
    public void save(Developer developer) {
developers.add(developer);
    }

    @Override
    public void update(Developer developer) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<Developer> getAll() {
        return developers;
    }

    @Override
    public Developer getById(Integer integer) {
        return null;
    }
    public Developer getByPib(String phone) {
        for (Developer developer : developers) {
            if (developer.getPhone().equals(phone)) {
                return developer;
            }
        }
        return null;
    }

}
