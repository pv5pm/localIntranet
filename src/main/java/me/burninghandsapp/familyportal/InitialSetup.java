package me.burninghandsapp.familyportal;


import me.burninghandsapp.familyportal.models.User;
import me.burninghandsapp.familyportal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialSetup implements CommandLineRunner {

    final
    UserRepository userRepository;

    @Value("${azure.adminUserName}")
    private String adminUserName;



    @Autowired
    public InitialSetup(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count()==0)
        {
            var initialUser  = new User(adminUserName,"user","user");
            initialUser.setRole("admin");
            initialUser.setEnabled(true);
            userRepository.save(initialUser);

        }
    }
}
